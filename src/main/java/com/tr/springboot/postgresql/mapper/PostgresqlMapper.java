package com.tr.springboot.postgresql.mapper;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresqlMapper {

    @Insert("insert into emq_message values (#{id}, now(), 'msg')")
    void insertEmqMessage(Integer id);

}
