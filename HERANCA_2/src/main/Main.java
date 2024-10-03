package main;

import packs.*;

public class Main {

	public static void main(String[] args) {
 
Vendedor p1 = new Vendedor(" Carol Locher ", " 324.435.654.78 ", " 10/03/2001 ", " 23/10/2021 ", 4.500,7 );
Gerente p2 = new Gerente(" Elisa Santos ", " 734.895.764.78 ", " 20/07/2003 ", " 21/06/2011 ", 3.200," Recursos Humanos " );
Cliente p3 = new Cliente(" Luisa Pires  " , " 544.675.894.28 ", " 16/04/2005 ", " Luisa2007@gmail.com "," 342567 ", " 15998765840 ");
	
System.out.println(p1); // exibe p1
System.out.println(p2); // exibe p3
System.out.println(p3); // exibe p4
	}
}
