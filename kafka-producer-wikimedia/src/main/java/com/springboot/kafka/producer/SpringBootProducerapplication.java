package com.springboot.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @autor Toufik lamghari
 **/
@SpringBootApplication
public class SpringBootProducerapplication implements CommandLineRunner {
    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerapplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendWikimediaChanges();
    }
}
