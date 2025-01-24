package arrays;

import java.util.Arrays;

public class PorDosArray {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("Array Original");
		System.out.println(Arrays.toString(array));
		
		System.out.println("");
		System.out.println("Array Duplicada");
		Metodos.DuplicaValorArray(array);

		
	}

}
