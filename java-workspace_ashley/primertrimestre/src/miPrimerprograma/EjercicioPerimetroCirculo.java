package miPrimerprograma;

import java.util.Scanner;

public class EjercicioPerimetroCirculo {

	public static void main(String[] args) {
		double radio, perimetro, pi;
		pi=3.1416;
		System.out.println("Introduce el radio");
		Scanner sc=new Scanner (System.in);
		radio=sc.nextDouble();
		perimetro=(2*pi*radio);
		System.out.println("El perimetro es "+perimetro+";");

		sc.close();
	}

}
