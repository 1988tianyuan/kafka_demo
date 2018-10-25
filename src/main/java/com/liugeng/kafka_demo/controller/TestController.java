package com.liugeng.kafka_demo.controller;

import java.util.Collections;
import java.util.concurrent.ExecutionException;

import com.liugeng.kafka_demo.model.Nrn;
import com.liugeng.kafka_demo.model.ResourceData;
import com.liugeng.kafka_demo.model.code.resourcedata.DataTypeCode;
import com.liugeng.kafka_demo.model.code.resourcedata.EventTypeCode;
import com.liugeng.kafka_demo.model.code.resourcedata.ResultTypeCode;
import com.liugeng.kafka_demo.model.code.resourcedata.SourceTypeCode;
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
    public String test() throws ExecutionException, InterruptedException {
        String nrn = Nrn.constructNrn("Server", "KR", "2942", "server/7449");
        ResourceData resourceData = new ResourceData(nrn, "testResource", "2222", "delete", ResultTypeCode.SUCCESS,
            EventTypeCode.UPDATE, "Running", Collections.EMPTY_LIST, 1533081600L, SourceTypeCode.API, "10.0.0.1", "update Server success",
            DataTypeCode.SECURE_DATA, "");
        return sender.send(testTopic, resourceData);
    }

}
