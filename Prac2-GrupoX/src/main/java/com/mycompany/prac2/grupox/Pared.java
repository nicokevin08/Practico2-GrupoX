package com.mycompany.prac2.grupox;

public class Pared {

    private int posX;
    private int posY;

    public Pared() {
        posX = (int) (Math.random() * 75);
        posY = (int) (Math.random() * 17);
        System.out.println("La posicion de la PARED X,Y es " + posX + ", " + posY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

}
