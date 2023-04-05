package com.mycompany.aulapratica05;

public class Carro {
    // Atributos
    public String fabricante;
    public String modelo;
    private String cor;
    private int numPortas;
    private int nivelCombustivel;
    private boolean ligado;
    
    // Métodos especiais
    public Carro(String fabricante, String modelo, String cor) {
        // Valores padrões
        this.ligado = false;
        this.nivelCombustivel = 40;
        this.numPortas = 4;
        
        // Valores recebidos por parâmetro
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    // Setters e Getters
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public int getNumPortas() {
        return this.numPortas;
    }
    
    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }
    
    public int getNivelCombustivel() {
        return this.nivelCombustivel;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }
    
    // Métodos
    public void desligar() {
        this.ligado = false;
    }
    
    public void ligar() {
        if (this.getNivelCombustivel() > 0) {
            this.ligado = true;
        } else {
            System.out.println("Impossível ligar, sem combustível!");
        }
    }
    
    public void status() {
        System.out.println("\n##### CARRO ######");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Número de Portas: " + this.getNumPortas());
        System.out.println("Nível de combustível: " + this.getNivelCombustivel());
        System.out.println("Está ligado? " + this.getLigado());
    }
    
    public void abastecer(int litros) {
        int nivelMaximo = 40;
        
        if (this.getLigado()) {
            System.out.println("Impossível abastecer com o carro ligado.");
        } else {
            if (this.getNivelCombustivel() >= nivelMaximo) {
                System.out.println("Não é possível abastecer, tanque já está cheio!");
            } else if (this.getNivelCombustivel() + litros > nivelMaximo) {
                System.out.println("Não é possível abastecer acima do nível máximo.");
            } else {
                this.setNivelCombustivel(this.getNivelCombustivel() + litros);
                System.out.println("Carro abastecido com sucesso!");
            }
        }
    }
    
}
