package miPrimerprograma;

import java.util.Scanner;

public class EcuacionDeSegundo {

	public static void main(String[] args) {
		double a,b,c,resultado_grado1, discriminando, x1,x2,x;
		Scanner sc=new Scanner(System.in);
		x=1;
		System.out.println("Calculadora de operaciones de segundo y primer grado, por favor introduzca sus valores a usar: ");
		System.out.println("Valor para a*x^2");
		a=sc.nextInt();
		System.out.println("Valor para b*x");
		b=sc.nextInt();
		System.out.println("Valor para c");
		c=sc.nextInt();
		resultado_grado1=(a*x*x)+b*x+c;
		discriminando=((b*b)-4*a*c);
		 
		 if (a==0){
			 System.out.println("Es una ecuación de primer grado");
			 resultado_grado1=(-(c/b));
			 System.out.println("El resultado es: "+resultado_grado1+"");
		 }else{
			 System.out.println("Es una ecuación de segundo grado:");
			 if (discriminando>0) {
				 x1=((-(b)+(Math.sqrt(discriminando)))/(a*2));
				 x2=((-(b)-(Math.sqrt(discriminando)))/(a*2));
				 System.out.println("Resultado 1: "+x1+"");
				 System.out.println("Resultado 1: "+x2+"");
				 System.out.println("Las soluciones son:  "+x1+" y "+x2+"");
				 
			 }else{
				 System.out.println("Ecuación no válida");
			 }//if de adentro
		 }//el if general
		 sc.close();
	}//main
}//class
