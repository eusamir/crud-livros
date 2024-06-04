package com.example.demo.Repositories;

import com.example.demo.Entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILivroRepository extends JpaRepository<Livro, Long> {
}
