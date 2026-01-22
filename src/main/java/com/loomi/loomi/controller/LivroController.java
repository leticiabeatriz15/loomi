package com.loomi.loomi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loomi.loomi.domain.livro.Livro;
import com.loomi.loomi.domain.livro.LivroRepository;
import com.loomi.loomi.services.LivroService;
import com.loomi.loomi.dto.LivroDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/livro")
public class LivroController {
    
    @Autowired
    private LivroService livroService;


    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody @Valid LivroDto livroDto) {
        Livro livro = new Livro();
        livro = livroService.criarLivro(livro);

        return ResponseEntity.ok(livro);
    }
}
