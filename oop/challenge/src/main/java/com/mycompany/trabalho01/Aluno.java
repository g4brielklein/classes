package com.mycompany.trabalho01;
public class Aluno implements AlunoInferface {
    private int matricula;
    private String nome;
    private String disciplina;
    private float nota;
    private int presencas;
    private boolean aprovado;

    public Aluno(int matricula, String nome, String disciplina, float nota, int presencas) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
        this.presencas = presencas;
        this.aprovado = false;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public void assistirAula() {
        this.presencas = this.presencas + 1;
    }

    @Override
    public void serAprovado() {
        float media = 6;
        int presencasMinimas = 15;
        
        if (this.nota >= media && this.presencas >= presencasMinimas) {
            this.aprovado = true;
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    @Override
    public void status() {
        System.out.println("\n### Aluno ###");
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Nota: " + this.getNota());
        System.out.println("Número de presenças: " + this.getPresencas());
        System.out.println("Foi aprovado? " + this.isAprovado());
    }
    
}