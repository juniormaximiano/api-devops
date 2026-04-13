package com.faculdade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/status")
    public String check() {
        return "API DevOps: Rodando e Saudavel!";
    }
}