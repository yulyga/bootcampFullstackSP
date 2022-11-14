package Metodoboolean;
import java.util.Scanner;

public class Challenge1 {
    //private static final String String = null;

	public static void main( String args[] ) {
    	System.out.print("Ingrese la primera cadena de texto:");
        Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
    	System.out.print( "La primera cadena de texto es: " );
        System.out.println( cadena );
         
     	System.out.print("Ingrese la Subcadena de texto:");
        Scanner teclado2 = new Scanner(System.in);
		String subcadena = teclado.nextLine();
		System.out.print( "La segunda cadena de texto es: " );
        System.out.println( subcadena );
		
		boolean resultado = validatebetween(cadena, subcadena);
		if(resultado==true) {
			System.out.print( "La cadena original contiene la subcadena " );
		}else {
			System.out.print( "La cadena original NO contiene la subcadena " );
		}
		System.out.println(resultado);
		
}
	
         public static boolean  validatebetween(String cad, String subcad) {
        	 boolean r;
        	 if (cad.contains(subcad)) {
        		 r=true; 
        	 }else {
        		 r=false; 
        	 }
        	 return r;
         }
		

}