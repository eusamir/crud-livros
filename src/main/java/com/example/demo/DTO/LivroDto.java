package com.example.demo.DTO;

import com.example.demo.Entities.Livro;
import lombok.*;

@Getter
@Setter
public class LivroDto {
    private Long id;
    private String titulo;
    private String autor;
    private String description;
    private String category;
    private String release;
    private String pages;

    public LivroDto(){}

    public LivroDto(Livro livro){
        this.description= livro.getDescription();
        this.autor = livro.getAutor();
        this.titulo = livro.getTitulo();
        this.pages = livro.getPages();
        this.category = livro.getCategory();
        this.release = livro.getRelease();
        this.id = livro.getId();
    }
}
