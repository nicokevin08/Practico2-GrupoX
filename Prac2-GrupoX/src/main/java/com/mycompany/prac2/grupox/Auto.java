package com.mycompany.prac2.grupox;

public class Auto extends Vehiculo {

    public Auto(int posX, int posY) {
        super(posX, posY);
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

    public void moverArriba() {
        if (posY > 0 && !chocado) {
            posY -= 1;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

    public void moverAbajo() {
        if (!chocado && posY < 22) {
            posY += 1;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

    public void moverDerecha() {
        if (!chocado && posX < 80) {
            posX += 1;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

    public void moverIzquierda() {
        if (posX > 0 && !chocado) {
            posX -= 1;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

}
