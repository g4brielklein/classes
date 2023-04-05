package com.mycompany.aulapratica13;

import java.util.ArrayList;

public class AulaPratica13 {

    public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero("Preto", 15.7f, 7, 4);
//        mamifero1.locomover();
//        mamifero1.seAlimentar();
//        mamifero1.emitirSom();
        
        Cachorro cachorro1 = new Cachorro("Totó", "Branco", 10, 7, 4);
        Cachorro cachorro2 = new Cachorro("Bilu", "Preto", 5, 3, 4);
//        cachorro1.locomover();
//        cachorro1.seAlimentar();
//        cachorro1.emitirSom();
        
        // Criando um vetor dinâmico (Será necessário
        // importar a biblioteca java.util.ArrayList)
        ArrayList<String> nomes = new ArrayList<>();   
        
        ArrayList<Cachorro> dogs = new ArrayList<>();
        
        dogs.add(cachorro1);
        dogs.add(cachorro2);
        
//        System.out.println(dogs.get(0).getNome() + "\n" +  dogs.get(1).getNome());
        dogs.remove(dogs.get(1));
//        System.out.println(dogs.size());
        
        
        // Adicionando nomes
        nomes.add("Maria"); // 0
        nomes.add("João"); // 1
        nomes.add("Ana"); // 2
        
        // Removendo o nome da posição 0
//        nomes.remove(nomes.get(0));
        
        // Mostrando em tela o conteúdo do vetor
//        System.out.println(nomes.get(1));
//        System.out.println(nomes.size());
//        
//        System.out.println("O primeiro nome da lista é " + nomes.get(0));

        // Lista de dogs
        Cachorro doug = new Cachorro("Doug", "Cinza", 8.1f, 12, 4);
        Cachorro charlote = new Cachorro("Charlote", "Cinza", 5, 9, 4);
        Cachorro judite = new Cachorro("Judite", "Cinza", 5, 9, 4);
        Cachorro wilson = new Cachorro("Wilson", "Cinza", 5, 9, 4);
        Cachorro rabito = new Cachorro("Rabito", "Cinza", 5, 9, 4);
        Cachorro poly = new Cachorro("Poly", "Cinza", 5, 9, 4);
        Cachorro rufus = new Cachorro("Rufus", "Cinza", 5, 9, 4);


        // Vetor estático
        // Criação
        Cachorro[] dogsEstatico = new Cachorro[2];
        
        // Uso
        dogsEstatico[0] = doug;
        dogsEstatico[1] = charlote;
        
        System.out.println(dogsEstatico[0].getNome() + "\n" + dogsEstatico[1].getNome());
        
        // Vetor dinâmico
        // Criação
        ArrayList<Cachorro> dogsDinamico = new ArrayList<>();
        
        // Uso
        dogsDinamico.add(doug);
        dogsDinamico.add(charlote);
        dogsDinamico.add(judite);
        dogsDinamico.add(wilson);
        dogsDinamico.add(poly);
        dogsDinamico.add(rabito);
        dogsDinamico.add(rufus);
        
        dogsDinamico.remove(dogsDinamico.get(5));
        System.out.println(dogsDinamico.size());
        
        System.out.println(dogsDinamico.get(0).getNome() + "\n" + dogsDinamico.get(1).getNome() + "\n" + dogsDinamico.get(2).getNome()
        + "\n" + dogsDinamico.get(3).getNome() + "\n" + dogsDinamico.get(4).getNome() + "\n" + dogsDinamico.get(5).getNome() + "\n" + dogsDinamico.get(6).getNome());
    }
    
    
    
    
    
}
