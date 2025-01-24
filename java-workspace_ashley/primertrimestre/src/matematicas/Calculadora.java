package matematicas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 double numero1, numero2;
	 int opcion;
	 numero1=0;
	 numero2=0;
	 
		System.out.println("Bienvenido a la calculadora");
		do {
		 System.out.println("Seleccione una operación:");
		 System.out.println("1. Sumar");
		 System.out.println("2. Restar");
		 System.out.println("3. Multiplicar");
		 System.out.println("4. Dividir");
		 System.out.println("5. Potencia");
		 System.out.println("6. Valor absoluto");
		 System.out.println("7. Módulo");
		 System.out.println("8. Salir");
		 System.out.print("Opción: ");
		     opcion = scanner.nextInt();
		 System.out.print("");
		         if (opcion >= 1 && opcion <= 7) {
		             System.out.print("Ingrese el primer número o base: ");
		             numero1 = scanner.nextDouble();
		                
		             System.out.print("Ingrese el segundo número o exponente: ");
		             numero2 = scanner.nextDouble();
		         	
		         }else{	 
		             if (opcion==6) {
			             System.out.print("Ingrese el primer número ");
			             numero1 = scanner.nextDouble();}
		         }
		             
		    	if (opcion>8) {
		    			System.out.println("Opción inválida. Intente de nuevo.");
		    			System.out.print("");
		    			}
		    		     
			
		             switch (opcion) {
		                    case 1:
		                        System.out.println("Resultado: " + Matematicas.sumar(numero1, numero2));
		                        System.out.print("");
		                        break;
		                    case 2:
		                        System.out.println("Resultado: " + Matematicas.restar(numero1, numero2));
		                        System.out.print("");
		                        break;
		                    case 3:
		                        System.out.println("Resultado: " + Matematicas.multiplicar(numero1, numero2));
		                        System.out.print("");
		                        break;
		                    case 4:
		                        System.out.println("Resultado: " + Matematicas.dividir(numero1, numero2));
		                        System.out.print("");
		                        break;
		                        
		                    case 5:
		                        System.out.println("Resultado: " + Matematicas.potencia(numero1, numero2));
		                        System.out.print("");
		                        break;    
		                        
		                    case 6:
		                        System.out.println("Resultado: " + Matematicas.valorabs(numero1));
		                        System.out.print("");
		                        break;
		                        
		                    case 7:    
		                    	System.out.println("Resultado: " + Matematicas.modulo(numero1, numero2));
		                        System.out.print("");
		                        break;
 
		             }
		             
		             

		        }while (opcion != 8);
		
        
       	
		if (opcion == 8){
		        System.out.println("Gracias por usar la calculadora.");
		        System.out.print("");}
		        scanner.close();

		    }//main
		}//class