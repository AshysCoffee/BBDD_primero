package miPrimerprograma;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sueldo,sueldomax,sueldomin,acumul,contador;
		float media;
		System.out.println("Escriba el sueldo");
		sueldo=sc.nextInt();
		acumul=0;
		contador=0;
		media=0;
		sueldomax=sueldo;
		sueldomin=sueldo;
		while (sueldo != -1) {
			contador++;//es el contador<-contador+1c
			acumul+=sueldo;
			sueldomax=(sueldo>sueldomax)? sueldo:sueldomax; //ternario
			sueldomin=(sueldo<sueldomin)? sueldo:sueldomin; //ternario+
			System.out.println ("Escriba otro sueldo o -1 para terminar el cálculo");
			sueldo=sc.nextInt();
			
		}
		
		media=(acumul/contador);
		
		System.out.println("Sueldo máximo:"+sueldomax+"");
		System.out.println("Sueldo mínimo:"+sueldomin+"");
		System.out.println("Sueldo medio:"+media+"");
		System.out.println("Cantidad de sueldos insertados:"+contador+"");
		
		sc.close();
		
		

	}

}
