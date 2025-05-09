package com.qh.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * VJApplication
 *
 * @author qian.hu
 * @date 2024/5/15 14:51
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableCaching
public class VJApplication {

    public static void main(String[] args) {
        SpringApplication.run(VJApplication.class, args);
    }
}
