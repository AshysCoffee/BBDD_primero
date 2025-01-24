package arrays;

import java.util.Scanner;

public class NumCapicua {

	public static void main(String[] args) {
		int numero, tamanio;
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduzca el tamaño del número: ");
		tamanio=sc.nextInt();
		int [] consulta = new int [tamanio];
		
		for (int i=0; i<tamanio; i++) {
			System.out.print("Introduzca de uno en uno cada digito del número: ");
			numero=sc.nextInt();
			consulta[i]=numero;
		}	
		
		System.out.println("");
		
		for (int j=0; j<consulta.length; j++) {
			System.out.print(+consulta[j]);
		}
		
		System.out.print("");
		Metodos.esCapicua(consulta);
		
		sc.close();
	}

}


//PREGUNTA DE EXAMEN COMO VISUALIZAR UN ARRAY = CON ARRAYS.TOSTRING, CON UN FOR, O CON UN FOR EACH NI PURA IDEA XD 

//interseccion entre dos arrays (las coincidaentcias entre arrays)