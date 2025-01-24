package poo.fecha;

import java.time.LocalDateTime;

public class Fecha {

	////////ATRIBUTOS
	private int dia, mes, anno;
    LocalDateTime hoy = LocalDateTime.now();  
    
	/////// CONSTRUCTORES
	public Fecha(int dia, int mes, int anno) {
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
	}
	
	public Fecha() {
	}

	
	////////////////// METODOS
	public void setDia (int dia) {
		this.dia=dia; 
	}
	public int getDia(){
		return dia;
	}
	
	public void setMes(int mes ) {
		this.mes=mes;
	}
	public int getMes(){
		return mes;
	}
	
	public void setAnno(int anno) {
		this.anno= anno;
	}
	public int getAnno(){
		return anno;
	}
	
	
	
	public boolean Equals(Fecha fecha) {
		if (this.anno==fecha.getAnno()) {
			if (this.mes==fecha.getMes()) {
				if (this.dia==fecha.getDia()){
					return true;
				}
			}
		}
		return false;
	}
	//////////
	
	public String toStringFecha(){
		String n="";
		
		//errores de fecha, strings
		if (this.dia>31 || this.dia<1) {
			n+="Error: La fecha es incorrecta, cambie el día.\n";
		}else{
			if (this.mes>12 || this.mes<1) {
				n+="Error: La fecha es incorrecta, cambie el mes.\n";
			}else{

				if (this.anno<0) {
					n+="Error: La fecha es incorrecta, cambie el año.\n";
				}
			}
		}	
			
		//año bisisesto	
		if (this.anno % 4 == 0) {
			if (this.mes == 02 && this.dia<=29) {

			}
		}else{
			if (this.anno % 4 != 0){
				if (this.mes==02 && this.dia<=28) {
				}else{
					if (this.mes==02 && this.dia>=29) {
						n+=("Error: Fecha Incorrecta, reintroduzca el día. El rango es de 1 a 28.\n");
					}
				}
			}
		}	

		if (this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10  || this.mes==12) {
			if (this.dia<=31 && this.dia>=1) {
				n+="";
			}else{
				n+=("Error: El día es erroneo, debe ser entre 1 y 31.\n");
			}	
		}
		
		if (this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11){
			if (this.dia<=30 && this.dia>=1) {
					n+="";
			}else{
				n+=("Error: El día es erroneo, debe ser entre 1 y 30.\n");
					
		}	
	}

		String s;
			s=("-----Fecha:-----\n");
			s+=(+dia+"/"+mes+"/"+anno+"\n");
			return s+n;
	
  }
	
	public String toFechaSistema() {
		String fecha;
		fecha=(hoy.getDayOfMonth()+"/"+hoy.getMonthValue()+"/"+hoy.getYear());
		return fecha;
	}
}

/*
 * Crear una clase Fecha, con atributos dia, mes y anno, que pueda ser construída indicando los tres atributos. Crear además 
 * los métodos necesarios para modificar la fecha en cualquier momento de forma manual. Mantenga la integridad de los datos en todo momento.
Crear una clase PruebaFecha que prueba una fecha concreta y la modifique a su gusto mostrándola por pantalla.

Crea una clase Fecha, con los tres atributos de dia,mes,anno.

 Crea dos constructores, el vacío, y el que tenga los tres parámetros

Crea los set()/get()

Crea el toString(), equals()

Comprueba que la fecha siempre sea integra. Ojo, con los métodos set()

Crea tb. un método que tome la fecha del sistema.

Prueba en un TestFecha, dos fechas, y cambia sus datos con los set().

Evalua si las fechas f1 y f2, son iguales o distintas.

*/
