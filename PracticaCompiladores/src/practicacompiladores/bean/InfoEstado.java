/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacompiladores.bean;

/**
 *
 * @author Cami
 */
public class InfoEstado {
    private String estado;
    private int coordenadaX;
    private int coordenadaY;

    public InfoEstado() {
    }

    public InfoEstado(int posicionX, int posicionY, String estado) {
        this.estado = estado;
        this.coordenadaX = posicionX;
        this.coordenadaY = posicionY;
    }

    public String getEstado() {
        return estado;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    
}
