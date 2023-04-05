package com.mycompany.aulapratica14;
public class Cachorro extends Lobo {
    
    // Utilização do Polimorfismo de sobrescrita
    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }
    
    // reagir() 1 - Reação padrão
    public void reagir() {
        System.out.println("Latir");
    }
    
    // reagir() 2 - Reação se for dono
    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    // reagir() 3 - Reação dependendo do horário do dia
    public void reagir(int hora, int minuto) {
        if (hora >= 6 && hora <= 12) {
            System.out.println("Latir e abanar o rabo");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Latir");
        } else {
            System.out.println("Ignorar");
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 5) {
                System.out.println("Abanar o rabo e latir");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 5) {
                System.out.println("Latir");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    public Cachorro(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    
}
