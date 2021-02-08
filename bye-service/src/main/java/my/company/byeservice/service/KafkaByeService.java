package my.company.byeservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaByeService {

    @KafkaListener(topics = "hello_count_topic", groupId = "group-1")
    public void kafkaListener(String message) {
        System.out.println("Всего доброго! Вы здоровались " + message + " раз");
    }
}
