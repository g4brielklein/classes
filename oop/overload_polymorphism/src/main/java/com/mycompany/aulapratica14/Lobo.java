package com.mycompany.aulapratica14;
public class Lobo extends Mamifero {

    // Utilização do Polimorfismo de sobrescrita
    @Override
    public void emitirSom() {
        System.out.println("Uivar");
    }
    
    public Lobo(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
}
