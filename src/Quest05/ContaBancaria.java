package Quest05;

public class ContaBancaria {
    private double saldo;
    double valor;

    //Inicio
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    //Deposito
    void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    //Sacar
    void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            }
            else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        }
    }

    // getSaldo
    public double getSaldo() {
        return saldo;
    }
}