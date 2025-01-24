package miPrimerprograma;

import java.util.Scanner;

public class NumerosAmigos {

	public static void main(String[] args) {
		int num1,num2,div1,div2,divisor;
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Soun números amigos?");
		System.out.println("Introduzca los números: ");
		System.out.println("Número uno");
		num1=sc.nextInt();
		System.out.println("Número dos");
		num2=sc.nextInt();
		div1=0;
		div2=0;
		divisor=1;
		
		
		if (num1>=1) {
			div1=0;
			divisor=1;
			while (divisor<num1) {
				if (num1 % divisor==0) {
					div1=div1+divisor;
				}//if dentro del while
			divisor++;
			}//while1
			
			System.out.println("");
			if (num2>=1) {
				div2=0;
				divisor=1;
				while (divisor<num2) {
					if (num2 % divisor == 0) {
						div2=div2+divisor;
					}//fin de if
					divisor++;
				}//while inside
			}//ifdentro
		}//if original
		
		if (div1==num2 && div2==num1) {
			System.out.println(""+num1+" y "+num2+" son números amigos");
		}else{
			if (div1!=num2 && div2!=num1) {
			System.out.println(""+num1+" y "+num2+" no son números amigos");
			}
		}//cierre else
		sc.close();
	}//main
}//class
