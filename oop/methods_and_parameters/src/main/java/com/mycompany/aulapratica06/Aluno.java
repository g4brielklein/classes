package com.mycompany.aulapratica06;
public class Aluno {
    // Definição dos atributos
    public int matricula;
    public String nome;
    private String disciplina;
    private float nota;
    private int presencas;
    private boolean aprovado;
    
    // Método construtor
    public Aluno(int mat, String nom, float not) {
        // Valores padrões
        this.disciplina = "POO I";
        this.presencas = 14;
        // Valores recebidos por parâmetro
        this.matricula = mat;
        this.nome = nom;
        this.nota = not;
    }
    
    // Métodos
    public void serAprovado() {
        float media = 6;
        int presencasMinimas = 15;
        
        if (this.getPresencas() >= presencasMinimas) {
            if (this.getNota() >= media) {
                this.setAprovado(true);
                System.out.println("Aprovado! o/");
            } else {
                this.setAprovado(false);
                System.out.println("A nota foi menor do que " + media + " :/");
            }
        } else {
            this.setAprovado(false);
            System.out.println("O número de presenças foi menor do que "
                                + presencasMinimas);
        }
    }
    
    public void assistirAula() {
        this.setPresencas(this.getPresencas() + 1);
    }
    
    
    public void status() {
        System.out.println("\n#####  Informações do Aluno #######");
        System.out.println("Turma de " + this.getDisciplina());
        System.out.println("Número de matrícula: " + this.getMatricula());
        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("Qtd de presenças: " + this.getPresencas());
        System.out.println("Nota: " + this.getNota());
        System.out.println("Foi aprovado? " + this.isAprovado());
    }

    // Métodos Setters e Getters
    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
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

    public String isAprovado() {
        if (this.aprovado) {
            return "Sim!";
        } else {
            return "Não. :/";
        }
        
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }   
}
