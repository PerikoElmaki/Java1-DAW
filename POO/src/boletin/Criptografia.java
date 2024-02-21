package boletin;

public class Criptografia {
	
	public String cifrado_Cesar(String mensaje) {
		String cifrado="";
		for(int i=0; i<mensaje.length(); i++) {
			int carac=mensaje.charAt(i);
			if((char)carac>='A'&& (char)carac<='Z') {
				if(carac+3>90)
					cifrado+=(char)(carac+3-25);
				else
					cifrado+=(char)(carac+3);
			}else if((char)carac>='a'&& (char)carac<='z') {
				if(carac+3>122)
					cifrado+=(char)(carac+3-25);
				else
					cifrado+=(char)(carac+3);
			}else
				cifrado+=(char)(carac);
				
		}
		return cifrado;
	}
	
	public String descifrado_Cesar(String cifrado) {
		String descifrado="";
		for(int i=0; i<cifrado.length(); i++) {
			int carac=cifrado.charAt(i);
			if((char)carac>='A'&& (char)carac<='Z') {
				if((carac-3)<60)
					descifrado+=(char)(carac-3+25);
				else
					descifrado+=(char)(carac-3);
			}else if((char)carac>='a'&& (char)carac<='z') {
				if((carac-3)<97)
					descifrado+=(char)(carac-3+25);
				else
					descifrado+=(char)(carac-3);
			}else
				descifrado+=(char)(carac);
		}
		return descifrado;
	}
	
	
	public static void main(String[] args) {
		String c="gola";
		
	
	}
}
