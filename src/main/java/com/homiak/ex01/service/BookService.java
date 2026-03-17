package com.homiak.ex01.service;

import com.homiak.ex01.models.BookModel;
import com.homiak.ex01.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public BookModel salvar(BookModel livro) {
        return repository.save(livro);
    }

    public List<BookModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<BookModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
