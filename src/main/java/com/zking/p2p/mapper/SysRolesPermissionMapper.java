package com.zking.p2p.mapper;

import com.zking.p2p.model.SysRolesPermission;

public interface SysRolesPermissionMapper {
    int deleteByPrimaryKey(Long srpid);

    int insert(SysRolesPermission record);

    int insertSelective(SysRolesPermission record);

    SysRolesPermission selectByPrimaryKey(Long srpid);

    int updateByPrimaryKeySelective(SysRolesPermission record);

    int updateByPrimaryKey(SysRolesPermission record);
}