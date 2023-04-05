package com.mycompany.aulapratica10;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista, desconto aplicado!");
    }

    public Bolsista(float bolsa, int matricula, String curso, String nome, int idade, String genero) {
        super(matricula, curso, nome, idade, genero);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
