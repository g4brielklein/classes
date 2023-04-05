package contabancaria;

public class ContaBancariaClasse {
    // Atributos
    private int numConta;
    public String dono;
    public String tipo;
    private float valor;
    private boolean aberta;
    
    // Métodos especiais
    //Método construtor
    public ContaBancariaClasse(int numConta, String dono, float valor) {
        // Valores padrões
        this.tipo = "CC";
        this.aberta = false;
        
        // Valores passados por parâmetro
        this.numConta = numConta;
        this.dono = dono;
        this.valor = valor;
    }
    
    
    //Getters e Setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public float getValor() {
        return this.valor;
    }
    
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public String getAberta() {
        if (this.aberta) {
            return "Sim";
        } else {
            return "Não";
        }
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    // Métodos
    public void abrirConta() {
        if (this.getTipo() == "CC" || this.getTipo() == "CP") {
            float bonus;
            if (this.getTipo() == "CC") {
                bonus = 50;
            } else {
                bonus = 100;
            }
            this.aberta = true;
            this.setValor(this.getValor() + bonus);
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Erro! Tipo de conta inválido!");
        }
    };
    
    public void fecharConta() {
        if (this.getValor() == 0) {
            this.setAberta(false);
            System.out.println("Conta fechada com sucesso!");
        } else if (this.getValor() > 0) {
            System.out.println("Erro! Sacar saldo disponivel.");
        } else {
            System.out.println("Erro! Quitar débitos.");
        }
    }
    
    public void pagarMensalidade() {
        if (this.getAberta() == "Sim") {
            float mensalidade;
            if (this.getTipo() == "CC") {
                mensalidade = 12;
            } else {
                mensalidade = 20;
            }
            this.setValor(this.getValor() - mensalidade);  
        } else {
            System.out.println("Não é possível pagar mensalidade "
                    + "para uma conta fechada");
        }
    }
    
    
    public void depositar(float valorDeposito) {
        if (this.aberta) {
            this.valor = this.valor + valorDeposito;
        } else {
            System.out.println("A conta está fechada!");
        }
    };
    
    public void sacar(float valorSaque) { 
        if (this.aberta && this.valor >= valorSaque) {
            this.valor = this.valor - valorSaque;
        } else {
            System.out.println("A conta está fechada ou saldo indisponível!");
        }
    };
    
    public void status() {
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("O valor disponivel na conta é: " + this.getValor());
        System.out.println("Está aberta? " + this.getAberta());
    };
}
