package project.com.br.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import project.com.br.library.service.BookService;
import project.com.br.library.shared.BookCompletoDto;
import project.com.br.library.shared.BookDto;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping
    public ResponseEntity<BookCompletoDto> cadastrarLivro(@RequestBody @Valid BookCompletoDto book) {
        return new ResponseEntity<>(service.cadastrarLivro(book), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BookCompletoDto>> obterLivros() {
        return new ResponseEntity<>(service.obterTodosOsLivros(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> obterLivro(@PathVariable String id) {
        Optional<BookDto> retorno = service.obterLivroPorID(id);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exlcuirLivor(@PathVariable String id) {
        service.exlcuirLivroPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookCompletoDto> atualizarLivro(@PathVariable String id, @RequestBody BookCompletoDto livro) {
        Optional<BookCompletoDto> retorno = service.atualizarLivroPorId(id, livro);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/porta")
    public String obterPorta(@Value("${local.server.port}") String porta) {
        return "A istância que respondeu a requisição está rodando na porta" +porta;
    }
}