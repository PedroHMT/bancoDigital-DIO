public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.depositar(1000);
        cc.transferir(cp, 1000);
        cc.extrato();
        cp.extrato();
    }
}
