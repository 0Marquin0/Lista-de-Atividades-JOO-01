package Quest01;//Crie uma classe Pessoa com atributos nome e idade, e um metodo apresentar() que imprime essas informações.

public class Main {
    public static void main(String[] args) {
        //Declarando objeto <> Instanciando objeto
        Pessoa p1 = new Pessoa();
            p1.nome = "Marcos";
            p1.idade = 22;

            p1.apresentar();
        System.out.println("Meu nome é: "+p1.nome );
        System.out.println("Tenho: "+p1.idade );
    }
}