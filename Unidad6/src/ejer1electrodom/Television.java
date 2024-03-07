package ejer1electrodom;

public class Television extends Electrodomestico{
	//Constante
	final protected int RESOLUCION_DEF=20;
	
	//Atributo 
	protected int resolucion; //en pulgadas
	
	/**
	 * COnstructor por defecto 
	 */
	public Television() {
		super(); //coge constructor padre por defecto
		resolucion=RESOLUCION_DEF;
		
	}
	/**
	 * COnstructor con parámetros precio base y peso 
	 * @param precio base del articulo
	 * @param peso en kg
	 */
	public Television(double precio,double peso) {
		super(precio,peso);
		resolucion=RESOLUCION_DEF;
	}
	
	
	public Television(double preciobase, double peso, char consumo, String color,int resolucion) {
		super(preciobase,peso,consumo,color);
		this.resolucion = resolucion;
	}
	
	/**
	 * Devuelve el atributo resolucion 
	 * @return el resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}
	
	/**
	 * Función que devuelve el precio final haciendo uso de la función heredada
	 * y aumenta 30% si la resolucion(atributo tv) supera los 40 pulgadas
	 * @return double precio final
	 */
	public double precioFinal() {
		double preciofin=super.precioFinal();
		if(resolucion>40)
			preciofin+=preciobase*0.3;
		
		
		return preciofin;
	}
	/**
	 */
	@Override
	public String toString() {
		return "Television: " +"resolución="+ resolucion + ", preciobase=" + preciobase + ", peso=" + peso + ", consumo="
				+ consumo + ", color=" + color +", PRECIO FINAL: "+precioFinal();
	}
	
	
}
