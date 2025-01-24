package miPrimerprograma;

import java.util.Scanner;

public class MenuDelDia {

	public static void main(String[] args) {
		int numero;
		numero=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Restaurante Los Merardos");
			System.out.println("Introduzca que menú quiere desglosar: ");
			System.out.println("");
			System.out.println("1.Entrantes");
			System.out.println("2.Segundos");
			System.out.println("3.Postres");
			System.out.println("4.Salir");
			numero=sc.nextInt();
			System.out.println("");
			
			switch (numero) {
			case 1:{
				System.out.println("Entrantes");
		        System.out.println("1. Tapas");
		        System.out.println("2. Ensalada");
		        System.out.println("3. Patacones");
		        System.out.println("4. Pan con tomate");
		        System.out.println();	
		        break;
		        }
			
			case 2:{
				System.out.println("1. Cocido madrileño");
		        System.out.println("2. Ceviche");
		        System.out.println("3. Encebollado");
		        System.out.println("4. Arepas");
		        System.out.println();
		        break;   
			}

		        
			case 3:{
				System.out.println("Postres");
		        System.out.println("1. Brownies");
		        System.out.println("2. Cheesecake");
		        System.out.println("3. Ensalada de frutas");
		        System.out.println("4. Helado");
		        System.out.println();
		        break;
			}
		        
			case 4:{
				System.out.println("Salir");
				break;
				}
		        
			default:{
				System.out.println("Opción incorrecta"); 
				System.out.println();
				break;
				}
			}
		}
		while (numero<=4);
		
		sc.close();
	}

}
