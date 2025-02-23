package com.springboot.kafka.consumer.repository;

import com.springboot.kafka.consumer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @autor Toufik Lamghari
 **/

@Repository
public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
