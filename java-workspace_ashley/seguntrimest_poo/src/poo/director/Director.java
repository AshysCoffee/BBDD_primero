package poo.director;

public class Director {
	
	private String nombre, pais;
	private int anno_nacimi;
	
	public Director(String nombre, int anno_nacimi, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.anno_nacimi = anno_nacimi;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getAnno_nacimi() {
		return anno_nacimi;
	}
	public void setAnno_nacimi(int anno_nacimi) {
		this.anno_nacimi = anno_nacimi;
	}

	public String toStringDirector() {
		String s;
		s=(nombre+", "+pais+", "+anno_nacimi + "\n");
		return s;
	}
	
	
}
