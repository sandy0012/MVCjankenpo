/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author TAKESHI
 */
public class Controlador {
    private int ronda=0;
    private Modelo modelo;
    private vistaConsola vistaconsola;
    
    

    public Controlador() {
        modelo= new Modelo();
        vistaconsola= new vistaConsola(modelo);
        
    }
    
    public void controlar(){
        Logica logica = new Logica();
        vistaconsola.Opciones();
        do{
            vistaconsola.iniciar();
            logica.Ronda(modelo);
            ronda=logica.getRonda()+1;
            
        }while(ronda!=6);
        
        
       
        vistaconsola.mostrarSalida();
        
        
    }
 
    
    public static void main(String[] args){
        
        Controlador controlador= new Controlador();
        controlador.controlar();
    }
}
