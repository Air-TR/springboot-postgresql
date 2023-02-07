package com.tr.springboot.postgresql.mapper;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresqlMapper {

    @Insert("insert into emq_message(time, message) values (now(), 'msg')")
    void insertEmqMessage();

}
