package com.mycompany.aulapratica13;
public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String corPelo, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void seAlimentar() {
        System.out.println("Sendo amamentado");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    
    
}
