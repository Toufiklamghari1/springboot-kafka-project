package com.springboot.kafka.consumer;

import com.springboot.kafka.consumer.entity.WikimediaData;
import com.springboot.kafka.consumer.repository.WikimediaDataRepository;

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

    private WikimediaDataRepository wikimediaDataRepository;

    public KafkaConsumer(WikimediaDataRepository wikimediaDataRepository) {
            this.wikimediaDataRepository = wikimediaDataRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String eventMessage) {
        LOGGER.info(String.format("Received event: %s", eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        wikimediaDataRepository.save(wikimediaData);
    }
}
