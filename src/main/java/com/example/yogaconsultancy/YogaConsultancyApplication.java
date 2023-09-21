package com.example.yogaconsultancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.yogaconsultancy.model.User;
import com.example.yogaconsultancy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class YogaConsultancyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(YogaConsultancyApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {}
}
