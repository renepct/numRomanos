/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numromanos;

import java.util.Scanner;

/**
 *
 * @author Rene
 */
public class NumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String romano="";
        int numero;
        
        Scanner leer=new Scanner(System.in);
        System.out.print("INTRODUZCA EL NUMERO QUE DESEA CONVERTIR EN NUMEROS ROMANOS: ");
        numero= leer.nextInt();

     
      
      System.out.println( "El Numero romano es " +Numroman(numero));
              
    }
        static String Numroman(int numero){
            String romano = "";
            int i,mil, cent,dec,unid;
             
     
       
      mil = numero / 1000;
      cent = numero / 100 % 10;
      dec = numero / 10 % 10;
      unid = numero % 10;
            
      for (i = 1; i <= mil; i++) {
          romano = romano + "M";
      }
 
     
      if (cent == 9) {
          romano = romano + "CM";
      } else if (cent >= 5) {
                 romano = romano + "D";
                for (i = 6; i <= cent; i++) {
                    romano = romano + "C";
                     }
      } else if (cent == 4) {
                 romano = romano + "CD";
      } else {
                for (i = 1; i <= cent; i++) {
                     romano = romano + "C";
                  }
      }
 
     
      if (dec == 9) {
           romano = romano + "XC";
      } else if (dec >= 5) {
                 romano = romano + "L";
                      for (i = 6; i <= dec; i++) {
                            romano = romano + "X";
                      }
      } else if (dec == 4) {
                      romano = romano + "XL";
      } else {
                    for (i = 1; i <= dec; i++) {
                           romano = romano + "X";
                    }
      }
 
     
      if (unid == 9) {
           romano = romano + "IX";
      } else if (unid >= 5) {
                      romano = romano + "V";
                      for (i = 6; i <= unid; i++) {
                             romano = romano + "I";
                      }
      } else if (unid == 4) {
                      romano = romano + "IV";
      } else {
                  for (i = 1; i <= unid; i++) {
                         romano = romano + "I";
                  }
      }
      return romano;
 
    }
}
    

