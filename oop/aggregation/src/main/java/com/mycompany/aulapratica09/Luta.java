package com.mycompany.aulapratica09;

import java.util.Random;

public class Luta implements LutaInterface {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(int rounds) {
        this.rounds = rounds;
        this.aprovada = false;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public void lutar() {
        if (this.aprovada) {
        
        // Código para sortear um número entre 0 e 2
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);  
            
        switch(vencedor) {
            case 0:
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
                System.out.println("\nEmpatou!");
                break;
            case 1:
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("\n" + this.desafiado.getNome() + " ganhou a luta entre " + this.desafiante.getNome());
                break;
            case 2:
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                System.out.println("\n" + this.desafiante.getNome() + " ganhou a luta entre " + this.desafiado.getNome());
                break;
        }   
        } else {
            System.out.println("\nA luta não foi aprovada!");
        }
    }

    @Override
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria() == desafiante.getCategoria()
                && desafiado != desafiante) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
            System.out.println("\nLuta entre " + this.desafiado.getNome()
            + " e " + this.desafiante.getNome() + " marcada!");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("A não pode acontecer!");
        }
    }
    
}
