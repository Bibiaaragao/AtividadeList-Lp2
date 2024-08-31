public class Livro {
    private int isbn;
    private String editora, titulo, autor;

    public Livro(int isbn, String editora, String titulo, String autor){
        this.isbn = isbn;
        this.editora = editora;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return isbn == livro.isbn;
    }

    public String toString() {
        return "\n--Livro--" + "\nISBN: " + isbn + "\nEditora: " + editora + "\nTítulo: " + titulo + "\nAutor: " + autor;
    }
}
