package poo.libro;

import poo.fecha.Fecha;
import poo.persona.Persona;

public class LibroTest {

	public static void main(String[] args) {
		Fecha f1 = new Fecha (16,11,2001);
		Persona p1 = new Persona (" Y. Daniel","Liang ");
		Libro l1 = new Libro ("Introduction to Java Programming", p1, "Prentice-Hall", "New Jersey", "USA", f1, 784, "3a", "0-13-031997-X" );

		System.out.println(l1.toStringLibro());
	}

}
