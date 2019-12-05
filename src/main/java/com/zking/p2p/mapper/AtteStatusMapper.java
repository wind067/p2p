package com.zking.p2p.mapper;

import com.zking.p2p.model.AtteStatus;

public interface AtteStatusMapper {
    int deleteByPrimaryKey(Long asid);

    int insert(AtteStatus record);

    int insertSelective(AtteStatus record);

    AtteStatus selectByPrimaryKey(Long asid);

    int updateByPrimaryKeySelective(AtteStatus record);

    int updateByPrimaryKey(AtteStatus record);
}