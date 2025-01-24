package miPrimerprograma;

import java.util.Scanner;

public class DibujoMedioRombo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int niveles1, asteriscos1, linea1, columna1;
		int niveles2, asteriscos2, linea2, columna2;
		linea1=1;
		asteriscos1=1;
		System.out.println("Introduzca el tamaño del rombo");
		System.out.println("Niveles de parte superior");
		niveles1=sc.nextInt();
		System.out.println("Niveles de parte inferior");
		niveles2=sc.nextInt();
		//////
		while (linea1<=niveles1) {
			columna1=1;
			while(columna1<=asteriscos1) {
				System.out.print("*");
				columna1++;
			}
			System.out.println("");
			linea1++;
			asteriscos1++;
		}//while1
		
		linea2=1;
		asteriscos2=niveles2;
		while (linea2<=niveles2) {
			columna2=1;
			while (columna2<=asteriscos2) {
				System.out.print("*");
				columna2++;
			}
			System.out.println("");
			linea2++;
			asteriscos2=asteriscos2-1;
		}
		sc.close();
	}//main
}//class
