public class main {

    public static void main(String[] args) {
        Cliente thais = new Cliente();
        thais.setNome("Thaís");

        Conta cc = new ContaCorrente(thais);
        Conta poupanca = new ContaPoupanca(thais);

        cc.depositar(100);
        cc.transferir(200,poupanca);
    }
}
