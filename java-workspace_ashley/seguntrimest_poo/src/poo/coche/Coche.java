package poo.coche;

public class Coche {

	//atributos
	private String marca, modelo, color;
	private int potencia, maletero, puertas, precio;

	//constructores aunque el this. algo se refiere al atributo y el otto entra por parametro

	public Coche() { 
		color = "plateado"; 
	}

	public Coche(String marca, String modelo, String color) { 
		this.marca = marca;
		this.modelo = modelo; 
		this.color = color;
	}
	public Coche(String marca, String modelo, int maletero, int 
			puertas) {
		this.marca = marca; 
		this.modelo = modelo; 
		this.color = "plateado"; 
		this.maletero = maletero; 
		this.puertas = puertas;
	}

	public Coche(String marca, String modelo, int maletero, int 
			puertas, int precio){
		this.marca = marca; 
		this.modelo = modelo; 
		this.color = "plateado"; 
		this.maletero = maletero; 
		this.puertas = puertas;
		this.precio = precio;
	}

	//getters and setters
	public void setMarca(String marca) { 
		this.marca = marca; 
	} 
	public String getMarca() { 
		return marca; 
	} 
	public void setModelo(String modelo) { 
		this.modelo = modelo; 
	} 
	public String getModelo() { 
		return modelo; 
	} 
	public void setColor(String color) { 
		this.color = color; 
	} 
	public String getColor() { 
		return color; 
	} 
	public void setPotencia(int potencia) { 
		this.potencia = potencia; 
	} 
	public int getPotencia() { 
		return potencia; 
	} 
	public void setMaletero(int maletero) { 
		this.maletero = maletero; 
	} 
	public int getMaletero() { 
		return maletero; 
	} 
	public void setPuertas(int puertas) { 
		this.puertas = puertas; 
	} 
	public int getPuertas() { 
		return puertas; 
	} 
	public void setPrecio(int precio) { 
		this.precio = precio; 
	} 
	public int getPrecio() { 
		return precio;
	}

	//el string pirque la profe quiere todo por string._.
	public String toString() { 
		String s;
		s=("*CARACTERÍSTICAS DEL coche*"+"\n"); 
		s+=("MARCA: " + marca+ "\n"); 
		s+=("MODELO: " + modelo+"\n"); 
		s+=("COLOR: " + color +"\n"); 
		s+=("POTENCIA: " + potencia + " CV."+"\n"); 
		s+=("MALETERO: " + maletero + " L."+"\n"); 
		s+=("NÚMERO DE PUERTAS: " + puertas+"\n"); 
		s+=("PRECIO: " + precio + " €"+"\n");
		return s;
	}


}
