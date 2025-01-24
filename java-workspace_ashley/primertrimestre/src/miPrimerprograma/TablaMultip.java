package miPrimerprograma;

import java.util.Scanner;

public class TablaMultip {

	public static void main(String[] args) {
		int multiplicando, multiplicador, producto;
		Scanner sc= new Scanner(System.in);
		multiplicando=1;
		System.out.println("Introduzca el número");
		multiplicador=sc.nextInt();
		producto=multiplicador*multiplicando;
			System.out.println("Tabla de "+multiplicador+"");
			do {
				System.out.println(""+multiplicador+"x"+multiplicando+"="+producto+"");
				multiplicando++;
				}
			while (multiplicando<=10);
			System.out.println("La tabla del: "+multiplicador+"");
			sc.close();
	}//main
}//class
