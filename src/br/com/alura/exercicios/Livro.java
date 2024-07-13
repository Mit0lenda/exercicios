package br.com.alura.exercicios;

public class Livro {
    private String autor;
    private String titulo;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void ExibirDetalhes() {
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
    }
}
