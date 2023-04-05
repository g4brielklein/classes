package com.mycompany.aulapratica10;
public class Aluno extends Pessoa {
    protected int matricula;
    private String curso;
    
    public void cancelarMatricula() {
        this.setCurso(null);
        System.out.println("Matrícula cancelada!");
    }
    
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de " + this.nome);
    }
    
    public void status() {
        System.out.println("\n ### Aluno ###");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }

    public Aluno(int matricula, String curso, String nome, int idade, String genero) {
        super(nome, idade, genero);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
