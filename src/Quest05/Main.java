//Desenvolva uma classe ContaBancaria com metodos depositar(), sacar() e getSaldo(), garantindo que o saldo nunca fique negativo.

import java.util.Scanner;

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ContaBancaria c1 = new ContaBancaria(1000);

    System.out.println("Saldo inicial: R$ " + c1.getSaldo());

    //depositar
    System.out.println("Digite o valor que quer depositar: ");
    c1.valor = scan.nextDouble();
    c1.depositar(c1.valor);
    System.out.println("Valor atual: "+c1.getSaldo());

    //saque
    System.out.println("Digite o valor que quer sacar: ");
    c1.valor = scan.nextDouble();
    c1.sacar(c1.valor);
    System.out.println("Valor atual: "+c1.getSaldo());

}

