package miPrimerprograma;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		int num_intro, divisores, divisor;
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Este número es primo o no?");
		System.out.println("Introduzca su número: ");
		num_intro=sc.nextInt();
		divisores=0;
		divisor=1;
		if (num_intro<=1) {
			System.out.println("Número no primo");
		}else{
			divisores=0;
			divisor=1;
			while (divisor<=num_intro) {
				if (num_intro % divisor == 0) {
					divisores++;
				}//if interno
				divisor++;
			}//while de adentro
			
			if (divisores==2) {
				System.out.println(""+num_intro+" es número primo");
			}else{
				System.out.println(""+num_intro+" no es número primo");
			}//fin de if
			
		}//fin if general
		sc.close();
	}//main
}//class
