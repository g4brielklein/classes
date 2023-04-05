package com.mycompany.aulapratica09;
public class AulaPratica09 {

    public static void main(String[] args) {
        Lutador lutador1 = new Lutador("João", "Brasil", 25, 5, 2, 3, 1.80f, 79);
        Lutador lutador2 = new Lutador("Carlos", "Argentina", 31, 4, 4, 0, 1.79f, 79.5f);
        
        Luta luta1 = new Luta(3);
        luta1.marcarLuta(lutador1, lutador2);
        lutador1.status();
        lutador2.status();
        luta1.lutar();
        lutador1.status();
        lutador2.status();
    }
    
}
