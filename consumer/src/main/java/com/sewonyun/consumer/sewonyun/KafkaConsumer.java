package com.sewonyun.consumer.sewonyun;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class KafkaConsumer {

    private CountDownLatch latch = new CountDownLatch(3);

    public CountDownLatch partitionLatch = new CountDownLatch(2);

    private CountDownLatch filterLatch = new CountDownLatch(2);

    private CountDownLatch greetingLatch = new CountDownLatch(1);

    @KafkaListener(topics = "topic-1", containerFactory = "kafkaListenerContainerFactory", groupId = "11")
    void listener(String message) {
        System.out.println(message);
        latch.countDown();
    }

}
