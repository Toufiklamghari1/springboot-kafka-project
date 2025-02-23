package com.springboot.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @autor Toufik Lamghari
 **/

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "wikimedia-changes", groupId = "myGroup")
    public void consume(String eventMessage) {
        LOGGER.info(String.format("Received event: %s", eventMessage));

    }
}
