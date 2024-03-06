package ejer1electrodom;

public class Electrodomestico {
	//Constantes 
	protected final static double preciodefecto=100;
	protected final static double pesodefecto=5;
	protected final static char consumodefecto='F';
	protected final static String colordefecto="blanco";
	
	//Atributos 
	protected double preciobase;  //Precio base del aparato 
	protected double peso;       //Peso del electrodoméstico 
	protected char consumo; 	//Consumo energético 
	protected String color;    //Color del aparato
	
	/**
	 * Constructor por defecto  
	 */
	public Electrodomestico() {
		preciobase=preciodefecto;
		peso=pesodefecto;
		consumo=consumodefecto;
		color=colordefecto;
	}
	/**
	 * COnstructor con dos parámetros 
	 * @param price precio base
	 * @param weight peso 
	 */
	public Electrodomestico(double price, double weight) {
		preciobase=price;
		peso=weight;
		consumo=consumodefecto;
		color=colordefecto;
	}
	/**
	 * COnstructor con todos los parámetros a establecer en atributos
	 * @param preciobase iny
	 * @param peso int
	 * @param consumo char A-F
	 * @param color string
	 */
	public Electrodomestico(double preciobase, double peso, char consumo, String color) {
		this.preciobase = preciobase;
		this.peso = peso;
		//hacemos uso de procedimineto para consumo
		comprobarConsumoEnergetico(consumo);
		//usamos procedimiento para el color 
		comprobarColor(color);
	}
	
	/**
	 * Devuelve el contenido del atributo
	 * @return
	 */
	public double getPreciobase() {
		return preciobase;
	}
	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}
	/**
	 * Devuelve el contenido del atributo peso
	 * @return peso-int
	 */
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Devuelve el contenido del atributo consumo 
	 * @return char 
	 */
	public char getConsumo() {
		return consumo;
	}
	
	/**
	 * Devuelve el contenido del atributo color
	 * @return string color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Función que devuelve el char del consumo energético si se encuentra
	 * entre la A y la F, si no devuelve por defecto 
	 * @param l char 
	 * @return de la A a la F, si no por defecto
	 */
	private void comprobarConsumoEnergetico(char l) {
		if(l>='A' && l<='F')
			consumo=l;
		else
			consumo=consumodefecto;
	}
	/**
	 * Procedimiento que comprueba y establece el color, si se encuentra dentro 
	 * de los establecidos, si no establece por defecto
	 * @param c color a comprobar 
	 */
	private void comprobarColor(String c) {
		switch(c.toLowerCase().trim()) {
			case "blanco":color=c;break;
			case "negro":color=c;break;
			case "rojo":color=c;break;
			case "azul":color=c;break;
			case "gris":color=c;break;
			default:color=colordefecto;break;
		}
		//mejorar haciendolo con un array y un bucle, con equals.
		
	}
	/**
	 * Función que devuelve el precio final sumando los atributos
	 * @return double- precio final
	 */
	public double precioFinal() {
		double preciofin=0;
		//establecemos consumo
		switch(consumo) {
			case 'A':preciofin=100;break;
			case 'B':preciofin=80;break;
			case 'C':preciofin=60;break;
			case 'D':preciofin=50;break;
			case 'E':preciofin=30;break;
			default:preciofin=10;break; //case 'F'
		}
		
		//Tiene en cuenta peso 
		if(peso>=0 && peso<=19)
			preciofin+=10;
		else if(peso>=20 && peso<=49)
			preciofin+=50;
		else if(peso>=50 && peso<=79)
			preciofin+=80;
		else if(peso>=80)
			preciofin+=100;
		
		
		preciofin+=preciobase;
		return preciofin;
	}
	
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Electrodomestico:"
				+"color= "+color+", peso= "+peso+"kg, consumo energético = "+consumo
				+", precio final= "+precioFinal();
				
	}
	
	
	
}
