package poo.pajaro;

public class PajaroTest {

	public static void main(String[] args) {
		Pajaro p1 =new Pajaro ();
		p1.setEdad(5);
		
		Pajaro p2 = new Pajaro ('a' ,11);
		p2.toStringColor();
		
		Pajaro p3 = new Pajaro ('g' ,3, "Agapornis");
		p3.toStringColor();
		
		System.out.println(p1.toStringPajaro());
		System.out.println(p2.toStringPajaro());
		System.out.println(p3.toStringPajaro());

	}

}
