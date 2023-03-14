package com.tr.springboot.postgresql.controller;

import com.tr.springboot.postgresql.mapper.PostgresqlMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author taorun
 * @date 2023/2/3 11:46
 */
@RestController
public class PostgresqlController {

    @Resource
    private PostgresqlMapper postgresqlMapper;

    @GetMapping("/test/springboot/performance/{num}")
    public String testSpringBootPerformance(@PathVariable Integer num) {
        int index = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            index = i;
        }
        return "SpringBoot 性能：执行 for 循环 " + num + "次，耗时：" + (System.currentTimeMillis() - start) + " ms " + index;
    }

    @GetMapping("/test/insert/performance/{insertNum}")
    public String testInsertPerformance(@PathVariable Integer insertNum) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= insertNum; i++) {
            postgresqlMapper.insertEmqMessage(i);
        }
        return "Postgresql-insert 性能：insert " + insertNum + "条，耗时：" + (System.currentTimeMillis() - start) + " ms";
    }

}
