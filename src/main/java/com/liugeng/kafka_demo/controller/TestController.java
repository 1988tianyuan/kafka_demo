package com.liugeng.kafka_demo.controller;

import com.liugeng.kafka_demo.producer.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private KafkaSender sender;
    @Value("${spring.kafka.template.default-topic}")
    private String testTopic;

    @GetMapping("/test")
    public String test(){
        sender.send(testTopic, "这是测试数据！");
        return "成功！";
    }

}
