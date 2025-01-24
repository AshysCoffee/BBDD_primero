package arrays;

import java.util.Arrays;

public class SumaArrays {

	public static void main(String[] args) {
		int [] array1 = {3,6,9,12,15,18,21,24,27,30};
		int [] array2 = {7,14,21,28,35,42,49,56,63,70};
		int [] array3 = new int [10];

		Metodos.SumaArray(array1, array2, array3);
		
		System.out.println(Arrays.toString(array3));
	}

}
