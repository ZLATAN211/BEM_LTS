package com.zlx.demo.dao;

import com.zlx.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Insert("insert into User(uuid,id,url,tem) value(#{uuid},#{id},#{url},#{tme})")
    int insertUser(User User);

    @Select("select*from User wherer id=#{id} and url=#{url} and tme=#{tme}")
    int selectUser(int id,String url,float tme);

    @Select("select*from User where id=#{id}")
    int selectByUserId(int id);

    @Select("select*from User where url=#{url}")
    int selectByUserUrl(String url);

    @Select("select*from User where uuid=#{uuid}")
    int selectByUserUrl(int uuid);

}
