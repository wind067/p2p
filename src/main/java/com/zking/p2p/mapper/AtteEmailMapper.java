package com.zking.p2p.mapper;

import com.zking.p2p.model.AtteEmail;

public interface AtteEmailMapper {
    int deleteByPrimaryKey(Long aeid);

    int insert(AtteEmail record);

    int insertSelective(AtteEmail record);

    AtteEmail selectByPrimaryKey(Long aeid);

    int updateByPrimaryKeySelective(AtteEmail record);

    int updateByPrimaryKey(AtteEmail record);
}