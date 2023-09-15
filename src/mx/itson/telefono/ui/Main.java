/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.telefono.ui;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         System.out.println("Ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        
        String nuevoTelefono = oracion.replace("(", "").replace(")", "").replace(" ", "").replace("-", "");
        
        /**
        Metodo Replace es utilizado para remplazar un caracter por otro
        
        */
        
        
        
        int guaymas = 0;
        int hermosillo = 0;
        int tijuana = 0;
        int desconocido = 0;
        
        /**
        Metodo int es para agregar una variable a la cual le adjudicaremos la suma
        
        */
        
         
             String[] resultado = oracion.split(",");
            for (String t: resultado){
                if (t.startsWith("622")){
                  
    guaymas++;
    tijuana++;
    hermosillo++;
    desconocido++;

    
             String[] resultado2 = oracion.split(",");
             for (String t2: resultado2){
                 if(t2.startsWith("662")){
                     
                     
             String[] resultado3 = oracion.split(",");
             for (String t3: resultado3){
                 if(t3.startsWith("664")){
                     
                     
        /**
        
        El metodo split lo usamos para separar desde un caracter especifico 
        Metodo startsWith es usadado para decirle a la consola que comience 
        o que adjudique una accion desde un caracter o caracteres especificos
        
        */
        
                     
                     
         guaymas += 0;            
         hermosillo += 0;            
         tijuana += 0;
         
         
          
          System.out.println(t);
          System.out.println(t2);
          System.out.println(t3);
                     
          
          
          
          
          
          
          
                 }
             }
                     
                     
                 }
             }       
                    
                }
            }
        
        
        
        
    
        
    }
    
}
