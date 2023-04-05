package com.mycompany.aulapratica08;

public class AulaPratica08 {

    public static void main(String[] args) {
        // Criando vetor de pessoas
        Pessoa[] pessoas = new Pessoa[2];
        
        // Criando pessoa
        pessoas[0] = new Pessoa("João", 20, "M");
        pessoas[1] = new Pessoa("Ana", 40, "F");
        
        // Criando vetor de livros
        Livro[] livros = new Livro[2];
        
        // Criando livro
        livros[0] = new Livro("Dom Casmurro", pessoas[0], 300, pessoas[1]);
        livros[1] = new Livro("Ana Terra", pessoas[0], 200, pessoas[1]);
        
        pessoas[0].status();
        livros[0].voltarPagina();
        livros[0].status();
    }
    
}
