package poo.direccion;

public class Direccion {

	private String tipovia, nombrevia, idPuerta, locali, provin, pais;
	private int portal, escalera, codpostal;
	
	public Direccion (String tipovia, String nombrevia, int portal) {
		this.tipovia=tipovia;
		this.nombrevia=nombrevia;
		this.portal=portal;
	}
	
	public Direccion (String tipovia, String nombrevia, int portal, int codpostal, String pais) {
		this.tipovia=tipovia;
		this.nombrevia=nombrevia;
		this.portal=portal;
		this.codpostal=codpostal;
		this.pais=pais;
	}
	
	public void setTipovia(String tipovia) { 
		this.tipovia=tipovia;
	} 
	public String getTipovia() { 
		return tipovia; 
	} 
	
	public void setNombrevia(String nombrevia) { 
		this.nombrevia=nombrevia;
	} 
	public String getNombrevia() { 
		return nombrevia; 
	} 
	
	public void setIdPuerta(String idPuerta) { 
		this.idPuerta=idPuerta;
	} 
	public String getIdPuerta() { 
		return idPuerta; 
	} 
	
	public void setLocali(String locali) { 
		this.locali=locali;
	} 
	public String getLocali() { 
		return locali; 
	} 
	
	public void setProvin(String provin) { 
		this.provin=provin;
	} 
	public String getProvin() { 
		return provin; 
	} 
	
	public void setPais(String pais) { 
		this.pais=pais;
	} 
	public String getPais() { 
		return pais; 
	} 

	
	
	public void setPortal(int portal) { 
		this.portal=portal;
	} 
	public int getPortal() { 
		return portal; 
	} 
	public void setEscalera(int escalera) { 
		this.escalera=escalera;
	} 
	public int getEscalera() { 
		return escalera; 
	} 
	public void setCodPostal(int codpostal) { 
		this.codpostal=codpostal;
	} 
	public int getCodPostal() { 
		return codpostal; 
	}
	
	public String toString() { 
		String s;
		s=("***DIRECCIONES***"+"\n"); 
		s+=("TIPO DE VÍA: " + tipovia+ "\n"); 
		s+=("NOMBRE DE LA VÍA: " + nombrevia+"\n"); 
		s+=("PORTAL: " + portal +"\n"); 
		s+=("ESCALERA: " + escalera +"\n"); 
		s+=("PUERTA: " + idPuerta +"\n"); 
		s+=("CODIGO POSTAL: " + codpostal+"\n"); 
		s+=("LOCALIDAD: " + locali +"\n");
		s+=("PROVINCIA: " + provin +"\n");
		s+=("PAIS: " + pais +"\n");
		return s;
	}	
}