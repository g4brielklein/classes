package com.mycompany.aulapratica10;
public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println("Praticando...");
    }

    public Tecnico(int registroProfissional, int matricula, String curso, String nome, int idade, String genero) {
        super(matricula, curso, nome, idade, genero);
        this.registroProfissional = registroProfissional;
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
