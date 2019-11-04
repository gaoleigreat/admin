package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysTestMapper;
import com.xiaodao.system.service.ISysTestService;
import com.xiaodao.system.entity.SysTest;

import java.util.List;


/**
 * @description ISysTest Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysTestServiceImpl implements ISysTestService{


     @Autowired
     private SysTestMapper sysTestMapper;

    /**
     * 创建SysTest
     *
     * @param sysTest
     * @return
     */
    @Override
    public Integer insert(SysTest sysTest){
        if(sysTest ==null){
            return 0;
        }
        return sysTestMapper.insert(sysTest);
    }


    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long id){
        if(id ==null){
            return 0;
        }
        Integer result = sysTestMapper.deleteById(id);
        return result;

    }

    /**
     * 修改SysTest
     *
     * @param sysTest
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysTest sysTest){
        if(sysTest ==null){
            return 0;
        }
        return sysTestMapper.updateById(sysTest);
    }

    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    @Override
    public SysTest selectByPrimaryKey(Long id){
        if(id ==null){
            return null;
        }
        SysTest sysTest  = sysTestMapper.selectById(id);
        if (sysTest == null){
            return null;
        }
        return sysTest;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysTest SysTest
     * @return IPage<SysTest>
     */
    @Override
    public IPage<SysTest> queryPage(int pageIndex, int pageSize,SysTest sysTest){
        QueryWrapper<SysTest> queryWrapper = Wrappers.query();
        IPage<SysTest> ipage = sysTestMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysTest
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysTest> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysTestMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysTest>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysTest> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysTestMapper.batchUpdate(list);
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
            return sysTestMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysTest SysTest
     * @return Integer
     */
    @Override
    public Integer upsert(SysTest sysTest){

        if (sysTest == null){
            return 0;
        }
        else{
            return sysTestMapper.upsert(sysTest);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysTest SysTest
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysTest sysTest){
        if (sysTest == null){
            return 0;
        }
        else{
            return sysTestMapper.upsert(sysTest);
        }
    }

    /**
     * 条件查询
     * @param sysTest SysTest
     * @return List<SysTest>
    */
    @Override
    public List<SysTest> query(SysTest sysTest){
        if (sysTest == null){
            return null;
        }
        else{
            return sysTestMapper.query(sysTest);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysTestMapper.queryTotalCount();
    }
}