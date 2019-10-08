package com.ssm.template.dao;

import com.ssm.template.pojos.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
@Repository
public interface TestDAO {
    User getUser(@Param("userId") String id);
}
