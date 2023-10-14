package project.com.br.register.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.com.br.register.model.Book;

@FeignClient("library")
public interface LibraryClient {

    @RequestMapping(method =RequestMethod.GET, value="/books/{id}")
        Book obterUserPorId(@PathVariable String id);
}
