package com.pk.spring.jpa.mariadb.repository;

import com.pk.spring.jpa.mariadb.model.ScientificBook;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ScientificBookRepository extends JpaRepository<ScientificBook, Long> {}