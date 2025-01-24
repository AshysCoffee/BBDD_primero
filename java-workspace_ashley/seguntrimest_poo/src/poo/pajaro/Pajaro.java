package poo.pajaro;

public class Pajaro {

	private static int numPajaros = 0;// estaticas son cosas que no hya que poner 
	private static int idPajaros = 10001;
	private char color;
	private int edad,id;
	private String especie;

	//métodos de la clase
	public Pajaro() { //constructor
		this.color = 'v';
		this.edad = 0;
		this.id=idPajaros++;// tiene que quedar en atriburo o el this y ahi hacer la accion
		nuevoPajaro();
	}
	public Pajaro(char c, int e) { //constructor
		this.color = c;
		this.edad = e;
		this.id=idPajaros++;// no se pasa como metodo y debe pasa por atributoooooo osea this.variable= atributo++
		nuevoPajaro();
	}
	
	public Pajaro(char c, int e, String tipo) { //constructor
		this.color = c;
		this.edad = e;
		this.especie = tipo;
		this.id=idPajaros++;
		nuevoPajaro();
	}

	static void nuevoPajaro() { //contaqodr de pajaros 1que se mete
		numPajaros++;
	}
	
	public void setEdad (int e){
		this.edad=e;
	}	
	
	public int getEdad (){
		return edad;
	}	

	public void setColor(char c) {
		this.color=c;
	}
	
	public char getColor() {
		return color;
	}
	
	public String toStringColor(){
		switch (color) {
		case 'v':
			return"Verde";
		case 'a':
			return"Azul";
		case 'g':
			return"Gris";
		case 'n':
			return"Negro";	
		case 'b':
			return"Blanco";
		default:
			return"Color no establecido";
		}
	}
	
	public void setEspecie (String tipo) {
		this.especie=tipo;
	}
	
	public String setEspecie() {
		return especie;
	}
	
	public String toStringPajaro() {
		String s;
		s=("----Pájaros----\n");
		s+=("IdPajaro= "+id+"\n");
		s+=("Color= "+toStringColor()+"\n");
		s+=("Edad= "+edad+"\n");
		s+=("Especie= "+especie+"\n");
		s+=("Números de pajaros introducidos: "+numPajaros);
		return s;
	}
}

// crear una clase que genera una clave por cada pajaro osea un contador por costructor que se va sumando cada que
//se ingrese unn nuevo pajaro, esto se le llamara id, tambien sabremos cuanto pajaeros hya creador en el momntento osea si hay 3 pues 3 osea eso variable eh idependniente
// pero en el caso del id es algo que se va sumando

//varios pajatos y monstrar sus datos, identig diferentes (empieza por 10001) y kluego el total de los pajaros