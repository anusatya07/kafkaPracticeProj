//package com.v2.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.v2.model.User;
//import com.v2.service.KafkaJProducer;
//
//@RestController
//public class KafkaJController {
//
//	private KafkaJProducer kafkaProducer;
//
//	public KafkaJController(KafkaJProducer kafkaProducer) {
//		this.kafkaProducer = kafkaProducer;
//	}
//
//	@PostMapping("/publish")
//	public ResponseEntity<String> publish(@RequestBody User user) {
//		kafkaProducer.sendMessage(user);
//		return ResponseEntity.ok("Json message sent to kafka topic");
//	}
//
//}
