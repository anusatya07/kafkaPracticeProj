//package com.v2.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import com.v2.model.User;
//import com.v2.repository.UserRepo;
//
//@Service
//public class KafkaJConsumer {
//	
//	@Autowired
//	private UserRepo repo;
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJConsumer.class);
//
//	@KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
//	public void listener(User user) {
//		repo.save(user);
//		LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
//	}
//
//}
