package com.mycompany.aulapratica13;
public class Peixe extends Animal {
    private String corEscama;

    public Peixe(String corEscama, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
    
    // Método próprio
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    // Uso do polimorfismo
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void seAlimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    
}
