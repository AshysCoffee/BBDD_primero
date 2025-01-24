package miPrimerprograma;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumMagico {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Random random=new Random();
		
		int intento, numero, oportunidades, numMagico;
		
		numMagico=random.nextInt(1000)+1;
		intento=0;
		oportunidades=0;
		
		System.out.println("Juego: Adivina el número que pienso entre el 1 y 1000 :P");
        System.out.println("¿Cuántas oportunidades quieres? ");
        oportunidades = sc.nextInt();
        
        do {
        	System.out.println("Introduzca un valor: ");
        	numero = sc.nextInt();
        if (numMagico==numero) {
        	System.out.println("¡Enhorabuena lo has adivinado!");
        }else{
        	if (numMagico<numero) {
        		intento++;
                System.out.println("El número es menor, intentalo de nuevo");	
        }else{
            if (numMagico>numero) {
                intento++;
                System.out.println("El número es mayor, intentalo de nuevo");
                	
               }//fin de if
        	}//fin de else
        }//fin del do
     }//fin while 	
	   
        while (oportunidades>intento && numMagico!=numero);
        
        if (oportunidades == intento && numMagico!=numero) {
        	System.out.println("¡Oops, se terminaron las oportunidades!");
        }
        
        sc.close();
	}//main
}//class

