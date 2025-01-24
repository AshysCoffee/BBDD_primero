package miPrimerprograma;

import java.util.Scanner;

public class DibujosCuadrado {

	public static void main(String[] args) {
		int alto,ancho, linea,columna;
		Scanner sc=new Scanner(System.in);
		linea=1;
		System.out.println("Introduzca el tamaño del dibujo");
		System.out.println("Ancho del cuadrado");
		alto=sc.nextInt();
		System.out.println("Alto del cuadrado");
		ancho=sc.nextInt();
		while (linea<=ancho) {
			columna=1;
			while (columna<=alto) {
			System.out.print("*");
			columna++;
			}
			System.out.println("");
			linea++;
			}
		sc.close();
	}

}
