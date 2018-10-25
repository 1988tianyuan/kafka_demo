package com.liugeng.kafka_demo.producer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.liugeng.kafka_demo.model.ResourceData;

@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public String send(String topic, Object resourceData) throws ExecutionException, InterruptedException {
        Future future = kafkaTemplate.send(topic, resourceData);
        return future.get().toString();
    }
}
