package com.liugeng.kafka_demo.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.liugeng.kafka_demo.model.ResourceData;

@Component
public class KafkaConsumer {

    @Value("${spring.kafka.template.default-topic}")
    private String topic;

    @KafkaListener(topics = "test-topic")
    public void receive(ResourceData resourceData){
        System.out.println("收到消息：" + resourceData);

        System.out.println("nrn是：" + resourceData.getNrn());
        System.out.println("resourceName是：" + resourceData.getResourceName());
        System.out.println("resultTypeCode是：" + resourceData.getResultTypeCode());
    }

}
