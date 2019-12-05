package com.zking.p2p.mapper;

import com.zking.p2p.model.FinAccrual;

public interface FinAccrualMapper {
    int deleteByPrimaryKey(Long faid);

    int insert(FinAccrual record);

    int insertSelective(FinAccrual record);

    FinAccrual selectByPrimaryKey(Long faid);

    int updateByPrimaryKeySelective(FinAccrual record);

    int updateByPrimaryKey(FinAccrual record);
}