package com.mycompany.aulapratica13;
public class Cachorro extends Mamifero {
    private String nome;

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }
    
    public Cachorro(String nome, String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
}
