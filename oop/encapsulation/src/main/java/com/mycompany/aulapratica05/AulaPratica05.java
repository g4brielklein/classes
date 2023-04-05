package com.mycompany.aulapratica05;

public class AulaPratica05 {

    public static void main(String[] args) {
        // Instância do objeto
        Carro carro1 = new Carro("Fiat", "Siena", "Preto");
        
        // Uso dos métodos
        carro1.ligar();
        carro1.desligar();
        carro1.abastecer(2);
        
        // Status
        carro1.status();
    }
    
}
