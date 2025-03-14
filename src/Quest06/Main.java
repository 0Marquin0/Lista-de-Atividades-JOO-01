package Quest06;//Crie uma classe Produto com atributos nome, preco e desconto, e um metodo calcularPrecoFinal() que retorna o proco apos aplicar o desconto.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Produto p1 = new Produto();

        System.out.println("-Consultor de Descontos-");

        //teste
        System.out.println("Digite o nome do produto e seu valor: ");
        p1.nome = scan.nextLine();
        p1.preco = scan.nextDouble();
       //desconto
        System.out.println("Agora digite a porcentagem de desconto a ser aplicada no produto: ");
        p1.desconto = scan.nextInt();
        p1.calcularPrecoFinal(p1.precoFinal);

        System.out.println("Produto: "+p1.nome);
        System.out.println("Com desconto de: "+p1.desconto+ "%");
        System.out.println("Valor final com desconto: R$"+p1.precoFinal);
    }
}