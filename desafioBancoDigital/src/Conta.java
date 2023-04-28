public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > saldo){
            System.out.println("Valor insuficiente.");
            return false;
        } 
        else{
            saldo -= valor;
            return true;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if(valor <= 0){
            System.out.println("Deposite uma quantia acima de R$ 0,00.");
            return false;
        }
        else{
            saldo += valor;
            return true;
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if(this.sacar(valor)){
            contaDestino.depositar(valor);
        }
        
        
    }

    protected void extrato(){
        System.out.println("=== Extrato de Conta ===");
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    // Getters & Setters
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    

}
