package com.sewonyun.producer.sewonyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableKafka
@SpringBootApplication
public class SewonyunApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SewonyunApplication.class, args);
        KafkaProducer producer = context.getBean(KafkaProducer.class);
        producer.sendMessage("topic-1", "hello test topic");
    }

}
