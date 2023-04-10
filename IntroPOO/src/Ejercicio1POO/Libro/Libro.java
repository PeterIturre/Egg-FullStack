package Ejercicio1POO.Libro;

import java.util.Scanner;

public class Libro {

    //Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    //Constructores
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    //Gette and Setter
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    //Metodos
    public void CrearLibro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdusca el titulo del libro: ");
        titulo = input.next();
        System.out.println("Introdusca el autor del libro: ");
        autor = input.next();
        System.out.println("Introdusca el ISBN del libro: ");
        isbn = input.nextInt();
        System.out.println("Introdusca la cantidad de paginas del libro: ");
        numeroDePaginas = input.nextInt();
    }

    public void ImprimirDatos() {
        System.out.println(titulo + " " + autor + " " + isbn + " " + numeroDePaginas);
    }
}
