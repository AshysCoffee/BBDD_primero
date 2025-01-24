package miPrimerprograma;

import java.util.Scanner;

public class MiPrimerJuego {

	public static void main(String[] args) {
		int eleccion_prin, eleccion_secun, eleccion_terci, victoria;
		victoria=0;
		Scanner sc=new Scanner (System.in);
		
        System.out.println("Bienvenido al laberinto, ¡vamos a encontrar el conejo!");
        System.out.println();

        do {
            System.out.println("Estás en una ramificación de caminos, elige sabiamente:");
            System.out.println("1. Ir por el bosque negro");
            System.out.println("2. Ir al prado de claveles");
            System.out.println("3. Ir al lago de cisnes");

            eleccion_prin = sc.nextInt();

            switch (eleccion_prin) {
                case 1:
                    System.out.println("Te encuentras con el cuervo, empieza a hablar y terminas olvidándote del conejo.");
                    victoria=0;
                    System.out.println("Por aquí no es! D:");
                    System.out.println("Elige otro camino");
                    break;

                case 2:
                    System.out.println("Avanzas por el prado");
                    System.out.println("¡Ves a un montón de animales!");
                    victoria = 1;
                    System.out.println();

                    while (victoria == 1) {
                        System.out.println("Elige tu siguiente movimiento:");
                        System.out.println("1. Seguir pasos extraños!");
                        System.out.println("2. Las flores son tan bonitas");
                        System.out.println("3. Te encuentras con un amigo");

                        eleccion_secun = sc.nextInt();

                        switch (eleccion_secun) {
                            case 1:
                                System.out.println("Seguir pasos extraños!");
                                victoria = 2;
                                System.out.println();
                                System.out.println("Elige tu sospecha, ¿1, 2 ó 3?");
                                
                                eleccion_terci = sc.nextInt();
                                
                                switch (eleccion_terci) {
                                    case 1:
                                        System.out.println("¿Un salamandra?");
                                        break;
                                    case 2:
                                        System.out.println("¿Una avestruz?? xD");
                                        break;
                                    case 3:
                                        System.out.println("¡El conejito!!");
                                        victoria = 3;
                                        if (victoria == 3) {
                                            System.out.println("¡Felicidades! Has elegido el camino correcto y llegaste a la meta.");
                                        }
                                        break;
                                    default:
                                        System.out.println("Opción no válida");
                                }
                                break;

                            case 2:
                                System.out.println("Las flores son tan bonitas! Recoges unas cuantas hasta que ves que las abejas se enojan.");
                                System.out.println("Por aquí no es! D:");
                                System.out.println("Elige otro camino");
                                System.out.println();
                                victoria = 0;
                                break;

                            case 3:
                                System.out.println("Te encuentras con un amigo, charláis y terminas olvidándote del conejo :(.");
                                System.out.println("Por aquí no es! D:");
                                System.out.println("Elige otro camino");
                                System.out.println();
                                victoria = 0;
                                break;

                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Bajas de camino y te diriges a un lago");
                    victoria = 0;
                    System.out.println("Por aquí no es! D:");
                    System.out.println("Elige otro camino");
                    break;

                default:
                    System.out.println("No disponible");
                    break;
            }
        } while (victoria!=3);

        System.out.println("Gracias por jugar.");
        sc.close();

	}//main

}//class
