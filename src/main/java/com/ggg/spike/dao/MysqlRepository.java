package com.ggg.spike.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlRepository {

    @Select("SELECT Use_leap_seconds FROM time_zone WHERE Time_zone_id=#{id}")
    String getResult(@Param("id") Integer id);

}
