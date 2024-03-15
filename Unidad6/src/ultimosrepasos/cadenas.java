package ultimosrepasos;

public class cadenas {
	
	public static String addCadena(String c, String ad) {
		StringBuffer cc=new StringBuffer(c+ad);
		String n=String.valueOf(cc);
		return n;
	}
	public static String reverseCadena(String c) {
		StringBuffer cc=new StringBuffer(c).reverse();
		String n=String.valueOf(cc);
		return n;
	}

	public static int findCadena(String c, String ad) {
		int conta=0;
		for(int i=0; i<c.length(); i++) {
			if(c.indexOf(ad, i)>=0)
				conta++;
		}
		return conta;
	}
	public static void main(String[] args) {
		System.out.println(addCadena("pepe", "chupa"));
		System.out.println(reverseCadena("pedro"));
		
		System.out.println(findCadena("pepe", "p"));
	}

}
