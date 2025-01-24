package poo.director;

public class PeliculaTest {

	public static void main(String[] args) {
		
		Director d1 = new Director("Woody Allen", 1935, "Francia");
		Pelicula p1 = new Pelicula();
			p1.setTitulo("Manhattan");
			p1.setAnno_creacion(1979);
			p1.setDirector(d1);
		System.out.println(p1.toStringPelicula());

		Director d2 = new Director ("Peter Jackson",1961,"Nueva Zelanda");
		Pelicula p2 = new Pelicula("El Señor de los Anillos");
			p2.setAnno_creacion(2001);
			p2.setDirector(d2);
		System.out.println(p2.toStringPelicula());
		
		Pelicula p3 = new Pelicula(d1);
			p3.setTitulo("Días de Radio");
			p3.setAnno_creacion(1987);
		System.out.println(p3.toStringPelicula());

		 p3.getDirector().setPais("Estados Unidos"); //cuando pones un punto despues de otro punto se desglosa el submenu
		 System.out.println(p3.toStringPelicula());
	}

}
