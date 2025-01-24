package miPrimerprograma;

public class Pruebas {

	public static void main(String[] args) {
		int a ,b, vueltas;
		a=1;
		b=3;
		vueltas=0;
		for ( int i=a; i<= a+b; i++) {
			for (int j=a+b; j>=0; j--) {
				System.out.println("Las incognitas son: i="+i+" y j="+j);
				vueltas++;	
			}
			System.out.println("-----------");
		}
		System.out.println("vueltas: "+vueltas+"");

	}

}
