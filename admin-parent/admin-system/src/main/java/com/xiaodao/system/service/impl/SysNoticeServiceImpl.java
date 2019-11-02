package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysNoticeMapper;
import com.xiaodao.system.service.ISysNoticeService;
import com.xiaodao.system.entity.SysNotice;

import java.util.List;


/**
 * @description ISysNotice Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysNoticeServiceImpl implements ISysNoticeService{


     @Autowired
     private SysNoticeMapper sysNoticeMapper;

    /**
     * 创建SysNotice
     *
     * @param sysNotice
     * @return
     */
    @Override
    public Integer insert(SysNotice sysNotice){
        if(sysNotice ==null){
            return 0;
        }
        return sysNoticeMapper.insert(sysNotice);
    }


    /**
     * 根据主键删除
     *
     * @param noticeId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long noticeId){
        if(noticeId ==null){
            return 0;
        }
        Integer result = sysNoticeMapper.deleteById(noticeId);
        return result;

    }

    /**
     * 修改SysNotice
     *
     * @param sysNotice
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysNotice sysNotice){
        if(sysNotice ==null){
            return 0;
        }
        return sysNoticeMapper.updateById(sysNotice);
    }

    /**
    * 根据主键查询
    *
    * @param noticeId
    * @return
    */
    @Override
    public SysNotice selectByPrimaryKey(Long noticeId){
        if(noticeId ==null){
            return null;
        }
        SysNotice sysNotice  = sysNoticeMapper.selectById(noticeId);
        if (sysNotice == null){
            return null;
        }
        return sysNotice;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysNotice SysNotice
     * @return IPage<SysNotice>
     */
    @Override
    public IPage<SysNotice> queryPage(int pageIndex, int pageSize,SysNotice sysNotice){
        QueryWrapper<SysNotice> queryWrapper = Wrappers.query();
        IPage<SysNotice> ipage = sysNoticeMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysNotice
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysNotice> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysNoticeMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysNotice>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysNotice> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysNoticeMapper.batchInsert(list);
        }
    }

    /**
     * 批量删除
     * @param list List<Long >
     * @return Integer
    */
    public Integer deleteBatchIds(List<Long> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        } else{
            return sysNoticeMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysNotice SysNotice
     * @return Integer
     */
    @Override
    public Integer upsert(SysNotice sysNotice){

        if (sysNotice == null){
            return 0;
        }
        else{
            return sysNoticeMapper.upsert(sysNotice);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysNotice SysNotice
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysNotice sysNotice){
        if (sysNotice == null){
            return 0;
        }
        else{
            return sysNoticeMapper.upsert(sysNotice);
        }
    }

    /**
     * 条件查询
     * @param sysNotice SysNotice
     * @return List<SysNotice>
    */
    @Override
    public List<SysNotice> query(SysNotice sysNotice){
        if (sysNotice == null){
            return null;
        }
        else{
            return sysNoticeMapper.query(sysNotice);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysNoticeMapper.queryTotalCount();
    }
}