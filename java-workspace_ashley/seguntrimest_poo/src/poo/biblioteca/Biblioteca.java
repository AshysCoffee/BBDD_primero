package poo.biblioteca;

public class Biblioteca {

	private String nombBiblio, coleccion;

	public Biblioteca(String nombBiblio, String coleccion) {
		this.nombBiblio = nombBiblio;
		this.coleccion = coleccion;
	}

	public String getNombBiblio() {
		return nombBiblio;
	}

	public void setNombBiblio(String nombBiblio) {
		this.nombBiblio = nombBiblio;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	
}

/*
 *Una biblioteca tiene un nombre (String) y una colección de libros. Se requiere que la biblioteca tenga un constructor que reciba el nombre de la biblioteca e 
 *inicialize la colección de libros. La biblioteca posee  los métodos:

addLibro() agrega un libro a la biblioteca
deleteLibro() elimina un libro de la biblioteca.
listLibros()  visualiza todos los libros de la biblioteca.
El Libro tiene titulo, autor, editorial,isbn, todos String 

y año de publicación es un int.

Añade 3 Libros.(Cien años de soledad, Rayuela, la Tia Julia y el escribidor)

Visualiza lo libros.

Elimina un libro.

Visualiza los libros. 

tambien quiere que se vea un array con los libro sy se vea que numero s ele concede al libro (ID) y que si voy al ultimo hueco me de el nombre del ulitmo libro introducido
 *
 * */
 