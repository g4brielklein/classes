package com.mycompany.aulapratica13;
public class Ave extends Animal {
    private String corPena;

    public Ave(String corPena, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    
    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void seAlimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    
}
