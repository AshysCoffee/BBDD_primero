package miPrimerprograma;

public class TablasMultip1_10 {

	public static void main(String[] args) {
		int multiplicando, multiplicador, producto;
		multiplicador=1;
		multiplicando=1;
		producto=0;
		System.out.println("Tablas de multiplicar del 1 de 10");
		while (multiplicador<=10) {
			System.out.println("Tabla de "+multiplicador+"");
			while (multiplicando<=10) {
				producto=multiplicador*multiplicando;
				System.out.println(""+multiplicador+"x"+multiplicando+"="+producto+"");
				multiplicando++;
			}
			multiplicador++;
			multiplicando=multiplicando-10;	
		}//while

	}

}
