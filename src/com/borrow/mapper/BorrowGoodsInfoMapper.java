package com.borrow.mapper;

import com.borrow.pojo.BorrowGoodsInfo;
import com.borrow.pojo.BorrowGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowGoodsInfoMapper {
    int countByExample(BorrowGoodsInfoExample example);

    int deleteByExample(BorrowGoodsInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(BorrowGoodsInfo record);

    int insertSelective(BorrowGoodsInfo record);

    List<BorrowGoodsInfo> selectByExampleWithBLOBs(BorrowGoodsInfoExample example);

    List<BorrowGoodsInfo> selectByExample(BorrowGoodsInfoExample example);

    BorrowGoodsInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BorrowGoodsInfo record, @Param("example") BorrowGoodsInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") BorrowGoodsInfo record, @Param("example") BorrowGoodsInfoExample example);

    int updateByExample(@Param("record") BorrowGoodsInfo record, @Param("example") BorrowGoodsInfoExample example);

    int updateByPrimaryKeySelective(BorrowGoodsInfo record);

    int updateByPrimaryKeyWithBLOBs(BorrowGoodsInfo record);

    int updateByPrimaryKey(BorrowGoodsInfo record);
}