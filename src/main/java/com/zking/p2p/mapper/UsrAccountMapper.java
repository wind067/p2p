package com.zking.p2p.mapper;

import com.zking.p2p.model.UsrAccount;

public interface UsrAccountMapper {
    int deleteByPrimaryKey(Long uaid);

    int insert(UsrAccount record);

    int insertSelective(UsrAccount record);

    UsrAccount selectByPrimaryKey(Long uaid);

    int updateByPrimaryKeySelective(UsrAccount record);

    int updateByPrimaryKey(UsrAccount record);
}