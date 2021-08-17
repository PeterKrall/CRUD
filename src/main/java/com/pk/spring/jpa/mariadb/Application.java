package com.pk.spring.jpa.mariadb;

import com.pk.spring.jpa.mariadb.model.Book;
import com.pk.spring.jpa.mariadb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import java.util.List;

@SpringBootApplication
public class Application {
    @Autowired
    static EntityManager entityManager;

    static public void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
