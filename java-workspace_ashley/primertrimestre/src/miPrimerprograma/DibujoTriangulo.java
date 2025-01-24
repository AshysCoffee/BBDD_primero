package miPrimerprograma;

import java.util.Scanner;

public class DibujoTriangulo {

	public static void main(String[] args) {
		int niveles, asteriscos, linea, columna;
		Scanner sc=new Scanner(System.in);
		linea=1;
		asteriscos=1;
		System.out.println("Introduzca el tamaño del dibujo: ");
		System.out.println("Niveles del triangulo: ");
		niveles=sc.nextInt();
		while (linea<=niveles) {
			columna=1;
			while(columna<=asteriscos) {
				System.out.print("*");
				columna++;
			}
			System.out.println("");
			linea++;
			asteriscos++;
		}//while principal
		sc.close();
	}//main
}//class
