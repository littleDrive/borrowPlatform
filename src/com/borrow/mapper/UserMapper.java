package com.borrow.mapper;

import com.borrow.pojo.User;
import com.borrow.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String wechatId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String wechatId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

//   根据id把user中的记录更新为参数record，若record的属性值为空，则保留原来的值
    int updateByPrimaryKeySelective(User record);
//  根据id把user中的记录更新为参数record
    int updateByPrimaryKey(User record);
}