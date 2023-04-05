package com.mycompany.aulapratica14;
public class AulaPratica14 {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Preto", 11, 6, 4);
        
        // Reação padrão
        cachorro1.reagir();
        
        // Reagir considerando se quem está falando
        // é dono ou não
        cachorro1.reagir(false);
        
        // Reagir dependendo da hora do dia
        cachorro1.reagir(11,45); // Manhã
        cachorro1.reagir(15,00); // Tarde
        cachorro1.reagir(21,00); // Noite
        
        // 
        cachorro1.reagir(4, 4.5f);
        cachorro1.reagir(7, 4.5f);
        cachorro1.reagir(3, 8.5f);
        cachorro1.reagir(7, 7.5f);

    }
    
}
