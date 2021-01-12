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
public class Logica {
     
    
    private int ptsUsuario=0; //puntos por partida
    private int ptsMaquina=0; //puntos por partida
    private int ronda=0;
    
    public Modelo Ronda(Modelo m){
       
        
        int j1;
        int j2;
        
        j1=m.getNombreJ1();
        if(m.getTipo()== 1){
            j2=m.getMaquina();
        }else{
             j2=m.getNombreJ2();
        }
        
        
        if((j1==1 && j2==3) || (j1==2 && j2==1) || (j1==3 && j2==2)){//casos en que gana el usuario
            ptsUsuario = ptsUsuario + 1;
            ronda++;
            System.out.println("J1 gana la Ronda ");   
        }
        if((j2==1 && j1==3) || (j2==2 && j1==1) || (j2==3 && j1==2)){//casos en que gana la maquina
            ptsMaquina = ptsMaquina + 1;
            ronda++;
            System.out.println("CPU gana la Ronda ");  
        }
        if(j1==j2){//casos donde empatan
            ptsUsuario = ptsUsuario + 1;
            ptsMaquina = ptsMaquina + 1;
            ronda++;
            System.out.println("RONDA EMPATADA!"); 
        }
        
        
           
        
        if(ronda==5){
        if(ptsUsuario > ptsMaquina){

            m.setGanador("J1 GANA LA PARTIDA!!");
            return m;
        }
        if(ptsMaquina > ptsUsuario){
            m.setGanador("CPU GANA LA PARTIDA!!");
            return m;
        }
        if(ptsUsuario == ptsMaquina){

            m.setGanador("¡¡PARTIDA EMPATADA!!");
            return m;            
        }
        }
        return m;
        
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }
    
    
   
}
