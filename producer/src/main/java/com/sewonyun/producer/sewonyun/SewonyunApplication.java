package com.sewonyun.producer.sewonyun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;

@EnableKafka
@SpringBootApplication
public class SewonyunApplication {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private KafkaAdmin kafkaAdmin;

    public static void main(String[] args) {
        SpringApplication.run(SewonyunApplication.class, args);
    }

    @Scheduled(fixedRate = 1000) // 1초마다 메시지 전송
    public void sendMessage() {
        kafkaTemplate.send("topic-1", "Hello Kafka!");
        System.out.println("Sent message: " + "Hello Kafka!");
    }

}
