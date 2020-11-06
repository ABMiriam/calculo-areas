/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasstring;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class AreasString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    float circulo, cuadrado, radio, lado, altura, lado_rect;
    final float PI=3.14159f;
    float resultado;
    String menu_uno;
    String menu_dos;
    
    Scanner teclado =new Scanner (System.in);
    
    System.out.println ("Hola, vamos a calcular el área de tu forma geométrica:");
    System.out.println ("Escribe \"circulo\" o \"cuadrado\"");
        menu_uno=teclado.next ();
        menu_uno=menu_uno.toLowerCase();
        
        if (menu_uno.equals("circulo")){
            System.out.println ("Introduce el radio de tu círculo:");
                radio=teclado.nextFloat();
                    while (radio==0){
                    System.out.println ("Introduce un valor distinto a 0");
                    radio=teclado.nextInt ();
                    }
                    
                    resultado= (PI*(radio*radio));
                    System.out.println ("El área de tu círculo es: " +resultado);
        }
        
        else {
            if (menu_uno.equals("cuadrado")) {
            System.out.println ("Si quieres calcular el área de un cuadrado escribe \"cuadrado\", si es un rectángulo escribe \"rectangulo\"");
            menu_dos=teclado.next ();
            menu_dos=menu_dos.toLowerCase();
            
                if (menu_dos.equals ("cuadrado")) {
                    System.out.println ("Introduce el lado:");
                    lado=teclado.nextFloat();
                        while (lado==0){
                            System.out.println ("Introduce un valor distinto a 0");
                            lado=teclado.nextFloat();
                        } 
                    resultado= lado*lado;
                    System.out.println ("El área de tu cuadrado es: " +resultado);
                }
                else {
                    if (menu_dos.equals("rectangulo"));{
                        System.out.println ("Introduce la altura:");
                        altura=teclado.nextFloat ();
                        System.out.println ("Introduce la base;");
                        lado=teclado.nextFloat ();
            
                    resultado=altura*lado;
                    System.out.println ("El área de tu rectángulo es: "+resultado);
                    }
                }
            }
            else {
                System.out.println ("ERROR, elige una opción válida");
            }
        }
                        
                
        

}//cierra la clase
}//cierra todo
        


   