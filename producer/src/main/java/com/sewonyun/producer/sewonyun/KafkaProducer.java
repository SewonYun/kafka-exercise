package com.sewonyun.producer.sewonyun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class KafkaProducer {

    private final KafkaTemplate<String, Double> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate<String, Double> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, Double message) {
        kafkaTemplate.send(topic, message);
    }

}
