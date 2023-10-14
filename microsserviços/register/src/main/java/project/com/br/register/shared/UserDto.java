package project.com.br.register.shared;

import project.com.br.register.model.Book;

public class UserDto {
    private String nomeUser;
    private String idBook;
    private Book dadosBook;
    private double valor;

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
    public Book getDadosBook() {
        return dadosBook;
    }
    public void setDadosBook(Book dadosBook) {
        this.dadosBook = dadosBook;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}