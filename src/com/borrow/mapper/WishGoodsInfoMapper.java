package com.borrow.mapper;

import com.borrow.pojo.WishGoodsInfo;
import com.borrow.pojo.WishGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WishGoodsInfoMapper {
    int countByExample(WishGoodsInfoExample example);

    int deleteByExample(WishGoodsInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(WishGoodsInfo record);

    int insertSelective(WishGoodsInfo record);

    List<WishGoodsInfo> selectByExampleWithBLOBs(WishGoodsInfoExample example);

    List<WishGoodsInfo> selectByExample(WishGoodsInfoExample example);

    WishGoodsInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WishGoodsInfo record, @Param("example") WishGoodsInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") WishGoodsInfo record, @Param("example") WishGoodsInfoExample example);

    int updateByExample(@Param("record") WishGoodsInfo record, @Param("example") WishGoodsInfoExample example);

    int updateByPrimaryKeySelective(WishGoodsInfo record);

    int updateByPrimaryKeyWithBLOBs(WishGoodsInfo record);

    int updateByPrimaryKey(WishGoodsInfo record);
}