package miPrimerprograma;

import java.util.Scanner;

public class TablaMultipPara {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int numero, linea;
		System.out.println("Introduzca el tamaño del dibujo: ");
		numero=new Scanner(System.in).nextInt();
		System.out.println("Línea con asteriscos");
		for (linea=1; linea<=numero; linea++){ //si se ingresa el tipo afuera ya no se pone el tipo dentro del para 
			System.out.print("*");
		}
		System.out.println("");
		new Scanner(System.in).close();
	}

}
