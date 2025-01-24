package poo.coche;

public class CocheTest {

	public static void main(String[] args) {
		Coche miCoche1 = new Coche();
		miCoche1.setMarca("Audi"); 
		miCoche1.setModelo("A3"); 
		miCoche1.setColor("rojo"); 
		miCoche1.setPotencia(125); 
		miCoche1.setMaletero(425); 
		miCoche1.setPuertas(4); 
		miCoche1.setPrecio(26280); 
		System.out.println(miCoche1.toString());



		Coche miCoche2 = new Coche("Alfa Romeo","Giulietta","blanco");
		miCoche2.setPotencia(105);
		miCoche2.setMaletero(350);
		miCoche2.setPuertas(5); 
		miCoche2.setPrecio(21550); 
		System.out.println(miCoche2.toString());



		Coche miCoche3 = new Coche("Bentley", "Flying Spur", 475, 4, 244350); 
		miCoche3.setPotencia(625); 
		System.out.println(miCoche3.toString());
	}

}
