package Quest04;//Implemente uma classe Funcionaria com atributos nome, salario e um metodo aumentarSalario(double) que aumenta o salario de acordo com o percentual fornecido.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.println("Insira o nome do funcionário: ");
        f1.nome = scan.nextLine();
        System.out.println("Insira o valor do salário atual: ");
        f1.salarioAtual = scan.nextDouble();

        //metodo
        f1.aumentarSalario();
        System.out.println("Digite a porcentagem de aumento do salário: ");
        f1.valorPorcentagem = scan.nextDouble();

        f1.salarioFinal = f1.salarioAtual * (1 + (f1.valorPorcentagem / 100));
        System.out.println("O valor do salário final é de: " +f1.salarioFinal);

    }
}