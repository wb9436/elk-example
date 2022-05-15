package com.ivan.elk.controller;

import com.alibaba.fastjson.JSONObject;
import com.ivan.elk.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * hello
 *
 * @author WuBing
 * @date 2022-05-15 12:07
 */
@Slf4j(topic = "hello_log")
@RestController
public class HelloController {

    @Value("v1.0.5")
    private String version;

    @RequestMapping("/hello")
    public Result hello(HttpServletRequest request) {
        log.info("收到客户端请求：{} 当前版本 {}", request, version);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = LocalDateTime.now().format(formatter);

        JSONObject data = new JSONObject();
        data.put("curTime", time);
        data.put("addr", request.getLocalAddr());
        Result result = Result.success().data(data);
        log.info("返回响应：{}", data.toJSONString());
        return result;
    }


}
