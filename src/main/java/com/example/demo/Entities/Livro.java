package com.example.demo.Entities;

import com.example.demo.DTO.LivroDto;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LIVRO")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "AUTOR", nullable = false)
    private String autor;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "CATEGORY", nullable = false)
    private String category;

    @Column(name = "RELEASE", nullable = false)
    private String release;

    @Column(name = "PAGES", nullable = false)
    private String pages;

    public Livro(LivroDto livroDto){
        this.autor = livroDto.getAutor();
        this.category = livroDto.getCategory();
        this.description = livroDto.getDescription();
        this.release = livroDto.getRelease();
        this.pages = livroDto.getPages();
        this.titulo = livroDto.getTitulo();
    }

}
