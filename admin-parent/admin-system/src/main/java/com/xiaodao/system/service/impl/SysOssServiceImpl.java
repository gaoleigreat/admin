package com.xiaodao.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.xiaodao.system.mapper.SysOssMapper;
import com.xiaodao.system.service.ISysOssService;
import com.xiaodao.system.entity.SysOss;

import java.util.List;


/**
 * @description ISysOss Service层
 * @author ¸ßÀÚ
 * @since jdk1.8
 */
@Service
public class SysOssServiceImpl implements ISysOssService{


     @Autowired
     private SysOssMapper sysOssMapper;

    /**
     * 创建SysOss
     *
     * @param sysOss
     * @return
     */
    @Override
    public Integer insert(SysOss sysOss){
        if(sysOss ==null){
            return 0;
        }
        return sysOssMapper.insert(sysOss);
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
        Integer result = sysOssMapper.deleteById(id);
        return result;

    }

    /**
     * 修改SysOss
     *
     * @param sysOss
     * @return
    */
    @Override
    public Integer updateByPrimaryKey(SysOss sysOss){
        if(sysOss ==null){
            return 0;
        }
        return sysOssMapper.updateById(sysOss);
    }

    /**
    * 根据主键查询
    *
    * @param id
    * @return
    */
    @Override
    public SysOss selectByPrimaryKey(Long id){
        if(id ==null){
            return null;
        }
        SysOss sysOss  = sysOssMapper.selectById(id);
        if (sysOss == null){
            return null;
        }
        return sysOss;
    }

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param sysOss SysOss
     * @return IPage<SysOss>
     */
    @Override
    public IPage<SysOss> queryPage(int pageIndex, int pageSize,SysOss sysOss){
        QueryWrapper<SysOss> queryWrapper = Wrappers.query();
        IPage<SysOss> ipage = sysOssMapper.selectPage(new Page(pageIndex, pageSize), queryWrapper);
        return ipage;
    }

    /**
    * 批量插入
    * @param list List<SysOss
    * @return Integer
    */
    @Override
    public Integer batchInsert(List<SysOss> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysOssMapper.batchInsert(list);
        }
    }

    /**
     * 批量更新
     * @param list List<SysOss>
     * @return Integer
     */
    @Override
    public Integer batchUpdate(List<SysOss> list){
        if (CollectionUtils.isEmpty(list)){
            return 0;
        }
        else{
            return sysOssMapper.batchUpdate(list);
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
            return sysOssMapper.deleteBatchIds(list);
        }
    }
    /**
     * 存在即更新
     * @param sysOss SysOss
     * @return Integer
     */
    @Override
    public Integer upsert(SysOss sysOss){

        if (sysOss == null){
            return 0;
        }
        else{
            return sysOssMapper.upsert(sysOss);
        }

    }

    /**
     * 存在即更新，可选择具体属性
     * @param sysOss SysOss
     * @return Integer
     */
    @Override
    public Integer upsertSelective(SysOss sysOss){
        if (sysOss == null){
            return 0;
        }
        else{
            return sysOssMapper.upsert(sysOss);
        }
    }

    /**
     * 条件查询
     * @param sysOss SysOss
     * @return List<SysOss>
    */
    @Override
    public List<SysOss> query(SysOss sysOss){
        if (sysOss == null){
            return null;
        }
        else{
            return sysOssMapper.query(sysOss);
        }
    }

    /**
     * 查询总数
     * @return Integer
     */
    @Override
    public Long queryTotalCount(){
        return sysOssMapper.queryTotalCount();
    }
}