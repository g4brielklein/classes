package com.mycompany.aulapratica07;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean executando;
    
    // Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.executando = false;
    }
    
    // Setters e Getters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isExecutando() {
        return executando;
    }

    public void setExecutando(boolean executando) {
        this.executando = executando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("\n ##### MENU ######");
        System.out.println("Nível de volume: " + this.getVolume());
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está executando o filme? " + this.isExecutando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void aumentarVolume() {
        int volumeMax = 100;
        if (this.isLigado() && this.getVolume() < volumeMax) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void diminuirVolume() {
        int volumeMin = 0;
        if (this.isLigado() && this.getVolume() > volumeMin) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isExecutando()) {
            this.setExecutando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isExecutando()) {
            this.setExecutando(false);
        }
    }
}
