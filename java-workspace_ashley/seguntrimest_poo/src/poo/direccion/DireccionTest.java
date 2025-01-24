package poo.direccion;

public class DireccionTest {

	public static void main(String[] args) {
	Direccion datos1 = new Direccion ("Calle", "Zaratan", 2);
		datos1.setCodPostal(28037);
		datos1.setEscalera(0);
		datos1.setIdPuerta("B");
		datos1.setLocali("Madrid");
		datos1.setProvin("Madrid");
		datos1.setPais("España");
		System.out.println(datos1.toString());
		
		Direccion datos2 = new Direccion ("Calle", "Principe de Vergara", 108, 28044, "España");
		datos2.setEscalera(2);
		datos2.setIdPuerta("A");
		datos2.setLocali("Madrid");
		datos2.setProvin("Madrid");
		datos2.setPais("España");
		System.out.println(datos2.toString());
	}
	
}
