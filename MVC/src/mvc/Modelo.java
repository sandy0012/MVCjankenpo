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
public class Modelo {
    
    private int nombreJ1;
    private int nombreJ2;
    private int maquina;
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String ganador;

    public int getMaquina() {
        return maquina;
    }

    public void setMaquina(int maquina) {
        this.maquina = maquina;
    }

    public int getNombreJ1() {
        return nombreJ1;
    }

    public void setNombreJ1(int nombreJ1) {
        this.nombreJ1 = nombreJ1;
    }

    public int getNombreJ2() {
        return nombreJ2;
    }

    public void setNombreJ2(int nombreJ2) {
        this.nombreJ2 = nombreJ2;
    }
     public String getGanador(){
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    
    
    
    
    
    
}
