package com.geekster.Mapping_practice.repository;

import com.geekster.Mapping_practice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
