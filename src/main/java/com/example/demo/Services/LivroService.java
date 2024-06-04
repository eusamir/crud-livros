package com.example.demo.Services;

import com.example.demo.DTO.LivroDto;
import com.example.demo.Entities.Livro;
import com.example.demo.Repositories.ILivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LivroService {
    @Autowired
    ILivroRepository livroRepository;

    public List<LivroDto> findAll(){
        List<Livro> resultList = livroRepository.findAll();
        return resultList.stream().map(LivroDto::new).toList();
    }

    public LivroDto findById(Long id){
        Livro livro = livroRepository.findById(id).orElseThrow();
        return new LivroDto(livro);
    }

    public  LivroDto create(LivroDto livroDto){
        Livro livro = new Livro(livroDto);
        return new LivroDto(livroRepository.save(livro));
    }

    public LivroDto update(LivroDto livroDto, Long id){
        Livro livro = livroRepository.findById(id).orElseThrow();
        livro.setAutor(livroDto.getAutor());
        livro.setCategory(livroDto.getCategory());
        livro.setPages(livroDto.getPages());
        livro.setRelease(livroDto.getRelease());
        livro.setTitulo(livroDto.getTitulo());
        livro.setDescription(livroDto.getDescription());
        return new LivroDto(livroRepository.save(livro));
    }

    public void delete(Long id){
        Livro livro = livroRepository.findById(id).orElseThrow();
        livroRepository.delete(livro);
    }

}
