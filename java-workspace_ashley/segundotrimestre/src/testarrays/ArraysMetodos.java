package testarrays;

public class ArraysMetodos {
	public static int BinarySearch (int x[], int valor) {
		for (int i=0; i<x.length;i++) {
			if (x[i]==valor) {
				System.out.println(+i);
			}

		}
		
	int contador=0;
		for (int i=0; i<x.length;i++) {
			if (x[i]!=valor) {
				contador++;
				if(contador==x.length) {
					System.out.println("-1");
					}
				}

			}
			return -1;
		}
	
	
	public static int Compare (int x[], int y[]) {
		int contador=0;
		for (int i=0; i<x.length;i++) {
				if(x[i]==y[i]) {
				contador++;
				
			}

		}
		
		for (int i=0; i<x.length;i++) {
			if (x[i]!=y[i]) {
				contador++;
				if(contador==x.length) {
					System.out.println("-1");
					}
				}

			}
		return -1 ;
	}
	
	public static boolean Equals (int x[], int y[]) {
		int contador=0;
		for (int i=0; i<x.length-1; i++) {
			if(x[i]==y[i]) {
				contador++;
			}
			
			if (contador==x.length-1) {
				return true;
			}
		}
		return false;
	}
	
	public static void Fill (int x[], int valor) {
		for (int i=0; i<x.length; i++) {
			x[i]=valor;
		}
	}
	
	public static void OfCopy (int x[], int y[]) {
		for (int i=0; i<x.length; i++) {
			x[i]=y[i];
		}
	}
	
	public static void Sort (int x[]) {
		for (int i=0; i<x.length-1; i++) {
            for (int j=0; j<x.length-i-1; j++) {
                if (x[j] > x[j + 1]) {
                    int aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
	}
	
	public static void ToString(int x[]) {	
		if(x.length!=0) {
		System.out.print("[");
		for (int i=0; i<x.length; i++) {
			System.out.print(x[i]);
			if (i<x.length-1) { 
				System.out.print(", ");
			}
		} 
		System.out.println("]");
		}
	}
}//no borrar
