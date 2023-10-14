package project.com.br.library.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.com.br.library.model.Book;
import project.com.br.library.repository.BookRepository;
import project.com.br.library.shared.BookCompletoDto;
import project.com.br.library.shared.BookDto;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public List<BookCompletoDto> obterTodosOsLivros() {
        List<Book> books = repository.findAll();

        return books.stream()
                    .map(p -> new ModelMapper().map(p, BookCompletoDto.class))
                    .collect(Collectors.toList());
    }

    @Override
    public Optional<BookDto> obterLivroPorID(String id) {
        Optional<Book> book = repository.findById(id);

        if (book.isPresent()) {
            return Optional.of(new ModelMapper().map(book.get(), BookDto.class));
        }
        
        return Optional.empty();
    }

    @Override
    public void exlcuirLivroPorId(String id) {
        repository.deleteById(id);
    }

    @Override
    public BookCompletoDto cadastrarLivro(BookCompletoDto dto) {
        Book book = new ModelMapper().map(dto, Book.class);
        repository.save(book);
        return new ModelMapper().map(book, BookCompletoDto.class);
    }

    @Override
    public Optional<BookCompletoDto> atualizarLivroPorId(String id, BookCompletoDto dto) {
        Optional<Book> retorno = repository.findById(id);

        if (retorno.isPresent()) {
            Book book = new ModelMapper().map(dto, Book.class);
            book.setId(id);
            repository.save(book);
            return Optional.of(new ModelMapper().map(book, BookCompletoDto.class));
        } else {
            return Optional.empty();
        }
    } 
}