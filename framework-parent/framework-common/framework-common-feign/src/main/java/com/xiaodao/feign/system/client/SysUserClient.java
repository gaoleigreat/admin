package com.xiaodao.feign.system.client;

import com.github.pagehelper.PageInfo;
import com.xiaodao.config.MultipartSupportConfig;
import com.xiaodao.core.result.RespDataVO;
import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import com.xiaodao.feign.system.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "system-service", path = "/sysUser", fallbackFactory = SysUserClientFallback.class, configuration = MultipartSupportConfig.class)
public interface SysUserClient {


    /**
     * 新增
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/insert")
    RespVO insert(@RequestBody SysUser sysUser);

    /**
     * 带有空值判断的新增
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/insertSelective")
    RespVO insertSelective(@RequestBody SysUser sysUser);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsert")
    RespVO batchInsert(@RequestBody List<SysUser> list);

    /**
     * 带有空值判断的新增
     *
     * @param list
     * @return
     */
    @PostMapping("/batchInsertSelective")
    RespVO batchInsertSelective(@RequestBody List<SysUser> list);

    /**
     * 根据主键更新
     *
     * @param sysUser
     * @return
     */
    @PutMapping("/updateByPrimaryKey")
    RespVO updateByPrimaryKey(@RequestBody SysUser sysUser);

    /**
     * 根据空值判断的主键更新
     *
     * @param sysUser
     * @return
     */
    @PutMapping("/updateSelectiveByPrimaryKey")
    RespVO updateSelectiveByPrimaryKey(@RequestBody SysUser sysUser);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdate")
    RespVO batchUpdate(@RequestBody List<SysUser> list);

    /**
     * 带有空值判断的批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/batchUpdateSelective")
    RespVO batchUpdateSelective(@RequestBody List<SysUser> list);


    /**
     * 更新插入
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/upsert")
    RespVO upsert(@RequestBody SysUser sysUser);

    /**
     * 带有空值判断的更新插入
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/upsertSelective")
    RespVO upsertSelective(@RequestBody SysUser sysUser);


    /**
     * 批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsert")
    RespVO batchUpsert(@RequestBody List<SysUser> list);


    /**
     * 带有空值判断的批量更新插入
     *
     * @param list
     * @return
     */
    @PostMapping("/batchUpsertSelective")
    RespVO batchUpsertSelective(@RequestBody List<SysUser> list);


    /**
     * 通过主键删除
     *
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    RespVO deleteByPrimaryKey(@PathVariable(value = "userId") Long userId);

    /**
     * 通过主键批量删除
     *
     * @param list
     * @return
     */
    @DeleteMapping("/deleteBatchByPrimaryKeys")
    RespVO deleteBatchByPrimaryKeys(@RequestBody List<Long> list);

    /**
     * 条件删除
     *
     * @param sysUser
     * @return
     */
    @DeleteMapping("/delete")
    RespVO delete(@RequestBody SysUser sysUser);

    /**
     * 通过主键查询
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    RespVO<SysUser> queryByPrimaryKey(@PathVariable(value = "userId") Long userId);


    /**
     * 通过主键批量查询
     *
     * @param list
     * @return
     */
    @PostMapping("/queryBatchPrimaryKeys")
    RespVO<RespDataVO<SysUser>> queryBatchPrimaryKeys(@RequestBody List<Long> list);


    /**
     * 条件查询一个
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryOne")
    RespVO<SysUser> queryOne(@RequestBody SysUser sysUser);

    /**
     * 条件查询
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryByCondition")
    RespVO<RespDataVO<SysUser>> queryByCondition(@RequestBody SysUser sysUser);

    /**
     * 条件分页查询
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryPageByCondition")
    RespVO<PageInfo<SysUser>> queryPageByCondition(@RequestBody SysUser sysUser);

    /**
     * 模糊查询
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryFuzzy")
    RespVO<RespDataVO<SysUser>> queryFuzzy(@RequestBody SysUser sysUser);

    /**
     * 模糊分页查询
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryPageFuzzy")
    RespVO<PageInfo<SysUser>> queryPageFuzzy(@RequestBody SysUser sysUser);

    /**
     * 模糊条件查询
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryByLikeCondition")
    RespVO<RespDataVO<SysUser>> queryByLikeCondition(@RequestBody SysUser sysUser);

    /**
     * 模糊分页条件查询
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryPageByLikeCondition")
    RespVO<PageInfo<SysUser>> queryPageByLikeCondition(@RequestBody SysUser sysUser);

    /**
     * 条件查询数量
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/queryCount")
    RespVO<Long> queryCount(@RequestBody SysUser sysUser);

    /**
     * 分组统计
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/statisticsGroup")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(@RequestBody SysUser sysUser);

    /**
     * 日统计
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/statisticsGroupByDay")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(@RequestBody SysUser sysUser);

    /**
     * 月统计
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/statisticsGroupByMonth")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(@RequestBody SysUser sysUser);

    /**
     * 年统计
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/statisticsGroupByYear")
    RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(@RequestBody SysUser sysUser);

    @GetMapping("/selectUserByLoginName")
    RespVO<SysUser> selectUserByLoginName(@RequestParam(value = "userName") String userName);

    @GetMapping("/selectUserByPhoneNumber")
    RespVO<SysUser> selectUserByPhoneNumber(@RequestParam(value = "phoneNumber") String phoneNumber);


    @GetMapping("/selectUserByEmail")
    RespVO<SysUser> selectUserByEmail(@RequestParam(value = "email") String email);

}

class SysUserClientFallback implements SysUserClient {
    @Override
    public RespVO insert(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO insertSelective(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsert(List<SysUser> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchInsertSelective(List<SysUser> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateByPrimaryKey(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO updateSelectiveByPrimaryKey(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdate(List<SysUser> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpdateSelective(List<SysUser> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsert(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO upsertSelective(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsert(List<SysUser> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO batchUpsertSelective(List<SysUser> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteByPrimaryKey(Long userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO deleteBatchByPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO delete(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUser> queryByPrimaryKey(Long userId) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUser>> queryBatchPrimaryKeys(List<Long> list) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUser> queryOne(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUser>> queryByCondition(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUser>> queryPageByCondition(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUser>> queryFuzzy(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUser>> queryPageFuzzy(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<SysUser>> queryByLikeCondition(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<PageInfo<SysUser>> queryPageByLikeCondition(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<Long> queryCount(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroup(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByDay(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByMonth(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<RespDataVO<Map<String, Object>>> statisticsGroupByYear(SysUser sysUser) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUser> selectUserByLoginName(String userName) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUser> selectUserByPhoneNumber(String phoneNumber) {
        return RespVOBuilder.failure("system-service服务不可用");
    }

    @Override
    public RespVO<SysUser> selectUserByEmail(String email) {
        return RespVOBuilder.failure("system-service服务不可用");
    }
}