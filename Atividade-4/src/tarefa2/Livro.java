/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

/**
 *
 * @author 20212SI0027
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String descricao;

    public Livro(String titulo, String autor, String isbn, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.descricao = descricao;
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

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;        
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", descricao=" + descricao;
    }
    
}
