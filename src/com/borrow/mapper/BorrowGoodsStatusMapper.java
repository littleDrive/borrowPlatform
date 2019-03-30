package com.borrow.mapper;

import com.borrow.pojo.BorrowGoodsStatus;
import com.borrow.pojo.BorrowGoodsStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowGoodsStatusMapper {
    int countByExample(BorrowGoodsStatusExample example);

    int deleteByExample(BorrowGoodsStatusExample example);

    int deleteByPrimaryKey(String id);

    int insert(BorrowGoodsStatus record);

    int insertSelective(BorrowGoodsStatus record);

    List<BorrowGoodsStatus> selectByExample(BorrowGoodsStatusExample example);

    BorrowGoodsStatus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BorrowGoodsStatus record, @Param("example") BorrowGoodsStatusExample example);

    int updateByExample(@Param("record") BorrowGoodsStatus record, @Param("example") BorrowGoodsStatusExample example);

    int updateByPrimaryKeySelective(BorrowGoodsStatus record);

    int updateByPrimaryKey(BorrowGoodsStatus record);
}