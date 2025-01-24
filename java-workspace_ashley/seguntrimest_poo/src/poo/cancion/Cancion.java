package poo.cancion;

public class Cancion {

	private String titulo, autor;
	
	public Cancion() {
	}
	
	public Cancion(String titulo, String autor) {
		this.autor=autor;
		this.titulo=titulo;
	}
	
	////////////////////////////

	public void setTitulo (String titulo) {
		this.titulo=titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor (String autor) {
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}
	
	////////////////////
	
	public String dameTitulo(){
		String s;
		s=titulo;
		return s;
	}
	
	public String dameAutor(){
		String s;
		s=autor;
		return s;
	}

	public String ponTitulo(String s){
		titulo=s;
		return titulo;
	}
	
	public String ponAutor(String s){
		autor=s;
		return titulo;
	}
	
	public String toStringCancion() {
		String s;
		s=("+++++CANCIÓN+++++\n");
		s+=("Canción= "+titulo+"\n");
		s+=("Autor= "+autor+"\n");
		return s;
	}
}

/*
 * Desarrolla una clase Cancion con los siguientes atributos:
 titulo: una variable String que guarda el título de la canción.
 autor: una variable String que guarda el autor de la canción.


y los siguientes métodos:


 Cancion(String, String): constructor que recibe como parámetros el título y el
autor de la canción (por este orden).


 Cancion(): constructor predeterminado que inicializa el título y el autor a cadenas
vacías.


 dameTitulo(): devuelve el título de la canción.
 dameAutor(): devuelve el autor de la canción.
 ponTitulo(String): establece el título de la canción.
 ponAutor(String): establece el autor de la canción.
 * */
 