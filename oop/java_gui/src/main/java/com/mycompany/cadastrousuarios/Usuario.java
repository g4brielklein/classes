package com.mycompany.cadastrousuarios;
public class Usuario {
    private String nome;
    private String email;
    private String genero;

    public Usuario(String nome, String email, String genero) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", genero=" + genero + '}';
    }

}
