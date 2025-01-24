package testarrays;

import java.util.Arrays;

public class ArraysPruebasPropias {

	public static void main(String[] args) {
	int [] array1 = {3,6,9,12,15,18,21,24,27,30};
	int [] array2 = {7,14,21,28,35,42,49,56,63,70};
	int [] array3 = new int [10];
	int [] array4 = {5,8,2,3,6,9,98,1,6,8,4,54,63,5,45,14,58};

	
	System.out.print("El número 18 se encuentra en la posición ");
	System.out.println((ArraysMetodos.BinarySearch(array1, 1)));


	System.out.println("");

	System.out.print("Ambos arrays coinciden en: (-1 indica que no coinciden en ningun apartado): ");
	System.out.println(ArraysMetodos.Compare(array1, array2));


	System.out.println("");


	System.out.println("¿Son equivalentes?");
	System.out.println(ArraysMetodos.Equals(array1, array2));


	System.out.println("");

	ArraysMetodos.Fill(array3, 1); 
	System.out.println(Arrays.toString(array3));

	System.out.println("");

	ArraysMetodos.Sort(array4);
	System.out.println(Arrays.toString(array4));
	
	System.out.println("");
	
	ArraysMetodos.ToString(array1);

	}

}
