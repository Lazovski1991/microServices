package my.company.helloservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "hello_count_topic";

    public void send(Integer count) {
        kafkaTemplate.send(kafkaTopic, count.toString());
    }
}
