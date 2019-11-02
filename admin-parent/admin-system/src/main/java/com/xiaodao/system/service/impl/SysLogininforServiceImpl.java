package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysLogininforMapper;
import com.xiaodao.system.service.ISysLogininforService;
import com.xiaodao.system.entity.SysLogininfor;

import java.util.List;


/**
 * @description ISysLogininfor Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysLogininforServiceImpl implements ISysLogininforService{


     @Autowired
     private SysLogininforMapper sysLogininforMapper;

    /**
     * 创建SysLogininfor
     *
     * @param sysLogininfor
     * @return
     */
    @Override
    public Integer insert(SysLogininfor sysLogininfor){
        if(sysLogininfor ==null){
            return 0;
        }
        return sysLogininforMapper.insert(sysLogininfor);
    }


    /**
     * 根据主键删除
     *
     * @param infoId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long infoId){
        if(infoId ==null){
            return 0;
        }
        Integer result = sysLogininforMapper.deleteById(infoId);
        return result;

    }

    /**
     * 修改SysLogininfor
     *
     * @param sysLogininfor
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysLogininfor sysLogininfor){
        if(sysLogininfor ==null){
            return 0;
        }
        return sysLogininforMapper.updateById(sysLogininfor);
    }

    /**
    * 根据主键查询
    *
    * @param infoId
    * @return
    */
    @Override
    public SysLogininfor selectByPrimaryKey(Long infoId){
        if(infoId ==null){
            return null;
        }
        SysLogininfor sysLogininfor  = sysLogininforMapper.selectById(infoId);
        if (sysLogininfor == null){
            return null;
        }
        return sysLogininfor;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysLogininfor SysLogininfor
     * @return IPage<SysLogininfor>
     */
    @Override
    public IPage<SysLogininfor> queryPage(int pageIndex, int pageSize,SysLogininfor sysLogininfor){
        QueryWrapper<SysLogininfor> queryWrapper = Wrappers.query();
        IPage<SysLogininfor> ipage = sysLogininforMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysLogininfor
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysLogininfor> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysLogininforMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysLogininfor>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysLogininfor> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysLogininforMapper.batchInsert(list);
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
            return sysLogininforMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysLogininfor SysLogininfor
     * @return Integer
     */
    @Override
    public Integer upsert(SysLogininfor sysLogininfor){

        if (sysLogininfor == null){
            return 0;
        }
        else{
            return sysLogininforMapper.upsert(sysLogininfor);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysLogininfor SysLogininfor
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysLogininfor sysLogininfor){
        if (sysLogininfor == null){
            return 0;
        }
        else{
            return sysLogininforMapper.upsert(sysLogininfor);
        }
    }

    /**
     * 条件查询
     * @param sysLogininfor SysLogininfor
     * @return List<SysLogininfor>
    */
    @Override
    public List<SysLogininfor> query(SysLogininfor sysLogininfor){
        if (sysLogininfor == null){
            return null;
        }
        else{
            return sysLogininforMapper.query(sysLogininfor);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysLogininforMapper.queryTotalCount();
    }
}