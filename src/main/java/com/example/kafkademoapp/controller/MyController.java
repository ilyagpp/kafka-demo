package com.example.kafkademoapp.controller;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyController {

  private final KafkaTemplate<String, String> kafkaTemplate;

  private final String topic = "my_topic";

  @GetMapping("/send")
  public String sendMessage() {
    kafkaTemplate.send(topic, "key", UUID.randomUUID().toString());
    return "Sended";
  }

}
