package testarrays;

import java.util.Arrays;

public class ArraysAPIPruebas {

	public static void main(String[] args) {

			int [] array1 = {3,6,9,12,15,18,21,24,27,30};
			int [] array2 = {7,14,21,28,35,42,49,56,63,70};
			int [] array3 = new int [10];
			int [] array4 = {5,8,2,3,6,9,98,1,6,8,4,54,63,5,45,14,58};

			
			System.out.print("El número 18 se encuentra en la posición ");
			System.out.println((Arrays.binarySearch(array1, 1))); //este metodo da un numero de vuelta y indica la poscion del valor buscado


			System.out.println("");

			System.out.print("Ambos arrays coinciden en: (-1 indica que no coinciden en ningun apartado): ");
			System.out.println(Arrays.compare(array1, array2));// este compara dos arryas y comprueban si coinciden en algun numero 


			System.out.println("");


			System.out.println("¿Son equivalentes?");
			System.out.println(Arrays.equals(array1, array2));//que sean del mismo tamaño y mismo contenido


			System.out.println("");

			Arrays.fill(array3, 1); //accion, no requiere syso + rellenar arrays vacios con un valor
			System.out.println(Arrays.toString(array3));// da un array a pantalla

			System.out.println("");

			Arrays.sort(array4); //organiza de mayor a menor los valores de un arrays
			System.out.println(Arrays.toString(array4));


	}

}
