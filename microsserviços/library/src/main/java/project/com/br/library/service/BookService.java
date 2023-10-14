package project.com.br.library.service;

import java.util.List;
import java.util.Optional;

import project.com.br.library.shared.BookCompletoDto;
import project.com.br.library.shared.BookDto;

public interface BookService {
    List<BookCompletoDto> obterTodosOsLivros();    
    Optional<BookDto> obterLivroPorID(String id);
    void exlcuirLivroPorId(String id);
    BookCompletoDto cadastrarLivro(BookCompletoDto dto);
    Optional<BookCompletoDto> atualizarLivroPorId(String id, BookCompletoDto dto);
}