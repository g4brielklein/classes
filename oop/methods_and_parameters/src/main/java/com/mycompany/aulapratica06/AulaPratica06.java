package com.mycompany.aulapratica06;

public class AulaPratica06 {

    public static void main(String[] args) {
        // Criação do objeto com construtor
        Aluno a1 = new Aluno(123, "Gabriel", 7);
        
        // Uso dos métodos
        a1.assistirAula();     
        a1.serAprovado();
        a1.status();
    }
    
}
