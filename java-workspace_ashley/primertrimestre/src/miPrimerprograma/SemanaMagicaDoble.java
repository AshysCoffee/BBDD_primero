package miPrimerprograma;

import java.util.Scanner;

public class SemanaMagicaDoble {

	public static void main(String[] args) {
		int dia;
		System.out.println("Día mágico de la semana");
		System.out.println("Introduzca el dia de la semana (1-7)");
		Scanner sc=new Scanner (System.in);
		dia=sc.nextInt();
		if(dia==1) System.out.println("Lunes"); 
		else if (dia==2) System.out.println("Martes");
		else if (dia==3) System.out.println("Miercoles");
		else if (dia==4) System.out.println("Jueves");
		else if (dia==5) System.out.println("Viernes");
		else if (dia==6) System.out.println("Sábado");
		else if (dia==7) System.out.println("Domingo");
		sc.close();
	}

}
