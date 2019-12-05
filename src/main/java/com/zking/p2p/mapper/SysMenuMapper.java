package com.zking.p2p.mapper;

import com.zking.p2p.model.SysMenu;

public interface SysMenuMapper {
    int deleteByPrimaryKey(Long smid);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long smid);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}