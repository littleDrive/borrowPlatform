package com.borrow.mapper;

import com.borrow.pojo.WishGoodsStatus;
import com.borrow.pojo.WishGoodsStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WishGoodsStatusMapper {
    int countByExample(WishGoodsStatusExample example);

    int deleteByExample(WishGoodsStatusExample example);

    int deleteByPrimaryKey(String id);

    int insert(WishGoodsStatus record);

    int insertSelective(WishGoodsStatus record);

    List<WishGoodsStatus> selectByExample(WishGoodsStatusExample example);

    WishGoodsStatus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WishGoodsStatus record, @Param("example") WishGoodsStatusExample example);

    int updateByExample(@Param("record") WishGoodsStatus record, @Param("example") WishGoodsStatusExample example);

    int updateByPrimaryKeySelective(WishGoodsStatus record);

    int updateByPrimaryKey(WishGoodsStatus record);
}