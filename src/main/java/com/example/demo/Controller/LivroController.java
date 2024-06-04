package com.example.demo.Controller;

import com.example.demo.DTO.LivroDto;
import com.example.demo.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/livro")
@RestController
public class LivroController {
        @Autowired
        private LivroService livroService;


        @GetMapping("/")
        public List<LivroDto> findAll(){
            List<LivroDto> result = livroService.findAll();
            return  result;
        }

        @PostMapping("/create")
        public LivroDto create(@RequestBody LivroDto livroDto){
            return livroService.create(livroDto);
        }

        @PutMapping("/update/{id}")
        public LivroDto update(@RequestBody  LivroDto livroDto, @PathVariable Long id){
            return livroService.update(livroDto, id);
        }

        @DeleteMapping("/delete/{id}")
        public  void delete(@PathVariable Long id){
            livroService.delete(id);
        }
}
