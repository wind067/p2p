package com.zking.p2p.mapper;

import com.zking.p2p.model.FinBorrow;

public interface FinBorrowMapper {
    int deleteByPrimaryKey(Long fbid);

    int insert(FinBorrow record);

    int insertSelective(FinBorrow record);

    FinBorrow selectByPrimaryKey(Long fbid);

    int updateByPrimaryKeySelective(FinBorrow record);

    int updateByPrimaryKey(FinBorrow record);
}