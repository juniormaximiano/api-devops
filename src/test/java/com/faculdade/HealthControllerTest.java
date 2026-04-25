package com.faculdade;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HealthControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testStatusEndpointReturnsUp() {
        Map<String, Object> response = restTemplate.getForObject("/status", Map.class);
        assertEquals("UP", response.get("status"));
    }

    @Test
    void testStatusEndpointHasUptime() {
        Map<String, Object> response = restTemplate.getForObject("/status", Map.class);
        assertNotNull(response.get("uptime_seconds"));
    }

    @Test
    void testWelcomePage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().contains("Bem-vindo"));
    }

    @Test
    void testStatusHttpStatusCode() {
        ResponseEntity<Map> response = restTemplate.getForEntity("/status", Map.class);
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void testInvalidRoute() {
        ResponseEntity<String> response = restTemplate.getForEntity("/api/error", String.class);
        assertEquals(404, response.getStatusCodeValue());
    }
}