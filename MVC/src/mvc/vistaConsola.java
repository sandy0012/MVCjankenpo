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
public class vistaConsola {
    
   Random random= new Random();
   int opcion;
    private Modelo modelo;
    private Logica logica;

    public vistaConsola(Modelo modelo) {
        this.modelo = modelo;
        this.logica=logica;
    }
    public void Opciones(){
        Validacion validar=new Validacion();
        System.out.println("Ingrese el tipo de partida: ");
        System.out.println("1. J1 VS CPU");
        System.out.println("2. J1 VS J2");
       
        modelo.setTipo(opcion=validar.inOpcion());
    }
    
    public void iniciar(){
        Validacion validar=new Validacion();
        System.out.println("===== Inicio del Juego =====");
        int j1;
        
        int j2;
        int a=(int)(random.nextDouble()*3+1);
        
        
        System.out.println("PIEDRA, PAPEL ó TIJERA");
        System.out.println("El VideoJuego");
        System.out.println("Elegir Jugada:");
        System.out.println("1 - PIEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TIJERA");
        
        System.out.println("Ingrese el valor de J1: ");
        modelo.setNombreJ1(j1=validar.inEntero());
        if(opcion==1){
            modelo.setMaquina(a);
        }else if(opcion==2){
            System.out.println("Ingrese el valor de J2: ");
            modelo.setNombreJ2(j2=validar.inEntero());
        }
    
        }
    public void mostrarSalida(){
        System.out.println("=== FIN DE LA PARTIDA ===");
        System.out.println(modelo.getGanador());
    }
   
}
