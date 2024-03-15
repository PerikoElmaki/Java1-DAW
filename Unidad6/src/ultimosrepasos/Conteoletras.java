package ultimosrepasos;



public class Conteoletras {
	
	public static boolean esConsonante(char c) {
		Character cc=Character.toUpperCase(c);
		
		if(esVocal(c))
			return false;
		else {
			if(cc>='B'&& cc<='Z')
				return true;
		}
		
		return false;
	
	}
	
	public static boolean esVocal(char  c) {
		
		char[] vocales= {'a','e','i','o','u'};
		
		for(int i=0; i<vocales.length; i++) {
			Character vocal=Character.valueOf(vocales[i]);
			if(vocal.equals(c))
				return true;
		}
		return false;
	}
	
	public static String acifrado(String acifrar,int clave) {
		String cifrado="";
		for(int i=0; i<acifrar.length(); i++) {
			if(acifrar.charAt(i)>='A' && acifrar.charAt(i)<='Z') {
				//aaqui es cuando le metes la clave, solo si es letra
				int c=acifrar.charAt(i)+clave;
				//si se pasa de la Z cuando sumas
				if((char)c>'Z')
					c-=26; //y da la vuelta
				cifrado+=(char)c;
			}else if(acifrar.charAt(i)>='a' && acifrar.charAt(i)<='z') {
				//sumas clave porque es letra 
				int c=acifrar.charAt(i)+clave;
				if((char)c>'z') //imporante el casting si no te dan por culo 
					c-=26;
				cifrado+=(char)c; //imporante el casting x2
				
			}else  //si no son letras (espacios o mierdas), no se suma na 
			cifrado+=acifrar.charAt(i);
		}
			
		return cifrado;
	}
	
	
	
	public static String descifrado(String cifrado,int clave) {
		String descifrado="";
		for(int i=0; i<cifrado.length(); i++) {
			if(cifrado.charAt(i)>='A' && cifrado.charAt(i)<='Z') {
				int c=cifrado.charAt(i)-clave;
				if((char)c<'A')
					c+=26;
				descifrado+=(char)c;
			}else if(cifrado.charAt(i)>='a' && cifrado.charAt(i)<='z') {
				int c=cifrado.charAt(i)-clave;
				if((char)c<'a')
					c+=26;
				descifrado+=(char)c;
				//Si son letras ya lo hemos comprobado
			}else  //si son espacios 
			descifrado+=cifrado.charAt(i);
		}
			
		return descifrado;
	}

	public static void main(String[] args) {
		System.out.println(esVocal('F '));
		System.out.println(esVocal('o'));
		System.out.println(esVocal('e'));
		System.out.println(esConsonante('i'));
		System.out.println(esConsonante('y'));
		System.out.println(esConsonante('W'));
		
		System.out.println();
		
		StringBuffer pp=new StringBuffer("pepe");
		pp.reverse();
		String p=String.valueOf(pp);
		System.out.println(p);
		
		System.out.println(p.indexOf('p'));
		System.out.println(p.indexOf('a'));
		
		String n="Ahora si hijo de PUTA a dormir zzZZz fernando no me metas ese diglett por el culo";
		String ncif=acifrado(n,5);
		System.out.println(ncif);
		System.out.println(descifrado(ncif, 5));
		/*
		String cadena=String.valueOf(84495);
		int ultimacifra=Integer.parseInt(cadena.substring(cadena.length()-1,cadena.length()));
		System.out.println(ultimacifra);
		*/

	}

}
