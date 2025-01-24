package matrices;

public class SumaProductoMatriz {

	public static void main(String[] args) {
		int [][] matriz1 = 
			{
					{4,2,1},
					{2,3,1},
					{2,5,4}
			};
		
		System.out.println("La matriz A: ");

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(+matriz1[i][j]+" ");
			}
			System.out.println();
		}
		
		int [][] matriz2 = 
			{
					{2,1,2},
					{1,4,3},
					{3,0,4}
			};
		
		System.out.println("La matriz B: ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(+matriz2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("");
		
		System.out.println("La suma de estas dos matrices son de: ");
		MetodoMatriz.SumaMatriz(matriz1, matriz2);
		
		
		System.out.println("");
		
		int [][] matrizA= 
			{
					{4,2,1},
					{2,3,1},
					{2,5,4}
			};

		int [][] matrizB = 
			{
					{2,1,2},
					{1,4,3},
					{3,0,4}
			};
		
		System.out.println("El producto de las matrices son: ");
		MetodoMatriz.ProductoMatriz(matrizA, matrizB);
	}

}
