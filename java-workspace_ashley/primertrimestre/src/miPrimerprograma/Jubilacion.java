package miPrimerprograma;

import java.util.Scanner;

public class Jubilacion {

	public static void main(String[] args) {
		int diaActual,mesactual,anoactual, anonacim, mesnacim, dianacim, edad;
		boolean resultado;
		Scanner sc=new Scanner (System.in); //solo se pone una vez
		System.out.println("Introducir día actual");
		diaActual=sc.nextInt();

		System.out.println("Introducir mes actual");
		mesactual=sc.nextInt();
	
		System.out.println("Introducir día actual");
		anoactual=sc.nextInt();
		
		System.out.println("La fecha actual es: "+diaActual+"/"+mesactual+"/"+anoactual+"");
		
		////////
		System.out.println("Introducir día de nacimiento");
		dianacim=sc.nextInt();

		System.out.println("Introducir día de nacimiento");
		mesnacim=sc.nextInt();

		System.out.println("Introducir día de nacimiento");
		anonacim=sc.nextInt();
		System.out.println("La fecha actual es: "+dianacim+"/"+mesnacim+"/"+anonacim+"");
		
		edad=anoactual-anonacim;
		
		resultado=(edad>=65)&&(mesactual>=mesnacim)||(dianacim>=diaActual);
		System.out.println("¿Jubilado? "+resultado+"");
		
		sc.close();
	}

}
