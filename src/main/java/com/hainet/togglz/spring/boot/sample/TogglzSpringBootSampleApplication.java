package com.hainet.togglz.spring.boot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@SpringBootApplication
@RestController
public class TogglzSpringBootSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TogglzSpringBootSampleApplication.class, args);
    }

    private FeatureManager manager;

    public TogglzSpringBootSampleApplication(final FeatureManager manager) {
        this.manager = manager;
    }

    @GetMapping("/feature")
    public boolean feature() {
        return manager.isActive(Features.FEATURE);
    }
}
