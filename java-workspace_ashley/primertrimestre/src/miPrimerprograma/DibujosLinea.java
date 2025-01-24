package miPrimerprograma;

import java.util.Scanner;

public class DibujosLinea {

	public static void main(String[] args) {
		int numero, linea;
		Scanner sc=new Scanner(System.in);
		linea=1;
		System.out.println("Introduzca el tamaño del dibujo");
		numero=sc.nextInt();
		while (linea<=numero) {
			System.out.print("*");
			linea++;
		}
		sc.close();
	}//main
}//class
