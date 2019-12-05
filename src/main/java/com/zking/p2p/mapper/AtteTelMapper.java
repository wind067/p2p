package com.zking.p2p.mapper;

import com.zking.p2p.model.AtteTel;

public interface AtteTelMapper {
    int deleteByPrimaryKey(Long atid);

    int insert(AtteTel record);

    int insertSelective(AtteTel record);

    AtteTel selectByPrimaryKey(Long atid);

    int updateByPrimaryKeySelective(AtteTel record);

    int updateByPrimaryKey(AtteTel record);
}