package com.xiaodao.system.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xiaodao.feign.system.entity.SysNotice;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;




/**
 * @description ISysNotice Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Validated
public interface ISysNoticeService {

    /**
     * 新增
     * @param sysNotice
     * @return int
     */
    int insert(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 带有空值判断的新增
     * @param sysNotice
     * @return int
     */
    int insertSelective(@NotNull(message = "参数不能为空") SysNotice sysNotice);


    /**
     * 批量插入
     * @param list
     * @return int
     */
    int batchInsert(@Size(min = 1, message = "参数不能为空") List<SysNotice> list);

    /**
     * 带有空值判断的批量插入
     * @param list
     * @return int
     */
    int batchInsertSelective(@Size(min = 1, message = "参数不能为空") List<SysNotice> list);

    /**
     * 根据主键更新
     * @param sysNotice
     * @return int
     */
    int updateByPrimaryKey(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 带有空值判断的主键更新
     * @param sysNotice
     * @return int
     */
    int updateSelectiveByPrimaryKey(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 批量更新
     * @param list
     * @return int
     */
    int batchUpdate(@Size(min = 1, message = "参数不能为空") List<SysNotice> list);

    /**
     * 带有空值判断的批量更新
     * @param list
     * @return int
     */
    int batchUpdateSelective(@Size(min = 1, message = "参数不能为空") List<SysNotice> list);


    /**
     * 更新插入
     * @param sysNotice
     * @return int
     */
    int upsert(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 带有空值判断的更新插入
     * @param sysNotice
     * @return int
     */
    int upsertSelective(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 批量更新插入
     * @param list
     * @return int
     */
    int batchUpsert(@Size(min = 1, message = "参数不能为空") List<SysNotice> list);

    /**
     * 带有空值判断的批量更新插入
     * @param list
     * @return int
     */
    int batchUpsertSelective(@Size(min = 1, message = "参数不能为空") List<SysNotice> list);


    /**
     * 通过主键删除
     * @param noticeId
     * @return int
     */

    int deleteByPrimaryKey(@NotNull(message = "参数不能为空") Integer noticeId);

    /**
     * 通过主键批量删除
     * @param list
     * @return int
     */
    int deleteBatchByPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件删除
     * @param sysNotice
     * @return int
     */
    int delete(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 通过主键查询
     * @param  noticeId
     * @return SysNotice sysNotice
     */
    SysNotice queryByPrimaryKey(@NotNull(message = "参数不能为空") Integer noticeId);

    /**
     * 通过主键批量查询
     * @param list
     * @return List<SysNotice>
     */
    List<SysNotice> queryBatchPrimaryKeys(@Size(min = 1, message = "参数不能为空") List<Integer> list);

    /**
     * 条件查询一个
     * @param sysNotice
     * @return List<SysNotice>
     */
    SysNotice queryOne(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 条件查询
     * @param sysNotice
     * @return List<SysNotice>
     */
    List<SysNotice> queryByCondition(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 模糊查询
     * @param sysNotice
     * @return List<SysNotice>
     */
    List<SysNotice> queryFuzzy(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 模糊条件查询
     * @param sysNotice
     * @return List<SysNotice>
     */
    List<SysNotice> queryByLikeCondition(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 条件查询数量
     * @param sysNotice
     * @return int
     */
    int queryCount(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 分组统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroup(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 日统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByDay(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 月统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByMonth(@NotNull(message = "参数不能为空") SysNotice sysNotice);

    /**
     * 年统计
     * @param sysNotice
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> statisticsGroupByYear(@NotNull(message = "参数不能为空") SysNotice sysNotice);


}