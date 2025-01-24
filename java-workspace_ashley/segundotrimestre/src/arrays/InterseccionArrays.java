package arrays;
 
public class InterseccionArrays {

	public static void main(String[] args) {
		
		int [] array1 = {3,6,12,14,15,18,21,24,28,63};
		int [] array2 = {7,14,21,28,35,42,49,56,63,70};

		System.out.println("Los elementos que causan interseccion entre ambos arrays son: ");
		Metodos.Interseccion(array1, array2);
		
	}

}
