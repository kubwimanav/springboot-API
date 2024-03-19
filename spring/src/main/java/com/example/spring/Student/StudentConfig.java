package com.example.spring.Student;

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
            StudentRepository repository
    ){
        return args -> {
            Student vincent= new Student(
                    "vincent",
                    "kubwimana@gmail.com",
                    LocalDate.of(2002, Month.NOVEMBER, 28)
            );

            Student emmanuel= new Student(
                    "emmanuel",
                    "emmanuel.com",
                    LocalDate.of(2005, Month.JANUARY, 20)
            );

            repository.saveAll(
                    List.of(vincent,emmanuel)
            );
        };
    }
}
