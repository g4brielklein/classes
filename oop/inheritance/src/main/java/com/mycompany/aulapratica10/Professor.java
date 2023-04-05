package com.mycompany.aulapratica10;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento) {
        this.salario = this.salario + aumento;
    }
    
    public void status() {
        System.out.println("\n### Professor ###");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário: " + this.getSalario());
    }

    public Professor(String especialidade, float salario, String nome, int idade, String genero) {
        super(nome, idade, genero);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
