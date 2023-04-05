package com.mycompany.aulapratica14;
public class Mamifero extends Animal {
    // Atributos da classe Mamifero
    private String corPelo;

    // Polimorfismo de sobrescrita
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    // Método construtor
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

}
