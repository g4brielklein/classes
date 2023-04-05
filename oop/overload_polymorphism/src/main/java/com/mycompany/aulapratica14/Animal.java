package com.mycompany.aulapratica14;
public abstract class Animal {
    // Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Método abstrato
    public abstract void emitirSom();

    // Construtor
    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

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
