package com.zking.p2p.mapper;

import com.zking.p2p.model.SysLoginRoles;

public interface SysLoginRolesMapper {
    int deleteByPrimaryKey(Long slrid);

    int insert(SysLoginRoles record);

    int insertSelective(SysLoginRoles record);

    SysLoginRoles selectByPrimaryKey(Long slrid);

    int updateByPrimaryKeySelective(SysLoginRoles record);

    int updateByPrimaryKey(SysLoginRoles record);
}