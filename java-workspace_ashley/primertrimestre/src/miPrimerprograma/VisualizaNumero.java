package miPrimerprograma;

import java.util.Scanner;

public class VisualizaNumero {

	public static void main(String[] args) {
		int numero;
		Scanner scanner=new Scanner (System.in);
		System.out.println("Introduzca un número");
		numero=scanner.nextInt();
		System.out.println(""+numero+"");
		scanner.close();
	}

}
