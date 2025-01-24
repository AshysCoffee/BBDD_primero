package miPrimerprograma;

import java.util.Scanner;

public class DibujpoTrianguloReves {

	public static void main(String[] args) {
		int niveles, asteriscos, linea, columna;
		Scanner sc=new Scanner(System.in);
		linea=1;
		System.out.println("Introduzca el tamaño del dibujo: ");
		System.out.println("Niveles del triangulo: ");
		niveles=sc.nextInt();
		asteriscos=niveles;
		while (linea<=niveles) {
			columna=1;
			while (columna<=asteriscos) {
				System.out.print("*");
				columna++;
			}
			System.out.println("");
			linea++;
			asteriscos=asteriscos-1;
		}//while principal
		sc.close();
	}//main

}//class
