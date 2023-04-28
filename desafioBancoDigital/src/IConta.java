public interface IConta {
    boolean sacar(double valor);
    boolean depositar(double valor);
    void transferir(Conta contaDestino, double valor);
}
