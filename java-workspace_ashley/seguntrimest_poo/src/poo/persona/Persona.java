package poo.persona;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String colorOjos;
	private String colorPelo;


	//2.- Constructores
	//Constructor que necesita dni, nombre y apellidos para crear un objeto de tipo Persona
	public Persona (String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}

	
	public Persona (String dni, String nombre, String apellidos, String colorPelo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.colorPelo = colorPelo;
	}



	//3.- M�todos
	/*public String printData() {
			return dni+","+nombre+","+apellidos+","+direccion+","+colorOjos+","+colorPelo;
		}*/

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	public String getNombre() {
		return this.nombre;
	}


	public String getDni() {
		return this.dni;
	}

	public void setApellidos(String nuevosApellidos) {
		this.apellidos = nuevosApellidos;

	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setDireccion(String nuevaDireccion) {
		this.direccion = nuevaDireccion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setColorOjos(String nuevoColor) {
		this.colorOjos = nuevoColor;
	}

	public String getColorOjos() {
		return this.colorOjos;
	}

	public void setColorPelo(String nuevoColor) {
		this.colorPelo = nuevoColor;
	}

	public String getColorPelo() {
		return this.colorPelo;
	}

	public String toStringPersonaSimple() {
		String s;
		s= (apellidos+","+nombre);
		return s;
	}	
		
	public String toStringPersona() {
		String s;
		s= (dni+", "+nombre+" "+apellidos+", "+direccion+", "+colorOjos+", "+colorPelo);
		return s;
	}
	
}
