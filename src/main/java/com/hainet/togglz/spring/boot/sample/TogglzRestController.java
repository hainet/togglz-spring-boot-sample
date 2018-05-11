package com.hainet.togglz.spring.boot.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@RestController
public class TogglzRestController {

    private final FeatureManager manager;

    public TogglzRestController(final FeatureManager manager) {
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

    @GetMapping("iphone")
    public ResponseEntity<String> firstFeature() {
        if (manager.isActive(Features.IPHONE)) {
            return new ResponseEntity<>("iPhone feature is active!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }

    @GetMapping("android")
    public ResponseEntity<String> secondFeature() {
        if (manager.isActive(Features.ANDROID)) {
            return new ResponseEntity<>("Android feature is active!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
