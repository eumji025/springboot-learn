package com.eumji.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableKafka
@EnableScheduling
public class SpringbootKafkaDemoApplication {

    @KafkaListener(id = "demoId",topics = "mydemo")
    public void consumeMessage(ConsumerRecord<String,String> consumerRecord){
        System.out.println("consume the message:" +consumerRecord.value());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaDemoApplication.class, args);
    }
}
