package com.mycompany.prac2.grupox;

public class Moto extends Vehiculo {

    public Moto(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void moverArriba() {
        if (posY > 0 && !chocado) {
            posY -= 10;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

    @Override
    public void moverAbajo() {
        if (!chocado && posY < 22) {
            posY += 10;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

    @Override
    public void moverDerecha() {
        if (!chocado && posX < 80) {
            posX += 10;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

    @Override
    public void moverIzquierda() {
        if (posX > 0 && !chocado) {
            posX -= 10;
            System.out.println("La posición es (" + posX + ", " + posY + ")");
        } else {
            System.out.println("NO SE PUEDE MOVER");

        }
    }

}
