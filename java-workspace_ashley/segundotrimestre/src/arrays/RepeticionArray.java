package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RepeticionArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int contador, valor;
		contador=0;
		int[] array= {-35,-30,0,-25,0,-15,-10,-5,0,5,10,0,20,25,30,0,40,0,50,55 };
		System.out.println(Arrays.toString(array));
		
		System.out.println("¿Que valor esta buscando en el array?");
		valor=sc.nextInt();
		
		Metodos.Repeticion(array, valor, contador);

		
		sc.close();
	}

}
