package com.tr.springboot.postgresql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author taorun
 * @date 2023/2/3 14:55
 */
public class Test {

    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\time-insert-50w.sql"));
            for (int i = 1; i <= 10 * 10000; i++) {
                out.write("insert into user values (" + i + ", 'name');\n");
            }
            out.close();
            System.out.println("文件写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
