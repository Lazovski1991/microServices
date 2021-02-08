package my.company.byeservice.controller;

import my.company.byeservice.service.ByeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bye")
public class ByeController {

    private final ByeService byeService;

    public ByeController(ByeService byeService) {
        this.byeService = byeService;
    }

    @GetMapping
    public String getBye() {
        byeService.saveByeCount();
        return "";
    }
}
