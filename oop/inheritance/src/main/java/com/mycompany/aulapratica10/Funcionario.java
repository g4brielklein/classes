package com.mycompany.aulapratica10;
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho() {
        if (this.trabalhando) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String genero) {
        super(nome, idade, genero);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    public void status() {
        System.out.println("\n ### Funcionário ###");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Está trabalhando? " + this.isTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
