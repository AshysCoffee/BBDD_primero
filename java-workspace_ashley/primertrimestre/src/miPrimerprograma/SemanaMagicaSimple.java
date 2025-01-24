package miPrimerprograma;

import java.util.Scanner;

public class SemanaMagicaSimple {

	public static void main(String[] args) {
		int dia;
		System.out.println("Día mágico de la semana");
		System.out.println("Introduzca el dia de la semana (1-7)");
		Scanner sc=new Scanner (System.in);
		dia=sc.nextInt();
		
		if (dia==1) System.out.println("Lunes");
		if (dia==2) System.out.println("Martes");
		if (dia==3) System.out.println("Miercoles");
		if (dia==4) System.out.println("Jueves");
		if (dia==5) System.out.println("Viernes");
		if (dia==6) System.out.println("Sábado");
		if (dia==7) System.out.println("Domingo");
		sc.close();
	}

}
