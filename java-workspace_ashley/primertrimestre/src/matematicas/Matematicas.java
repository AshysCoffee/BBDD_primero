package matematicas;

public class Matematicas {
	    
	    public static double sumar(double a, double b) { //clase estatica debido que tiene que aparecer lo mismo
	        return a+b;
	    }//suma de dos digitos y devuelve otro digito
	    
	    
	    public static double restar(double a, double b) {
	        return a-b;
	    }//resta de dos digitos y devuelve otro digito
	    
	    
	    public static double multiplicar(double a, double b) {
	        return a*b;
	    }//multiplica de dos digitos y devuelve otro digito
	    
	    
	    public static double dividir(double a, double b) {
	        if (b==0) {
	            System.out.println("Error: División por cero no esta permitida.");
	            return 0;
	     }//divide dos digitos menos el 0 y da el cociente
	        return a/b;
	    }
	    
	    public static double potencia(double a, double b) {
	    	if (b==0) {
	    		System.out.println("Si la potencia es 0, el resultado siempre será 1.");
	    	} 
	    	if (a==0) {
	    		System.out.println("Si la base es 0, elevado a cualquier número es 0");
	    		
	    	}
	    	
	    	double resultado;
    		resultado=1;
	    	if (b!=0) {
	    		for (int i=0; i<(int)b; i++) {
	    			resultado*=a;
	    		}
	    		
	    	}
	    	return resultado;
	     }// depende de las condiciones, al introducir un expone
	    
	    public static double valorabs(double a) {
	    	if (a>0) {
	    		return a;
	    	}
	    	if (a<0){
	    		a=-1*a;
	    	}
	    	return a;
	    }
	    
	    public static double modulo (double a, double b) {
	    	double raizcuadrada;
	    	raizcuadrada= (a*a)+(b*b);
	    	raizcuadrada= Math.sqrt(raizcuadrada);
	    	return raizcuadrada;
	    } 
	   //modulo, valor abs, potencia
	}//class
