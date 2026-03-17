package com.homiak.ex01.controllers;

import com.homiak.ex01.models.BookModel;
import com.homiak.ex01.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public BookModel criarLivro(@RequestBody BookModel livro) {
        return service.salvar(livro);
    }

    @GetMapping
    public List<BookModel> listarLivros() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<BookModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}