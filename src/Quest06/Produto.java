package Quest06;

public class Produto {

    //atributos
    String nome;
    double preco, precoFinal, desconto=preco*0.10;


    public Produto(){
    }
    //metodos
    void calcularPrecoFinal(double Produto){
        precoFinal = desconto/100 * preco;
    }

}
