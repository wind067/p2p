package com.zking.p2p.mapper;

import com.zking.p2p.model.SysDict;

public interface SysDictMapper {
    int deleteByPrimaryKey(Long did);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}