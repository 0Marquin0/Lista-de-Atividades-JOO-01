package Quest03;//Crie uma classe Retangulo com atributos largura e altura, e um metodo calcularArea() que retorna a area do retangulo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float areaRetangulo;

        Scanner scan = new Scanner(System.in);
        Retangulo r1 = new Retangulo();

        System.out.println("Insira a largura: ");
        r1.altura= scan.nextFloat();
        System.out.println("Insira a largura: ");
        r1.largura = scan.nextFloat();


        //metodo
        r1.calcularArea();
        areaRetangulo = r1.altura * r1.largura;
        System.out.println("A área é de: "+areaRetangulo);
    }
}