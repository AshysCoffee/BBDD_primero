package ejemplos.poo;

public class EjemplosCositas {

	public static void main(String[] args) {
		String cad = "Mi perro \"Perico\" es de color blanco\n\n\n\n"; //se usa la barra \ para que n otermine la linea sino que las ponga
		System.out.print(cad);
		
		try {// esto es solo una prubea y las excepciones runtime no se pone estas cosas
			int [] array = new int [3];
			for (int i=0; i<5; i++) {
				array[i]=0;
			}
		}catch (IndexOutOfBoundsException e){
			System.out.println("Ese valor esta fuera de los límites");
			System.out.println("");
		}
		
		try {// esto es solo una prubea y las excepciones runtime no se pone estas cosas
			 int c;
			 c=4/0;
			System.out.println("El valor no es válido");
		}catch (ArithmeticException e){
			System.out.println("No se puede dividir entre 0");
		}
	}

}
