package com.springboot.kafka.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @autor Toufik Lamghari
 **/

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name("wikimedia-recentchange").build();
    }
}
