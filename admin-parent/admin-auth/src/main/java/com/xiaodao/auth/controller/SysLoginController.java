package com.xiaodao.auth.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.xiaodao.auth.service.AccessTokenService;
import com.xiaodao.auth.service.SysLoginService;
import com.xiaodao.auth.vo.LoginBean;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.admin.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

/**
 * @Author gaolei
 * @Date 2019/11/24 22:47
 * @Version 1.0
 */
@RequestMapping("/sys_login_controller")
@Api(value = "登录", tags = "登录")
@RestController
public class SysLoginController {

    @Autowired
    private Producer producer;
    @Autowired
    private SysLoginService sysLoginService;

    @Autowired
    private AccessTokenService tokenService;


    @ApiOperation(value = "验证码", notes = "验证码")
    @GetMapping("captcha.jpg")
    public void captcha(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        // 生成文字验证码
        String text = producer.createText();
        // 生成图片验证码
        BufferedImage image = producer.createImage(text);
        // 保存到验证码到 session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }


    /**
     * 登录接口
     */
    @PostMapping(value = "/login")
    @ApiOperation(value = "登录", notes = "登录")
    public RespVO login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
        String username = loginBean.getAccount();
        String password = loginBean.getPassword();
        String captcha = loginBean.getCaptcha();
        // 从session中获取之前保存的验证码跟前台传来的验证码进行匹配
        Object kaptcha = request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (kaptcha == null) {
            return RespVOBuilder.failure("验证码已失效");
        }
        if (!captcha.equals(kaptcha)) {
            return RespVOBuilder.failure("验证码不正确");
        }
        SysUser user = sysLoginService.login(username,password);
        Map<String, Object> token = tokenService.createToken(user);
        return RespVOBuilder.success(token);
    }



    @PostMapping("logout")
    public RespVO logout(HttpServletRequest request) {
        String token = request.getHeader("token");
        SysUser user = tokenService.queryByToken(token);
        if (null != user) {
            sysLoginService.logout(user.getLoginName());
            tokenService.expireToken(user.getUserId());
        }
        return RespVOBuilder.success();
    }

}
