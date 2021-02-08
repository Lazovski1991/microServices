package my.company.byeservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaByeService {

    private String count;

    public String getCount() {
        return count;
    }

    @KafkaListener(topics = "hello_count_topic", groupId = "group-1")
    public void kafkaListener(String message) {
        count = message;
    }
}
