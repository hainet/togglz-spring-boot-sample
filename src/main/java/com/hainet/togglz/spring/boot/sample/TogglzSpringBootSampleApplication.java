package com.hainet.togglz.spring.boot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@SpringBootApplication
@RestController
public class TogglzSpringBootSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TogglzSpringBootSampleApplication.class, args);
    }

    private final FeatureManager manager;

    public TogglzSpringBootSampleApplication(final FeatureManager manager) {
        this.manager = manager;
    }

    @GetMapping("/feature")
    public ResponseEntity<String> feature() {
        if (manager.isActive(Features.FEATURE)) {
            return new ResponseEntity<>("Feature is active!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
