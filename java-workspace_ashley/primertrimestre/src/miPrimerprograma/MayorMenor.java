package miPrimerprograma;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		System.out.println("Ordena los números de mayor a menor");
		System.out.println("Introduzca los números");
		Scanner sc=new Scanner (System.in);
		numero1=sc.nextInt();
		numero2=sc.nextInt();
		numero3=sc.nextInt();
		System.out.println("La secuencia sería");
		
		if (numero1>numero2 && numero1>numero3 && numero2>numero3) 
			System.out.println(""+numero1+","+numero2+","+numero3+""); 
			
		else if (numero1>numero2 && numero1>numero3 && numero3>numero2) 
			System.out.println(""+numero1+","+numero3+","+numero2+"");
		
			else if (numero2>numero3 && numero3>numero1 && numero2>numero1) 
			System.out.println(""+numero2+","+numero3+","+numero1+"");
			
				else if (numero2>numero1 && numero1>numero3 && numero2>numero3) 
			System.out.println(""+numero2+","+numero1+","+numero3+"");
		
					else if (numero3>numero2 && numero3>numero1 && numero2>numero1)
			System.out.println(""+numero3+","+numero2+","+numero1+"");
			
						else if (numero3>numero2 && numero3>numero1 && numero1>numero2)
			System.out.println (""+numero3+","+numero1+","+numero2+"");

		sc.close();
	}//main

}//class


//bucle, leer sueldo, variables: sueldo, sueldomax, sueldomin, acumulad, contadossuedol, media sueldo