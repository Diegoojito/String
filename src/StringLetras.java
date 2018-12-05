

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class StringLetras {
    public static void main(String[] args){
    
    //Ejercicio Nº1
    //Escribir un método que reciba un String 
    //y visualice cada letra en una línea.
    Scanner teclado = new Scanner(System.in); 
    System.out.println("¿Introduce una palabra?");
    String t=teclado.nextLine();
    String aux=texto(t);
    
    /*Ejerccio Nº2 Escribir un método que  reciba un String y un carácter y
    devuelva un entero queindicará cuántas veces se encuentra 
    el carácter en el string.*/
    String in=reves(t);
    System.out.println(in);
    /*
    Ejercicio Nº3
    Escribir un método que reciba un String y un carácter y devuelva un entero que
    indicará cuántas veces se encuentra el carácter en el string.
    */
    String s="Cadena 1";
    char b=0;
    int cuantos=cuantos(s,b);
    System.out.println (cuantos);  
    /*
    Escribir un método sinBlancos que reciba un String y 
    devuelva otro String sin
    caracteres en blanco (por ningún lado)
    */
    
    String sb=sinBlancos(t);
    System.out.println(sb);
    }
  public static String texto(String t){
        
        String a="";
        for(int i=0;i<t.length();i++){
        a+=t.charAt(i);
         System.out.println("Caracteres"+":"+a.charAt(i));
        }
        return a;
    }
     public static String reves(String c){
        String b="";
        for(int i=0;i<c.length();i++){
            b+=c.charAt(c.length()-i-1);
        }
        return b;
    }
     public static int cuantos (String s, char b){ 
          
	    String sTexto = "palabra o palabra y palabra";
	    String sTextoBuscado = "palabra";
	    int contador = 0;

	    while (sTexto.contains(sTextoBuscado)) {
	      sTexto = sTexto.substring(sTexto.indexOf(
	        sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	      contador++; 
	    }   
        return contador;
     } 
     public static String sinBlancos(String s ){
        String cb="hola";
            for( int i=0;i<s.length();i++){
              if(s.charAt(i)!=' ')cb+=s.charAt(i);
                
         }
         return cb;
     }
    public static String iniciales(String s){
        String ini="";
        boolean swNueva;
        int i=0;
        
        while(i<s.length()){
            swNueva=true;
            while(i<s.length() && s.chars(i)!=' '){
            
                if(swNueva==true){ini+=s.chars(i);swNueva=false;}
               
                i++;
            }
            while(i<length()&& s.chars(i)==' ')i++;
        } 
        return ini.toUpperCase();
    }
}

    


  

