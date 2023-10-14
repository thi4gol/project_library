package project.com.br.register.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.com.br.register.httpClient.LibraryClient;
import project.com.br.register.model.User;
import project.com.br.register.repository.UserRepository;
import project.com.br.register.shared.UserCompletoDto;
import project.com.br.register.shared.UserDto;

@Service
public class UserServiceImpl implements UserSevice{
    
    @Autowired
    private UserRepository repository;

    @Autowired
    private LibraryClient libraryClient;

    @Override
    public List<UserCompletoDto> obterUser() {
        List<User> users = repository.findAll();
        List<UserCompletoDto> dto = users.stream().map(p -> new ModelMapper().map(p, UserCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

@Override
public Optional<UserDto> obterUserPorId(String id) {
    Optional<User> users = repository.findById(id);

    if (users.isPresent()) {
        UserDto user = new ModelMapper().map (users, UserDto.class);
        user.setDadosBook(libraryClient.obterUserPorId(user.getIdBook()));
        return Optional.of(user);
    } else {
        return  Optional.empty();
    }
}

    @Override
    public void excluirUser(String id) {
        repository.deleteById(id);
    }

    @Override
    public UserCompletoDto cadastrarUser(UserCompletoDto dto) {
        User users = new ModelMapper().map(dto, User.class);
        repository.save(users);
        return new ModelMapper().map(users, UserCompletoDto.class);
    }

    @Override
    public Optional<UserCompletoDto> atualizarUserPorId(String id, UserCompletoDto dto) {
        Optional<User> retorno = repository.findById(id);

        if (retorno.isPresent()) {
            User users = new ModelMapper().map(dto, User.class);
            users.setId(id);
            repository.save(users);
            return Optional.of(new ModelMapper().map(users, UserCompletoDto.class));
        } else {
            return Optional.empty();
        }
    }
}