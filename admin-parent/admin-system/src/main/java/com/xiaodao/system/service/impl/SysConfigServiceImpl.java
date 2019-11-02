package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysConfigMapper;
import com.xiaodao.system.service.ISysConfigService;
import com.xiaodao.system.entity.SysConfig;

import java.util.List;


/**
 * @description ISysConfig Service层
 * @author 高磊
 * @since jdk1.8
 */
@Service
public class SysConfigServiceImpl implements ISysConfigService{


     @Autowired
     private SysConfigMapper sysConfigMapper;

    /**
     * 创建SysConfig
     *
     * @param sysConfig
     * @return
     */
    @Override
    public Integer insert(SysConfig sysConfig){
        if(sysConfig ==null){
            return 0;
        }
        return sysConfigMapper.insert(sysConfig);
    }


    /**
     * 根据主键删除
     *
     * @param configId
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Long configId){
        if(configId ==null){
            return 0;
        }
        Integer result = sysConfigMapper.deleteById(configId);
        return result;

    }

    /**
     * 修改SysConfig
     *
     * @param sysConfig
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysConfig sysConfig){
        if(sysConfig ==null){
            return 0;
        }
        return sysConfigMapper.updateById(sysConfig);
    }

    /**
    * 根据主键查询
    *
    * @param configId
    * @return
    */
    @Override
    public SysConfig selectByPrimaryKey(Long configId){
        if(configId ==null){
            return null;
        }
        SysConfig sysConfig  = sysConfigMapper.selectById(configId);
        if (sysConfig == null){
            return null;
        }
        return sysConfig;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysConfig SysConfig
     * @return IPage<SysConfig>
     */
    @Override
    public IPage<SysConfig> queryPage(int pageIndex, int pageSize,SysConfig sysConfig){
        QueryWrapper<SysConfig> queryWrapper = Wrappers.query();
        IPage<SysConfig> ipage = sysConfigMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysConfig
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysConfig> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysConfigMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysConfig>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysConfig> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysConfigMapper.batchInsert(list);
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
            return sysConfigMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysConfig SysConfig
     * @return Integer
     */
    @Override
    public Integer upsert(SysConfig sysConfig){

        if (sysConfig == null){
            return 0;
        }
        else{
            return sysConfigMapper.upsert(sysConfig);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysConfig SysConfig
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysConfig sysConfig){
        if (sysConfig == null){
            return 0;
        }
        else{
            return sysConfigMapper.upsert(sysConfig);
        }
    }

    /**
     * 条件查询
     * @param sysConfig SysConfig
     * @return List<SysConfig>
    */
    @Override
    public List<SysConfig> query(SysConfig sysConfig){
        if (sysConfig == null){
            return null;
        }
        else{
            return sysConfigMapper.query(sysConfig);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysConfigMapper.queryTotalCount();
    }
}