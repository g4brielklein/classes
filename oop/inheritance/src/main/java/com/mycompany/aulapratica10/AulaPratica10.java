package com.mycompany.aulapratica10;
public class AulaPratica10 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123, "POO", "João", 18, "M");        
        Professor professor1 = new Professor("Software", 1000, "Carlos", 40, "M");
        Funcionario funcionario1 = new Funcionario("Desenvolvimento de Software", true, "Maria", 29, "F");
        Visitante visitante1 = new Visitante("Ana", 20, "F");
        Bolsista bolsista1 = new Bolsista(200, 456, "POO", "Cleide", 29, "F");
        Tecnico t1 = new Tecnico(2345, 456, "POO", "Roberta", 20, "F");
        
        aluno1.pagarMensalidade();
        bolsista1.pagarMensalidade();
        
        t1.praticar();

    }
    
}
