/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioe_2.utilidades;

/**
 *
 * @author fabla
 */
public class Puntos {
    
    private Double X1;
    private Double Y1;
    private Double X2;
    private Double Y2;

    public Puntos() {
    }

    public Puntos(Double X1, Double Y1, Double X2, Double Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }

    public void setX1(Double X1) {
        this.X1 = X1;
    }

    public void setY1(Double Y1) {
        this.Y1 = Y1;
    }

    public void setX2(Double X2) {
        this.X2 = X2;
    }

    public void setY2(Double Y2) {
        this.Y2 = Y2;
    }

    public Double getX1() {
        return X1;
    }

    public Double getY1() {
        return Y1;
    }

    public Double getX2() {
        return X2;
    }

    public Double getY2() {
        return Y2;
    }
    
    
    
}
