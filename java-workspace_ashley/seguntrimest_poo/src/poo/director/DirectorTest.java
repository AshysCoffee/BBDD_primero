package poo.director;

public class DirectorTest {

	public static void main(String[] args) {
		
		Director d1 = new Director("Will Smith", 1989, "EEUU"); 
		System.out.println(d1.toStringDirector());
		
		Director d2 = new Director("Buddy Allen", 1954, "Albania"); 
		System.out.println(d2.toStringDirector());
		
		Director d3 = new Director("Michael Jackson", 1976, "Broklynn"); 
		System.out.println(d3.toStringDirector());

	}

}
