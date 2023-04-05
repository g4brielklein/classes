package com.mycompany.aulapratica3;
public class Caneta {
    public String modelo;
    private String cor;
    protected float ponta;
    public int carga;
    private boolean tampada;
    
    // Métodos especiais
    // Método construtor
    public Caneta() {
        // Valores padrões
        this.carga = 100;
        this.modelo = "BIC";
    }
    
    // Setters e Getters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    void setCor(String cor) {
        this.cor = cor;
    }
    
    String getCor() {
        return this.cor;
    }
    
    float getPonta() {
        return this.ponta;
    }
    
    void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    boolean getTampada() {
        return this.tampada;
    }
    
    void setTampada(boolean t) {
        this.tampada = t;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    void rabiscar() {
        if (!this.tampada && this.carga > 0) {
            System.out.println("Rabiscando...");
        } else {
            System.out.println("Caneta tampada ou sem carga");
        }
    }
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("A carga está em " + this.carga + "%");
        System.out.println("Está tampada? " + this.getTampada());
    }
    
     void tampar() {
        this.tampada = true;
    } 
}
