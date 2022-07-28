public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        if (valor <= consultaSaldo()) {
            this.sacar(valor);
            contaDestino.depositar(valor);

        } else {
            System.out.println("Saldo insuficiente");
            imprimirExtrato();
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
