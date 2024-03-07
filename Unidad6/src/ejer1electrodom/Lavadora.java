package ejer1electrodom;

public class Lavadora extends Electrodomestico{
	//Constante de carga
	final private int CARGA_DEF=5; //carga de la lavadora (kg)
	
	//Atributos 
	private int carga;
	
	/**
	 * Constructor por defecto 
	 */
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	/**
	 * Constructor con dos parámetros para atributos heredados
	 * @param precio double, clase padre
	 * @param peso double,clase padre
	 */
	public Lavadora(double precio,double peso) {
		super(precio,peso);
		this.carga=CARGA_DEF;
	}
	/**
	 * Constructor con todos los parámetros
	 * @param carga 
	 * @param preciobase
	 * @param peso
	 * @param consumo
	 * @param color
	 */
	public Lavadora(int carga,double preciobase,double peso,char consumo, String color) {
		super(preciobase,peso,consumo,color);
		this.carga = carga;
	}

	
	/**
	 * Función que devuelve el precio final haciendo uso de la función heredada
	 * y sumando 50 si la carga(atributo lavadora) supera los 30 kg
	 * @return double precio final
	 */
	public double precioFinal() {
		double incremento;
		if(carga>30)
			incremento=50+super.precioFinal();
		else
			incremento=super.precioFinal();
		
		return incremento;
	}
	/**
	 * Método que muestra por pantalla los atributos del objeto Lavadora
	 */
	@Override
	public String toString() {
		return "Lavadora: "+
				"carga=" + carga + 
				", preciobase=" + preciobase 
				+", peso=" + peso 
				+", consumo=" + consumo
				+", color=" + color+", PRECIO FINAL: "+precioFinal();
	}
	
	
	
	
	
}
