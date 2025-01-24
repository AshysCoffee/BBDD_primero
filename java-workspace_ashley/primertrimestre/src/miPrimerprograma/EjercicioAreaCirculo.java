package miPrimerprograma;

import java.util.Scanner;

public class EjercicioAreaCirculo {

	public static void main(String[] args) {
		double radio, area, pi;
		pi=3.1416;
		System.out.println("Introduce el radio");
		Scanner sc=new Scanner (System.in);
		radio=sc.nextDouble();
		area=(pi*radio*radio);
		System.out.println("El área es "+area+";");

		sc.close();
	}

}
