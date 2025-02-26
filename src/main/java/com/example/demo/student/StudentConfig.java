package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student james = new Student("James Bond",
                    LocalDate.of(2000, Month.JANUARY, 1),
                    "jbond@gmail.com"
            );

            Student tom = new Student("Tom Cruise",
                    LocalDate.of(2004, Month.APRIL, 10),
                    "tcruise@gmail.com"
            );

            repository.saveAll(
                    List.of(james, tom)
            );
        };
    }

}
