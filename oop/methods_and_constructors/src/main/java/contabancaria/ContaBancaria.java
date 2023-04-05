package contabancaria;


public class ContaBancaria {

    public static void main(String[] args) {
        
        // Instância (Criação do objeto - com construtor)
        ContaBancariaClasse conta1 = new ContaBancariaClasse
                (123, "ULBRA CSL", 10.50f);
       
        // Uso dos métodos
        conta1.abrirConta();
        conta1.status();        
    }
    
}
