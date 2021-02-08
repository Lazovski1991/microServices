package my.company.byeservice.controller;

import my.company.byeservice.service.ByeService;
import my.company.byeservice.service.KafkaByeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bye")
public class ByeController {

    private final ByeService byeService;

    private final KafkaByeService kafkaByeService;

    public ByeController(ByeService byeService, KafkaByeService kafkaByeService) {
        this.byeService = byeService;
        this.kafkaByeService = kafkaByeService;
    }

    @GetMapping
    public String getBye(Model model) {
        byeService.saveByeCount();
        model.addAttribute("helloCount", kafkaByeService.getCount());
        return "bye";
    }
}
