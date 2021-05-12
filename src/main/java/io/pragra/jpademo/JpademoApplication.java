package io.pragra.jpademo;

import io.pragra.jpademo.entity.Student;
import io.pragra.jpademo.entity.StudentPermit;
import io.pragra.jpademo.repo.StudentPermitRepo;
import io.pragra.jpademo.repo.StudentRepo;
import io.pragra.jpademo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootApplication
public class JpademoApplication {

    @Autowired
    private StudentService service;
    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            service.renCode();
            service.runCode2();
        };
    }
}
