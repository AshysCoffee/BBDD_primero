package miPrimerprograma;

import java.util.Scanner;

public class AnnoBisiesto {

	public static void main(String[] args) {
		int diaActual, mesActual, annoActual;
		Scanner sc= new Scanner (System.in);
///////
		System.out.println("Introducir día actual");
		diaActual=sc.nextInt();

		System.out.println("Introducir mes actual");
		mesActual=sc.nextInt();
	
		System.out.println("Introducir día actual");
		annoActual=sc.nextInt();
		
		System.out.println("La fecha es: "+diaActual+"/"+mesActual+"/"+annoActual+"");
		
		if (diaActual>31 && mesActual>12) {
		 System.out.println("Fecha no válida");
		}//fecha invalida
		

		
		if (annoActual % 4 == 0) {
			if (mesActual == 02 && diaActual<=29) {
				System.out.println("Fecha Correcta");
			}
		}else{
			if (annoActual % 4 != 0){
				if (mesActual==02 && diaActual<=28) {
					System.out.println("Fecha Correcta");
			}else{
				if (mesActual==02 && diaActual>=29) {
					System.out.println("Fecha Incorrecta");
				}
			}
		}//para cuando no es bisiesto y febrero
	}//lo contrario de año bisiesto y febrero 29
		
//////
		
		if (diaActual<=31 || mesActual<=12) {
			if(mesActual==02 || diaActual<=28) {
				System.out.println("Fecha correcta");
				
		}else{
			if (mesActual==1 || mesActual==3 || mesActual==5 || mesActual==7 || mesActual==8 || mesActual==10  || mesActual==12) {
			System.out.println("Fecha correcta");
			
		}else{
			if (mesActual==4 || mesActual==6 || mesActual==9 || mesActual==11 ){
			System.out.println("Fecha correcta"); }
		}
	}	
}// fin de las fechas			
/////////

	if (annoActual % 4 ==0) {
		System.out.println("Este año es bisiesto");
	}else{
		System.out.println("Este año no es bisiesto");
		}//if de año
	sc.close();
	}//main

}//class
