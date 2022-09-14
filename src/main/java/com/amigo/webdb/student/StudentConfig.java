package com.amigo.webdb.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student nurani = new Student(
                    "Nurani",
                    "ulukhanova01.gmail.com",
                    LocalDate.of(2001, Month.OCTOBER,7)
            );
            Student aysun = new Student(
                    "Aysun",
                    "u.aysun.gmail.com",
                    LocalDate.of(2000, Month.MAY,2)
            );

            repository.saveAll(
                    List.of(nurani,aysun)
            );
        };

    }
}
