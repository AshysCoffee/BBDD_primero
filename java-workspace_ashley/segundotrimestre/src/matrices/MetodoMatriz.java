package matrices;

public class MetodoMatriz {

	public static void SumaMatriz (int x[][], int y[][]) {
		int [][] resultado=new int [x.length][y.length];

		for (int i=0; i<x.length; i++) {
			for (int j=0; j<y.length; j++) {
				resultado[i][j]=x[i][j]+y[i][j];
			}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(+resultado[i][j]+" ");
			}
			System.out.println();
		} 
	}
	
	
	public static void ProductoMatriz (int x[][], int y[][]) {
		int [][] resultado=new int [x.length][y.length];

		for (int i=0; i<x.length; i++) {
			for (int j=0; j<y.length; j++) {
				resultado[i][j]=0;
				for (int k=0; k<x.length; k++) {
					resultado[i][j]+=(x[i][k]*y[k][j]);
				}
			}
		}
		
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<y.length; j++) {
				System.out.print(+resultado[i][j]+" ");
			}
			System.out.println();
		} 
	}
}
