package org.example.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.example.kafka.payload.Student;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "janetopic", groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(format("Consuming the message from server:: %s",msg));

    }


    @KafkaListener(topics = "janetopic", groupId = "myGroup")
    public void consumeMessage(Student msg) {
        log.info(format("Consuming the message from server:: %s",msg.toString()));

    }


}
