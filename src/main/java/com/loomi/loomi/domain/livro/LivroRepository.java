package com.loomi.loomi.domain.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface LivroRepository extends JpaRepository <Livro, Long>{
    <Optional> List<Livro> findById(Long id);
}
