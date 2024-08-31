import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private List<Livro> livros;

    public Biblioteca() {
      livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
       if (!livroExiste(livro)) {
        livros.add(livro);
        System.out.println("O livro foi adicionado com sucesso.");
       } else {
        System.out.println("O livro já existe na lista.");
       }
    }

    public void removerLivro(Livro livro) {
       if (livros.remove(livro)) {
        System.out.println("\nO livro foi removido com sucesso.");
       } else {
        System.out.println("\nLivro não encontrado na lista.");
       }
    }

    public void imprimirListaLivros() {
       if (livros.isEmpty()) {
        System.out.println("\nA lista de livros está vazia.");
       } else {
        System.out.println("\n---Lista de livros---");
        for (Livro livro : livros) {
         System.out.println(livro);
        }
       }
    }

    public boolean livroExiste(Livro livro) {
       System.out.println("\n-Verificando se o livro já existe na lista...-");
       boolean existe = livros.contains(livro);
       if (existe) {
        System.out.println("Sim, o livro existe na lista.");
       } else {
        System.out.println("Não, o livro não existe na lista.");
       } return existe;
    }

    public Livro obterLivro(Livro livro) {
       System.out.println("\nObtendo livro...");
       int index = livros.indexOf(livro);
       if (index != -1) {
        return livros.get(index);
       }
       return null;
    }

    public void listaVazia() {
       System.out.println("\nVerificando se a lista está vazia...");
       if (livros.isEmpty()) {
        System.out.println("A lista está vazia.");
       } else {
        System.out.println("A lista possui livros.");
       }
    }
}