package com.homiak.ex01.repositories;

import com.homiak.ex01.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {
}