package agenda;

public class Agenda {
	//Atributos 
	private Contacto[] contactos;
	
	
	/**
	 * Constructor por defecto
	 */
	public Agenda() {
		//por defecto agenda de 10 
		this.contactos=new Contacto[10];
	}
	
	/**
	 * Crea una agenda de [num] contactos 
	 * @param num numero de contactos 
	 */
	public Agenda(int num) {
		this.contactos=new Contacto[num];
	}
	
	/**
	 * Método que comprueba si el contacto pasado por parámetro 
	 * está en el array de contactos, utilizando el método
	 * Equals de la otra clase, que compara los nombres
	 * @param c contacto a comprobar 
	 * @return true si existe, false si no
	 */
	public boolean existeContacto(Contacto c) {
		for(int i=0; i<contactos.length; i++) {
			if(contactos[i]!=null) {
				if(c.equals(contactos[i]) )
					return true;
			}
		}
		return false;
	}
	
	/**
	 * Indica si la agenda está llena, comprobando 
	 * si se ha creado algun objeto con el constructor vacío
	 * @return true si está llena, false si no
	 */
	public boolean agendaLlena() {
		for(int i=0; i<contactos.length; i++) {
			if(contactos[i]==null)
				return false;
		}
		//Si no encuentra ninguno vacío, está llena
		return true;
	}
	
	/**
	 * Añade un nuevo contacto a la agenda 
	 * @param c
	 */
	public void addContacto(Contacto c) {
		if(agendaLlena())
			System.err.println("La agenda está llena");
		else if(existeContacto(c))
			System.err.println("EL contacto ya existe");
		else {
			boolean añadido=false; 
				for(int i=0; i<contactos.length && !añadido; i++) {
					if(contactos[i]==null) {
						contactos[i]=c;
						añadido=true;
					}
				}	
			if(añadido)
				System.out.println("Se ha añadido el contacto en la agenda");
		}
	
	
	}
	
	/**
	 * Devuelve huecos libres de agenda
	 * @return int huecos
	 */
	public int huecosLibres() {
		int conta=0;
		for(int i=0; i<contactos.length; i++) {
			if(contactos[i]==null)
				conta++;
		}
		return conta;
	}
	/**
	 * Lista los contactos de la agenda 
	 */
	public void listarContactos() {
		//Primero comprobamos  si está vacía
		if(huecosLibres()==contactos.length)
			System.out.println("La agenda está vacía");
		else {
			System.out.println("Contactos: ");
			for(int i=0; i<contactos.length; i++) {
				if(contactos[i]!=null)
					System.out.println(contactos[i].toString());
			}
		}
		
	}
	/**
	 * Procedimiento que busca un contacto e imprime su teléfono si está en la agenda
	 * si no está, avisa al usuario
	 * @param nombre
	 */
	public void mostrarContacto(String nombre) {
		boolean encontrado=false;
		for(int i=0; i<contactos.length && !encontrado; i++) { //si encuentra al contacto para al bucle
			if(contactos[i]!=null) {
				if(nombre.trim().equalsIgnoreCase(contactos[i].getNombre().trim())); {
					System.out.println("Teléfono: "+contactos[i].getTelefono());
					encontrado=true;
				}
			}
		
		}
		if(!encontrado)
			System.err.println("-El contacto no se encuentra en la agenda");
		
	}
	/**
	 * Elimina el contacto 
	 * @param c
	 */
	public void eliminarContacto(Contacto c) {
		boolean encontrado=false;
		for(int i=0; i<contactos.length && !encontrado; i++) { 
			if(contactos[i]!=null) {
				if(contactos[i].nombreIgual(c)) {
					contactos[i]=null; //El contacto vuelve a null
					encontrado=true; //para el bucle
				}	
			}
		}
		if(encontrado)
			System.out.println("-Contacto eliminado");
		else
			System.err.println("-El contacto no se encuentra en la agenda");
	}
	
	
}
