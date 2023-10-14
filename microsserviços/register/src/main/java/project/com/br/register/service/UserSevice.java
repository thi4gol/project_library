package project.com.br.register.service;

import java.util.List;
import java.util.Optional;

import project.com.br.register.shared.UserCompletoDto;
import project.com.br.register.shared.UserDto;

public interface UserSevice {
    List<UserCompletoDto> obterUser();
    Optional<UserDto> obterUserPorId(String id);
    void excluirUser(String id);
    UserCompletoDto cadastrarUser(UserCompletoDto dto);
    Optional<UserCompletoDto> atualizarUserPorId(String id, UserCompletoDto users);
}
