package com.msb.yeb.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.msb.yeb.server.mapper")
public class YebServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(YebServerApplication.class,args);
    }
}
