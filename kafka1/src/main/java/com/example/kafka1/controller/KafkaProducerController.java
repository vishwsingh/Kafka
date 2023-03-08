package com.example.kafka1.controller;

import com.example.kafka1.model.User;
import com.example.kafka1.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class KafkaProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;
@PostMapping("/publish")
public ResponseEntity<String> publish(@RequestBody User user) {
kafkaProducer.sendMessage(user);
return ResponseEntity.ok("Message Sent to to Kafka topic");
}
}
