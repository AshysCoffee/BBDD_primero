package matrices;

import java.util.Scanner;

public class DefinirIntroducirMatrices {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int [][] matriz1= //como declarar una matriz que si tiene los valores predeterminadoss
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
		
		int [][] matriz2 = new int [3][3];//como declarar una matriz sin valores predeterminados
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Haz una matriz de 3x3! :D");
		System.out.println("Por favor vaya ingresando los números:");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				matriz2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Aqui tienes la matriz :):"); //para imprimirlo en plantalla 
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(+matriz2[i][j]+" ");
			}
			System.out.println();
		} 
		sc.close();
	}

}
