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
    private int coordenadaXsalida;
    private int coordenadaYsalida;
    private int coordenadaXentrada;
    private int coordenadaYentrada;

    public InfoEstado() {
    }

    public InfoEstado(int posicionX, int posicionY, 
                        String estado, 
                        int coordenadaXsalida, int coordenadaYsalida, 
                        int coordenadaXentrada, int coordenadaYentrada) {
        this.coordenadaX = posicionX;
        this.coordenadaY = posicionY;
        this.estado = estado;
        this.coordenadaXsalida = coordenadaXsalida;
        this.coordenadaYsalida = coordenadaYsalida;
        this.coordenadaXentrada = coordenadaXentrada;
        this.coordenadaYentrada = coordenadaYentrada;
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

    public int getCoordenadaXsalida() {
        return coordenadaXsalida;
    }

    public int getCoordenadaYsalida() {
        return coordenadaYsalida;
    }

    public int getCoordenadaXentrada() {
        return coordenadaXentrada;
    }

    public int getCoordenadaYentrada() {
        return coordenadaYentrada;
    }

    public void setCoordenadaXsalida(int coordenadaXsalida) {
        this.coordenadaXsalida = coordenadaXsalida;
    }

    public void setCoordenadaYsalida(int coordenadaYsalida) {
        this.coordenadaYsalida = coordenadaYsalida;
    }

    public void setCoordenadaXentrada(int coordenadaXentrada) {
        this.coordenadaXentrada = coordenadaXentrada;
    }

    public void setCoordenadaYentrada(int coordenadaYentrada) {
        this.coordenadaYentrada = coordenadaYentrada;
    }
    
    
}
