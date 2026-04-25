package com.faculdade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.management.ManagementFactory;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/status")
    public Map<String, Object> check() {
        Map<String, Object> status = new HashMap<>();

        status.put("status", "UP");
        status.put("timestamp", LocalDateTime.now().toString());
        status.put("projeto", "API DevOps - ADS");

        long uptime = ManagementFactory.getRuntimeMXBean().getUptime() / 1000;
        status.put("uptime_seconds", uptime);

        return status;
    }

    @GetMapping("/")
    public String home() {
        return "Bem-vindo à API DevOps! Acesse /status para ver a saúde do sistema.";
    }
}