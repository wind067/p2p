package com.zking.p2p.mapper;

import com.zking.p2p.model.UsrInfo;

public interface UsrInfoMapper {
    int deleteByPrimaryKey(Long ufid);

    int insert(UsrInfo record);

    int insertSelective(UsrInfo record);

    UsrInfo selectByPrimaryKey(Long ufid);

    int updateByPrimaryKeySelective(UsrInfo record);

    int updateByPrimaryKey(UsrInfo record);
}