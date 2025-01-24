package poo.libro;

import poo.fecha.Fecha;
import poo.persona.Persona;

public class Libro{

	private String titulo,editorial,ciudad,pais;
	Persona autor;
	Fecha fecha_edicion;
	private int ISBN, paginas, edicion;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, Persona autor, String editorial, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.ISBN=ISBN;
	}
	
	public Libro (String titulo, Persona autor, String editorial, String ciudad, String pais, Fecha fecha_edicion, int paginas, int edicion, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.ciudad=ciudad;
		this.pais=pais;
		this.fecha_edicion=fecha_edicion;
		this.ISBN=ISBN;
		this.paginas=paginas;
		this.edicion=edicion;
		
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setAutor(Persona autor) {
		this.autor=autor;
	}
	
	public Persona getAutor(){
		return autor;
	}
	
	public void setEditorial(String editorial) {
		this.editorial=editorial;
	}
	
	public String getEditorial(){
		return editorial;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
	
	public String getCiudad(){
		return ciudad;
	}
	
	public void setPais(String pais) {
		this.pais=pais;
	}
	
	public String getPais(){
		return pais;
	}
	
	public void setFechaEdicion(Fecha fecha_edicion) {
		this.fecha_edicion=fecha_edicion;
	}
	
	public Fecha getFechaEdicion(){
		return fecha_edicion;
	}
	
	
	public void setISBN(int ISBN) {
		this.ISBN=ISBN;
	}
	
	public int getISBN(){
		return ISBN;
	}
		
	public void setPaginas(int paginas) {
		this.paginas=paginas;
	}
	
	public int getPaginas(){
		return paginas;
	}
	
	public void setEdicion(int edicion) {
		this.edicion=edicion;
	}
	
	public int getEdicion(){
		return edicion;
	}
	
	public String toStringLibro () {
		String s;
		s=("Titulo: "+titulo+"\n");
		s+=("Edición: "+edicion+"\n");
		s+=("Editorial: "+editorial+"\n");
		s+=("Autor: "+autor.toStringPersona()+"\n");
		s+=("ISBN: "+ISBN+"\n");
		s+=("Lugar: "+ciudad+","+pais+"\n");
		s+=("Fecha: "+fecha_edicion.toStringFecha()+"\n");
		
		return s;
		
	}	
}

/*
 * Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro: título, autor (usa la clase Persona), 
 *ISBN, páginas, edición, editorial , lugar (ciudad y país) y fecha de edición (usa la clase Fecha). La clase debe proporcionar los siguientes servicios: 
 *accedentes y mutadores, método para leer la información y método para mostrar la información. Este último método mostrará la información del libro con este formato:


Título: Introduction to Java Programming
3a. edición
Autor: Liang, Y. Daniel
ISBN: 0-13-031997-X
Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de
2001
784 páginas
*/
