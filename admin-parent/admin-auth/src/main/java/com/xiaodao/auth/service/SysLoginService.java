package com.xiaodao.auth.service;

import com.xiaodao.core.constant.Constants;
import com.xiaodao.core.constant.UserConstants;
import com.xiaodao.core.enums.UserStatus;
import com.xiaodao.core.exception.user.UserBlockedException;
import com.xiaodao.core.exception.user.UserDeleteException;
import com.xiaodao.core.exception.user.UserNotExistsException;
import com.xiaodao.core.exception.user.UserPasswordNotMatchException;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.utils.DateUtils;
import com.xiaodao.core.utils.IpUtils;
import com.xiaodao.core.utils.MessageUtils;
import com.xiaodao.core.utils.ServletUtils;
import com.xiaodao.core.utils.security.PasswordUtils;
import com.xiaodao.feign.system.client.SysUserClient;
import com.xiaodao.admin.entity.SysUser;
import com.xiaodao.log.publish.PublishFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author gaolei
 * @Date 2019/11/29 10:11
 * @Version 1.0
 */
@Service
public class SysLoginService {
    @Autowired
    private SysUserClient sysUserClient;


    public SysUser login(String username, String password) {

        // 用户名或密码为空 错误
        if (StringUtils.isAnyBlank(username, password)) {
            PublishFactory.recordLogininfor(username, Constants.LOGIN_FAIL, "userName is null");
            throw new UserNotExistsException();
        }
        // 密码如果不在指定范围内 错误
        if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                || password.length() > UserConstants.PASSWORD_MAX_LENGTH) {
            PublishFactory.recordLogininfor(username, Constants.LOGIN_FAIL,
                    "user.password.not.match");
            throw new UserPasswordNotMatchException();
        }
        // 用户名不在指定范围内 错误
        if (username.length() < UserConstants.USERNAME_MIN_LENGTH
                || username.length() > UserConstants.USERNAME_MAX_LENGTH) {
            PublishFactory.recordLogininfor(username, Constants.LOGIN_FAIL,
                    "user.password.not.match");
            throw new UserPasswordNotMatchException();
        }
        RespVO<SysUser> sysUserRespVO = sysUserClient.selectUserByLoginName(username);
        if (sysUserRespVO.getRetCode() != 1) {
            return null;
        }
        SysUser user = sysUserRespVO.getInfo();

        if (user == null) {
            PublishFactory.recordLogininfor(username, "error", "user.not.exists");
            throw new UserNotExistsException();
        }
        if (UserStatus.DELETED.getCode().equals(user.getDelFlag())) {
            PublishFactory.recordLogininfor(username, "error",
                    "user.password.delete");
            throw new UserDeleteException();
        }
        if (UserStatus.DISABLE.getCode().equals(user.getStatus())) {
            PublishFactory.recordLogininfor(username, "error",
                    MessageUtils.message("user.blocked", user.getRemark()));
            throw new UserBlockedException();
        }

        if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
            PublishFactory.recordLogininfor(username, "error", "user.password.not.match");
            throw new UserPasswordNotMatchException();
        }
        PublishFactory.recordLogininfor(username, "success", "user.login.success");
        recordLoginInfo(user);
        return user;
    }


    public void recordLoginInfo(SysUser user) {
        user.setLoginIp(IpUtils.getIpAddr(ServletUtils.getRequest()));
        user.setLoginDate(DateUtils.getNowDate());
        sysUserClient.updateByPrimaryKey(user);
    }

    public void logout(String loginName) {
        PublishFactory.recordLogininfor(loginName, "logOut", MessageUtils.message("user.logout.success"));
    }


}
