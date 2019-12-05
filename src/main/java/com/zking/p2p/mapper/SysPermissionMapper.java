package com.zking.p2p.mapper;

import com.zking.p2p.model.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long spid);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long spid);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}