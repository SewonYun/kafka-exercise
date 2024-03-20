package com.sewonyun.consumer.sewonyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

import java.util.concurrent.TimeUnit;

@EnableKafka
@SpringBootApplication
public class SewonyunApplication {

    public static void main(String[] args) throws Exception {
        System.out.println("test main function start");
        ConfigurableApplicationContext context = SpringApplication.run(SewonyunApplication.class, args);
        KafkaConsumer listener = context.getBean(KafkaConsumer.class);
        listener.partitionLatch.await(10, TimeUnit.SECONDS);
        System.out.println("test main function end");
    }

    @Bean
    public KafkaConsumer kafkaConsumer() {
        return new KafkaConsumer();
    }


}
