package com.zzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author: 赵智超
 * @date: 2023/07/05/21:50
 * @Description:
 */
@SpringBootApplication
//@ServletComponentScan
public class swaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(swaggerApplication.class,args);
    }
}
