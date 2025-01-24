package miPrimerprograma;

import java.util.Scanner;

public class SemanaMagicaMultiple {

	public static void main(String[] args) {
		int dia;
		System.out.println("Día mágico de la semana");
		System.out.println("Introduzca el dia de la semana (1-7)");
		Scanner sc=new Scanner (System.in);
		dia=sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes"); 
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
		sc.close();
	}

}
