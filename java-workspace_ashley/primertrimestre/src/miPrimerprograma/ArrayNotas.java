package miPrimerprograma;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int alumnos, alumnos_encima,alumnos_abajo;
		float notamax, notamin, notas, media, dato;
		notas=0;
		notamax=notas;
		notamin=notas;
		media=0;
		alumnos_abajo=0;
		alumnos_encima=0;
		
		System.out.println("1º DAM");
		System.out.println("Modúlo: Sistemas Informáticos");
		System.out.print("Alumnos: ");
		alumnos=sc.nextInt();
		float [] notas_sistemas=new float[alumnos];
		
		for (int i=0; i<alumnos; i++) { //este for es para registar las notas en los arrays
		System.out.println("Ingrese la nota:");
		dato=sc.nextFloat();
		notas_sistemas[i]=dato;
		notas+=notas_sistemas[i];// acumuladro de todas las notas
		}
		
		media=notas/alumnos;
		notamin=notas_sistemas[0];
		notamax=notas_sistemas[0];
		
		System.out.println("Las notas introducidas son: ");
		for (int i=0; i<alumnos;i++) {
			System.out.println("("+notas_sistemas[i]+")");
			if(notas_sistemas[i]>notamax) {
				notamax=notas_sistemas[i];
			}
			else if (notas_sistemas[i]<notamin) {
				notamin=notas_sistemas[i];
			}
			
			if (notas_sistemas[i]>media) {
				alumnos_encima++;
			}
			else {
				alumnos_abajo++;
			}
		}	
		System.out.println("La nota media es "+media+"");
		System.out.println("Nota mínima "+notamin+"");
		System.out.println("Nota máxima "+notamax+"");
		System.out.println("Los alumnos por debajo de la media son: "+alumnos_abajo+"");
		System.out.println("Los alumnos por encima de la media son: "+alumnos_encima+"");
		sc.close();
	}

}
