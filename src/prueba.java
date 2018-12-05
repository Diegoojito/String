/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class prueba {
   public static void main(String[] args){
        
    StringBuilder nombre = new StringBuilder("En un lugar de La Mancha de cuyo nombreno quiero acordarme");
        //ejerecicio Nº1
        nombre.append("vivia un caballero");
        String abc=nombre.toString();
        System.out.println(nombre);
        
        //Ejereciico Nº2
        String nombre2 = "";
        for(int i=0; i<nombre.length();i++){
            if(nombre.charAt(i)!='a'){
            nombre2+=nombre.charAt(i);
            }
        }
        System.out.println(nombre2);
        //Ejercicio Nº4
        nombre.delete(1, 10);
        System.out.println(nombre);
        //Ejercicio Nº5
        System.out.println(nombre.capacity());
        //Ejercicio Nº6
        nombre.deleteCharAt(10);
        System.out.println(nombre);
        //Ejercicio Nº7
        nombre.ensureCapacity(300);
        System.out.println(nombre);
        //Ejercicio Nº8
        char dst[]=new char[]{'c','a'};
        nombre.getChars(0, 10, dst, 0);
        System.out.println(nombre);
    }
        
        
  }

   


