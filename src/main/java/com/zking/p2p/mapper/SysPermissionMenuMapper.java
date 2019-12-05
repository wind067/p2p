package com.zking.p2p.mapper;

import com.zking.p2p.model.SysPermissionMenu;

public interface SysPermissionMenuMapper {
    int deleteByPrimaryKey(Long spmid);

    int insert(SysPermissionMenu record);

    int insertSelective(SysPermissionMenu record);

    SysPermissionMenu selectByPrimaryKey(Long spmid);

    int updateByPrimaryKeySelective(SysPermissionMenu record);

    int updateByPrimaryKey(SysPermissionMenu record);
}