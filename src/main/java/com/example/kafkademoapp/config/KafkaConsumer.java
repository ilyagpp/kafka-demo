package com.example.kafkademoapp.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

  @KafkaListener(topics = "my_topic", groupId = "group_id")
  public void listenTopic(ConsumerRecord<String, String> record){
    System.out.println("my message:");
    System.out.println(record.toString());
  }


}
