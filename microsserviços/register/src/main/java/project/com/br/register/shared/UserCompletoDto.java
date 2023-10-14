package project.com.br.register.shared;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class UserCompletoDto {
    private String id;
    @NotEmpty(message = "Campo User deve ser informado")
    @NotBlank(message = "Tem que informar os caracteres")
    private String nomeUser;
    @NotEmpty(message = "Campo Book deve ser informado")
    @NotBlank(message = "Tem que informar os caracteres")
    private String idBook;
    @Positive(message = "Valor deve ser informado")
    private double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeUser() {
        return nomeUser;
    }
    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }
    public String getIdBook() {
        return idBook;
    }
    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}