package com.mycompany.aulapratica13;
public abstract class Animal {
    // Atributos
    private float peso;
    private int idade;
    private int membros;
    
    // Métodos abstratos
    public abstract void locomover();
    public abstract void seAlimentar();
    public abstract void emitirSom();

    // Método construtor
    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    // Métodos Setters e Getters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}
