package com.zking.p2p.mapper;

import com.zking.p2p.model.UsrLogin;

public interface UsrLoginMapper {
    int deleteByPrimaryKey(Long ulid);

    int insert(UsrLogin record);

    int insertSelective(UsrLogin record);

    UsrLogin selectByPrimaryKey(Long ulid);

    int updateByPrimaryKeySelective(UsrLogin record);

    int updateByPrimaryKey(UsrLogin record);
}