package my.company.helloservice.controller;

import my.company.helloservice.service.HelloService;
import my.company.helloservice.service.HelloServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloServiceImpl helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String getHello() {
        helloService.getHelloCount();
        return "";
    }
}
