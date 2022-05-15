package com.ivan.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author WuBing
 * @date 2022-05-15 12:05
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
public class ElkExampleApplication {

    public static void main(String[] args) {
        log.info("elk example starting ...");
        SpringApplication.run(ElkExampleApplication.class, args);
    }

}
