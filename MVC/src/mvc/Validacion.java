/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
import java.util.*;
/**
 *
 * @author TAKESHI
 */
public class Validacion {
    
    private Scanner in= new Scanner(System.in);  
    public int inEntero(){
        int entrada = 0;
        boolean valido = false;
        do {
            try {
                entrada = in.nextInt();
                valido = true;
            }catch (Exception e){
               this.mostrarError("Real");
               valido=true;
            }
        }while (!valido);
        return entrada;
    }
    public int inOpcion(){
        int opcion =0 ;
        boolean valido = false;
        do {
            int entrada = in.nextInt();
             if (entrada != 1 && entrada != 2){
                this.mostrarError("1 o 2");
            }           
            else {
                opcion = entrada;
                valido = true;
            }           
        } while (!valido);
        return opcion;
    }    
    private void mostrarError(String formato){
        System.out.println("Error de Formato.. "+ "Ingrese un valor con formato: " + formato + "\n" );
    }
}
