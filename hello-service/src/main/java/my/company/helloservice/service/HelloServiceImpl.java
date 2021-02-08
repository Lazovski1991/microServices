package my.company.helloservice.service;

import my.company.helloservice.model.Hello;
import my.company.helloservice.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    KafkaSender kafkaSender;

    @Autowired
    private final HelloRepository helloRepository;

    public HelloServiceImpl(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public void getHelloCount() {
        Hello hello = helloRepository.findById(1L).get();
        int count = hello.getCount() + 1;
        hello.setCount(count);
        helloRepository.save(hello);
        kafkaSender.send(count);
        System.out.println("Добрый день");
    }
}
