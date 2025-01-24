package miPrimerprograma;

import java.util.Scanner;

public class CajeroSupeer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double imp_inicial, imp_entrega, devolucion;
        int doscientos = 200, cien = 100, cincuenta = 50, veinte = 20, diez = 10, cinco = 5, dos = 2, uno = 1, cantidad;
        double cincuenta_cent = 0.50, veinte_cent = 0.20, diez_cent = 0.10, cinco_cent = 0.05, dos_cent = 0.02, uno_cent = 0.01;

        System.out.print("Introduzca el importe de la compra: ");
        imp_inicial = scanner.nextDouble();

        System.out.print("Importe entregado por el cliente: ");
        imp_entrega = scanner.nextDouble();

        devolucion = imp_entrega - imp_inicial;
        System.out.println("Importe a devolver: "+devolucion+"");

        if (devolucion < 0) {
            System.out.println("El importe entregado es insuficiente.");
        } else if (devolucion == 0) {
            System.out.println("No hay cambio a devolver.");
        } else {
            while (devolucion > 0) {  
                if (devolucion >= 200) {
                    cantidad = (int)(devolucion / doscientos);
                    devolucion -= cantidad * doscientos;
                    System.out.println(cantidad + " billete/s de 200");
                } else if (devolucion >= 100) {
                	cantidad = (int)(devolucion / cien);
                    devolucion -= cantidad * cien;
                    System.out.println(cantidad + " billete/s de 100");
                } else if (devolucion >= 50) {
                    cantidad = (int)(devolucion / cincuenta);
                    devolucion -= cantidad * cincuenta;
                    System.out.println(cantidad + " billete/s de 50");
                } else if (devolucion >= 20) {
                    cantidad = (int)(devolucion / veinte);
                    devolucion -= cantidad * veinte;
                    System.out.println(cantidad + " billete/s de 20");
                } else if (devolucion >= 10) {
                    cantidad = (int)(devolucion / diez);
                    devolucion -= cantidad * diez;
                    System.out.println(cantidad + " billete/s de 10");
                } else if (devolucion >= 5) {
                    cantidad = (int)(devolucion / cinco);
                    devolucion -= cantidad * cinco;
                    System.out.println(cantidad + " billete/s de 5");
                } else if (devolucion >= 2) {
                   cantidad = (int) (devolucion / dos);
                    devolucion -= cantidad * dos;
                    System.out.println(cantidad + " moneda/s de 2");
                } else if (devolucion >= 1) {
                    cantidad = (int)(devolucion / uno);
                    devolucion -= cantidad * uno;
                    System.out.println(cantidad + " moneda/s de 1");
                } else if (devolucion >= 0.5) {
                    cantidad = (int)(devolucion / cincuenta_cent);
                    devolucion -= cantidad * cincuenta_cent;
                    System.out.println(cantidad + " moneda/s de 0.50");
                } else if (devolucion >= 0.2) {
                    cantidad = (int)(devolucion / veinte_cent);
                    devolucion -= cantidad * veinte_cent;
                    System.out.println(cantidad + " moneda/s de 0.20");
                } else if (devolucion >= 0.1) {
                    cantidad = (int)(devolucion / diez_cent);
                    devolucion -= cantidad * diez_cent;
                    System.out.println(cantidad + " moneda/s de 0.10");
                } else if (devolucion >= 0.05) {
                    cantidad = (int)(devolucion / cinco_cent);
                    devolucion -= cantidad * cinco_cent;
                    System.out.println(cantidad + " moneda/s de 0.05");
                } else if (devolucion >= 0.02) {
                    cantidad = ((int)(devolucion / dos_cent));
                    devolucion -= cantidad * dos_cent;
                    System.out.println(cantidad + " moneda/s de 0.02");
                } else if (devolucion >= 0.01) {
                    cantidad = ((int)(devolucion / uno_cent));
                    devolucion -= cantidad * uno_cent;
                    System.out.println(cantidad + " moneda/s de 0.01");
                } else {
                    break;
                }
            }
        }

        scanner.close();

	}

}
