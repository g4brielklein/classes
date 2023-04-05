package com.mycompany.aulapratica13;
public class Reptil extends Animal {
    private String corEscama;

    public Reptil(String corEscama, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
    
    // Uso do polimorfismo de sobreposição
    @Override
    public void locomover() {
        System.out.println("Se rastejando");
    }

    @Override
    public void seAlimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
}
