public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(873645, "Darkside", "Fantasma de Anya", "Vera Brosgol");
        Livro livro2 = new Livro(265369, "Seguinte", "Destruidor de Mundos", "Victoria Aveyard");
        Livro livro3 = new Livro(356234, "Principis", "Noites Brancas", "Fiódor Dostoiévski");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.imprimirListaLivros();

        System.out.println(biblioteca.livroExiste(new Livro(356234, "Principis", "Noites Brancas", "Fiódor Dostoiévski")));
        System.out.println(biblioteca.livroExiste(new Livro(378461, "Seguinte", "O Príncipe Cruel", "Holly Black" )));

        biblioteca.removerLivro(livro2);

        System.out.println(biblioteca.obterLivro(livro1) != null ? "Livro obtido: " + biblioteca.obterLivro(livro1) : "Livro não encontrado.");

        biblioteca.listaVazia();
    }
}