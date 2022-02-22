package com.example.LoginApi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Daksh  = new Student(
                    "Daksh",
                    "dakshdudeja123@gmail.com",
                    21,
                    LocalDate.of(2001, Month.SEPTEMBER,05)
            );

            Student alex  = new Student(
                    "Alex",
                    "alex123@gmail.com",
                    22,
                    LocalDate.of(2004, Month.SEPTEMBER,05)
            );
            repository.saveAll(
                    List.of(Daksh,alex)
            );
        };
    }
}
