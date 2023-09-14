/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercico;
  import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Practica4 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner moneda = new Scanner(System.in);
     
        System.out.println("Cantidad en moneda mexicana: ");
        double peso = moneda.nextInt();
      final double dolar = 17.13;
      final double euro = 18.29;
                      
      double valord = peso/dolar;
      double valore = peso/euro;
      
        
        System.out.println("Tu moneda en dolares vale: " + valord + " y en euros vale: " + valore);
        
    
    }
}
