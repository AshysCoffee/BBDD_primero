package miPrimerprograma;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		//declarar los methods
		try (Scanner sc = new Scanner(System.in)) {
			new DibujoAhorcado();
			//establecer variables
			int i,j=1,fallos=0;
			char letras=9;
			char [] comprobador_letras = new char [27];
			boolean acierto = false;

			System.out.println("Escribe tu palabra letra a letra, cuando hayas terminado escribe un punto .");
			//introduccion de la palabra
			for(i=0;letras!='.';i++) {
				//METEMOS NUESTRA PALABRA POR CHARS HASTA UN LENGTH DE 27 QUE LUEGO SE USARÁ PARA INTRODUCIR LAS LETRAS DEL ABECEDARIO (NOS AHORRAMOS PREGUNTAR AL USUARIO Y QUE CALCULE LA LONGITUD DE SU PALABRA)
				letras = sc.next().charAt(0);
				comprobador_letras [i] = letras;
			}
			//explicaicon propio: se escribe cada letra y cuadno sepone el punto se cierra y se guarda

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//ESTABLECEMOS LONGITUD DE ARRAYS SEGUN EL NUM DE LETRAS QUE SE INTRODUJO
			char [] palabra_final = new char [i];
			char [] huecos = new char [palabra_final.length];
			//ESTABLECEMOS LOS HUECOS QUE SE MOSTRARÁN
			for(i=0;(i+1)<palabra_final.length;i++) {
				//SECOPIA PALABRA AL ARRAY DE LA PALABRA SECRETA
				palabra_final[i]=comprobador_letras[i];
				huecos [i] = '_';
				System.out.print(" "+huecos[i]+" ");
			}

			letras = 'a';
			//se añaden todas las letras ABECEDARIO al array
			for(i=0;i<27;i++) {
				if(i==14) { 
					comprobador_letras [i]= 'ñ';
				}
				else {
					comprobador_letras [i]= letras;
					letras++;}

			}

			//juego
			while((fallos!=7)&&(j!=huecos.length)) {


				System.out.println("");
				letras = sc.next().charAt(0);

				for(i=0;i<27;i++) {

					if((i<palabra_final.length)&&(letras==palabra_final[i])) {
						huecos[i]=palabra_final[i];
						j++;
						acierto=true;
					}
					//ESTABLECEMOS LAS LETRAS USADAS COMO 0 PARA QUE SE ELIMINEN DEL FUTURO PRINT DE LETRAS RESTANTES
					if(letras==comprobador_letras[i]) {

						comprobador_letras[i]='0';
					}




				}

				if (acierto!=true){

					fallos++;

				}

				acierto=false;
				//PRINT DE LA PALABRA CON HUECOS
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				for(i=0;(i+1)<palabra_final.length;i++) {

					System.out.print(" "+huecos[i]+" ");

				}
				//FALLOS Y DIBUJO
				System.out.println("\n\n FALLASTE " + fallos + " VECES            ");
				DibujoAhorcado.dibujo(fallos);
				System.out.println("\n\n FALTAN POR USAR LAS SIGUIENTES LETRAS:        ");
				for(i=0;i<comprobador_letras.length;i++) {
					if(comprobador_letras[i]!='0') {
						System.out.print(comprobador_letras[i]+",");}
				}


			}

			sc.close();


			if(fallos==7) {
				System.out.println("\n\n PERDISTE CON "+ fallos +" FALLOS, BIEEEEEEN!!!!");
			}
			else {
				System.out.println("\n\n GANASTE CON "+ fallos +" FALLOS!!!!");
			}
		}
	}

}
