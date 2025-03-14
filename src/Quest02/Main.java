package Quest02;//Desenvolva uma classe Livro com atributos titulo e autor, e um metodo detalhes() que exibe essas informações.

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "O Homem de Giz";
        l1.autor = "C. J. Tudor";
        l1.anoPublicacao = 2018;
        l1.genero = "Suspense";

        l1.detalhes();
        System.out.println("-Detalhes do livro-");
        System.out.println("Titulo: "+l1.titulo);
        System.out.println("Autora: "+l1.autor);
        System.out.println("Gênero: "+l1.genero);
        System.out.println("Publicado no ano de: "+l1.anoPublicacao);
    }
}