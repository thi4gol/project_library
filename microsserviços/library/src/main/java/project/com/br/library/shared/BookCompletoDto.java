package project.com.br.library.shared;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class BookCompletoDto {
    @Id
    private String id;
    @NotEmpty(message = "Campo titulo deve ser informado")
    @NotBlank(message = "Tem que informar os caracteres")
    private String titulo;
    @NotEmpty(message = "Campo autor deve ser informado")
    private String autor;
    @NotEmpty(message = "Campo editora deve ser informado")
    private String editora;
    @Positive(message = "anoDePublicacao deve ser informado!")
    private int anoDePublicacao;
    @Positive(message = "Valor deve ser informado!")
    private double valor;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}