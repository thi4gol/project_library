package project.com.br.register.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import project.com.br.register.service.UserSevice;
import project.com.br.register.shared.UserCompletoDto;
import project.com.br.register.shared.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserSevice servico;

    @PostMapping
    public ResponseEntity<UserCompletoDto> cadastrarUsers(@RequestBody @Valid UserCompletoDto users) {
        return new ResponseEntity<>(servico.cadastrarUser(users), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserCompletoDto>> obterUsers() {
        return new ResponseEntity<>(servico.obterUser(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> obterUsersPorId(@PathVariable String id) {
        Optional<UserDto> retorno = servico.obterUserPorId(id);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluirUserPorId(@PathVariable String id, @RequestBody UserCompletoDto users) {
        servico.excluirUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserCompletoDto> atualizarUser(@PathVariable String id, @RequestBody UserCompletoDto users) {
        Optional<UserCompletoDto> retorno = servico.atualizarUserPorId(id, users);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}    