package com.ggg.spike.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlRepository {

    @Select("SELECT name FROM user WHERE id=#{id}")
    String getUserName(@Param("id") Integer id);
}
