package com.example.school_backend_demo;

import com.example.school_backend_demo.student.Student;
import com.example.school_backend_demo.student.StudentRepositry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepositry repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Student("youcef", "tahri",20, "3 grade", "ISAI")));
        };
    }
}
