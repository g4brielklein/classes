package com.mycompany.aulapratica13;
public class Canguru extends Mamifero {
    // Método próprio da classe Canguru
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    // Sobrescrevendo o método da classe Mamifero
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public Canguru(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

}
