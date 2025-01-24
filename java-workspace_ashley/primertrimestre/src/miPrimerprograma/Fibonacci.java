package miPrimerprograma;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int numDigito, constante1, constante2, constante3, numResultado;
		Scanner sc= new Scanner (System.in);
		System.out.println("La secuancia de Fibonacci");
		System.out.println("¿Cuantos digitos de las secuencias quiere ver?");
		constante1=0;
		constante2=1;
		numResultado=0;
		
		numDigito=sc.nextInt();
		
		if (numDigito==1) {
			System.out.println(""+constante1+"");}
		
		
		if (numDigito==2) {
				System.out.println(""+constante1+"");
				System.out.println(""+constante2+"");}
	
		if (numDigito>=3) 
			{	
			numResultado=0;
			System.out.println("0");
			System.out.println("1");
			do {
				constante3=constante1+constante2;
				System.out.println(""+constante3+"");
				constante1=constante2;
				constante2=constante3;
				numResultado++;
				}
			while (numResultado<=numDigito);
			}//if

		///////
		sc.close();
	}//main
}//class
