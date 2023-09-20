/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

import tarefa1.Pessoa;

/**
 *
 * @author 20212SI0027
 */
public class LivroTeste {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry potter","jk rowling", "1234", "harry o menino que sobreviveu");
        Livro l2 = new Livro("percy jackson","rick riodan", "456");
        System.out.println("Titulo: "+l1.getTitulo());
        System.out.println("Autor: "+l1.getAutor());
        System.out.println("isbn: "+l1.getIsbn());
        System.out.println("descrição: "+l1.getDescricao());
        System.out.println(l1.toString());
        
        System.out.println("Titulo: "+l2.getTitulo());
        System.out.println("Autor: "+l2.getAutor());
        System.out.println("isbn: "+l2.getIsbn());
        System.out.println(l2.toString());
        
        
    }
}
