package com.zking.p2p.mapper;

import com.zking.p2p.model.UsrRelation;

public interface UsrRelationMapper {
    int deleteByPrimaryKey(Long urid);

    int insert(UsrRelation record);

    int insertSelective(UsrRelation record);

    UsrRelation selectByPrimaryKey(Long urid);

    int updateByPrimaryKeySelective(UsrRelation record);

    int updateByPrimaryKey(UsrRelation record);
}