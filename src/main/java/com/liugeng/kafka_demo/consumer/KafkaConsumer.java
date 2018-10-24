package com.liugeng.kafka_demo.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Value("${spring.kafka.template.default-topic}")
    private String topic;

    @KafkaListener(topics = "test-topic")
    public void receive(String resourceData){
        System.out.println("收到消息：" + resourceData);
    }

}
