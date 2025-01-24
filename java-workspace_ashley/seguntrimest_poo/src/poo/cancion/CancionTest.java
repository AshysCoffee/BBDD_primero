package poo.cancion;

public class CancionTest {

	public static void main(String[] args) {
		Cancion c1=new Cancion();
		c1.setAutor("Ashnikko");
		c1.setTitulo("Paint The Town Blue");
		System.out.println(c1.toStringCancion());
		
		Cancion c2=new Cancion("Él","Jose Jose");
		System.out.println(c2.toStringCancion());
		
		System.out.println(c2.dameTitulo());
		System.out.println(c2.dameAutor());
		
		Cancion c3=new Cancion();
		c3.ponTitulo("Tu tanta falta de querer");
		c3.ponAutor("Mon Lafert");
		System.out.println(c3.toStringCancion());
	}

}
