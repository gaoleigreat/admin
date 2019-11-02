package com.xiaodao.system.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.xiaodao.system.entity.SysNotice;


/**
 * @description SysNoticeMapper
 * @author高磊
 * @since jdk1.8
 */
public interface SysNoticeMapper extends BaseMapper<SysNotice>{

    /**
    * 批量插入
    * @param list List<SysNotice
    * @return Integer
    */
    Integer batchInsert(List<SysNotice> list);

    /**
     * 批量更新
     * @param list List<SysNotice>
     * @return Integer
     */
    Integer batchUpdate(List<SysNotice> list);

    /**
     * 存在即更新
     * @param sysNotice SysNotice
     * @return Integer
     */
    Integer upsert(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 存在即更新，可选择具体属性
     * @param sysNotice SysNotice
     * @return Integer
     */
    Integer upsertSelective(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 条件查询
     * @param sysNotice SysNotice
     * @return List<SysNotice>
    */
    List<SysNotice> query(@Param("sysNotice") SysNotice sysNotice);

    /**
     * 查询总数
     * @return Integer
     */
    Long queryTotalCount();


}