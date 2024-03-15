package ultimosrepasos;

import java.util.*;

public class FechaHora {

	public static boolean esbisiesto(int anho) {
		if(anho%4==0 && (anho%400==0 || anho%100!=0))
			return true;
		return false;
	}
	public static boolean fechaOk(int dia,int mes,int anho) {
		if(anho==0)
			return false;
		if(mes<1 || mes>12)
			return false;
		int diasmes;
		if(mes==4 || mes==6 || mes==9 || mes==11)
			diasmes=30;
		else if(mes==2) {
			if(esbisiesto(anho))
				diasmes=29;
			else
				diasmes=28;
		}else
			diasmes=31;
		
		if(dia<1 || dia>diasmes)
			return false;
		
		return true;
			
	}
	public static boolean horaOK(int h,int m,int s) {
		if(h<0 || h>23)
			return false;
		if(m<0 || m>59)
			return false;
		if(s<0 || m>59)
			return false;
		
		return true;
	}
	
	public static String secsiguiente(int h,int m,int s) {
		s++;
		if(s>59) {
			s=0;
			m++;
			if(m>59) {
				m=0;
				h++;
				if(h>23)
					h=0;
			}
		}
		StringBuffer hora=new StringBuffer();
		if(h<10)
			hora.append('0');
		hora.append(h+":");
		
		if(m<10)
			hora.append('0');
		hora.append(m+":");
		
		if(s<10)
			hora.append('0');
		hora.append(s);
		
		return hora.toString();
	}
	public static String diasiguiente(int dia,int mes,int anho) {
		dia++;
		String diasig="";
		
		if(!fechaOk(dia, mes, anho)) {
			//diasmes 
			int diasmes;
			if(mes==4 || mes==6 || mes==9 || mes==11)
				diasmes=30;
			else if(mes==2) {
				if(esbisiesto(anho))
					diasmes=29;
				else
					diasmes=28;
			}else
				diasmes=31;
			
			
			if(dia>diasmes) {
				dia=1;
				mes++;
				if(mes>12) {
					mes=1;
					anho++;
					if(anho==0)
						anho=1;
				}	
			}	
		}
		if(dia<10)
			diasig="0";
		
		diasig+=dia+"/";
		
		if(mes<10)
			diasig+="0";
		
		diasig+=mes+"/";
		
		diasig+=anho;
		
		return diasig;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dia = 0; int mes = 0; int año = 0;
		int h; int m; int s; h=m=s=0;
		try {
			System.out.print("Dime el dia: ");
			dia=Integer.parseInt(sc.nextLine());
			
			System.out.print("Dime el mes: ");
			mes=Integer.valueOf(sc.nextLine());
			
			System.out.print("Dime el año: ");
			año=Integer.parseInt(sc.nextLine());
			
			System.out.println();
			System.out.print("Dime hora: ");
			h=Integer.parseInt(sc.nextLine());
			System.out.print("Dime min: ");
			m=Integer.parseInt(sc.nextLine());
			System.out.print("Dime sec: ");
			s=Integer.parseInt(sc.nextLine());
			
		} catch (Exception e) {
			System.err.println("ERROR en la introducción del tiupo de dartos");
		}
		
		if(fechaOk(dia, mes, año)) {
			System.out.println("Dia siguiente: "+diasiguiente(dia, mes, año));
		}else
			System.err.println("Fecha introducida incorrecta");
			
		if(horaOK(h, m, s))
			System.out.println("Segundo siguiente: "+secsiguiente(h, m, s));
		else
			System.out.println("mal");
		
		
		sc.close();

	}

}
