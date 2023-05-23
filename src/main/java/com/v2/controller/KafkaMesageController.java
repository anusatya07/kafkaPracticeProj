package com.v2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.v2.service.KafkaProducer;


@RestController
public class KafkaMesageController {
	  private KafkaProducer kafkaProducer;

	    public KafkaMesageController(KafkaProducer kafkaProducer) {
	        this.kafkaProducer = kafkaProducer;
	    }

	    // http:localhost:9898/publish?message=hello world
	    @GetMapping("/publish")
	    public ResponseEntity<String> publish(@RequestParam("message") String message){
	        kafkaProducer.sendMessage(message);
	        return ResponseEntity.ok("Message sent to the topic");
	    }
}
