package miPrimerprograma;

import java.util.Scanner;

public class TiposDatos {

	public static void main(String[] args) {
		
		int	numero;
		System.out.println("Introduce un numero");
		//leer teclado
		Scanner sc=new Scanner (System.in);
		numero=sc.nextInt();
		
		//escribir teclado
		System.out.println("El numero es "+numero+";");
		sc.close();
	}

}
