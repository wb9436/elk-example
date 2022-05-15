package com.ivan.elk.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 测试任务
 *
 * @author WuBing
 * @date 2022-05-15 12:20
 */
@Slf4j(topic = "task_log")
@Component
public class TestTask {

    @Scheduled(fixedRate = 5 * 1000)
    public void testTask() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = LocalDateTime.now().format(formatter);
        log.info("测试任务执行了：当前系统时间 {}", time);
    }

}
