package com.mycompany.aulapratica13;
public class Tartaruga extends Reptil {

    @Override
    public void locomover() {
        System.out.println("Andando bem devagar");
    }
    
    public Tartaruga(String corEscama, float peso, int idade, int membros) {
        super(corEscama, peso, idade, membros);
    }
    
}
