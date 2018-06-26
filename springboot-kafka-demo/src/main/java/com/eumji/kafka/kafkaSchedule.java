package com.eumji.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @description: write some thing of this file
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 2018-06-18-6-27
 */
@Component
public class kafkaSchedule {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Scheduled(fixedDelay = 1500L)
    public void sendKafkaMessage(){
        String message = "hello kafka, now is "+DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now());
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("mydemo", message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("kafka error send message: "+ message);
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.println("kafka send message: "+ message);
            }
        });
    }
}
