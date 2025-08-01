package org.example.samplewebapplicationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleWebApplicationDEmoApplication {

    @GetMapping("/mess")
    public String index() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleWebApplicationDEmoApplication.class, args);
    }

}
