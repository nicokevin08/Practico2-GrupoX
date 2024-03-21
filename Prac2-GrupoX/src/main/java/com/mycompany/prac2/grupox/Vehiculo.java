package com.mycompany.prac2.grupox;

public abstract class Vehiculo {

    protected int posX;
    protected int posY;
    protected boolean chocado;

    public Vehiculo(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isChocado() {
        return chocado;
    }

    public void setChocado(boolean chocado) {
        this.chocado = chocado;
    }

    public abstract void moverArriba();

    public abstract void moverAbajo();

    public abstract void moverDerecha();

    public abstract void moverIzquierda();

}
