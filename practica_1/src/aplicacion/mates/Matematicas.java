package mates;

public class Matematicas{
	/*
	 * Genera una aproximación al número pi mediante el método de 
	 * Montecarlo. El parámetro "pasos" indica el número de puntos 
	 * generado.
	 */
	
	public static double generarNumeroPi(long pasos){
		double radio = 1;
		double areaCuadrado = 4;
		double areaCirculo = 0;
		double aciertos = 0;
		
		for(int i=1; i<=pasos; i++){
			double x = Math.random()*(1-(-1))+(-1); 
			double y = Math.random()*(1-(-1))+(-1); 
			
			if(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) <= 1) aciertos++;
		} 
		
		areaCirculo = areaCuadrado*(aciertos/pasos);
		
		return areaCirculo/Math.pow(radio,2);	
	}
}
