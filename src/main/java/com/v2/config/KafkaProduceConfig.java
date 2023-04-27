package com.v2.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.v2.model.Customer;
import com.v2.utils.KafkaContant;
 
@Configuration
public class KafkaProduceConfig {
	
	@Bean
	public ProducerFactory<String, Customer> producerFactory(){
		Map<String,Object> configProp=new HashMap<>();
		configProp.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaContant.HOST);
		configProp.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProp.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return new DefaultKafkaProducerFactory<>(configProp);
	}
	
	@Bean(name="kafkaTemplate")
	public KafkaTemplate<String, Customer> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory()) ;
		
	}
	
//	@Bean
//	public NewTopic createTopic() {
//		return TopicBuilder.name("07spring").build();
//		
//	} 

}
