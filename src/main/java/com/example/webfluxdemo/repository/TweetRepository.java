package com.example.webfluxdemo.repository;

import com.example.webfluxdemo.model.Tweet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Zaynulina Guzal
 */
@Repository
public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {

}