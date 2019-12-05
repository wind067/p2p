package com.zking.p2p.mapper;

import com.zking.p2p.model.AtteBank;

public interface AtteBankMapper {
    int deleteByPrimaryKey(Long abid);

    int insert(AtteBank record);

    int insertSelective(AtteBank record);

    AtteBank selectByPrimaryKey(Long abid);

    int updateByPrimaryKeySelective(AtteBank record);

    int updateByPrimaryKey(AtteBank record);
}