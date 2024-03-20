package com.mycompany.prac2.grupox;

import java.util.Scanner;

public class Escena {

    private Auto auto;
    private Pared pared;

    public Escena(Auto auto) {
        this.auto = auto;
        this.pared = new Pared();
    }

    public void jugar() {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Eliga Opcion ");
        System.out.println("W - Para ir hacia Arriba. ");
        System.out.println("S - Para ir hacia Abajo. ");
        System.out.println("A - Para ir hacia Izquierda. ");
        System.out.println("D - Para ir hacia Derecha. ");
        System.out.println("E - Para ir Salir. ");

        char op;
        do {

            op = Leer.next().charAt(0);
            switch (op) {
                case 'W', 'w':
                    auto.moverArriba();
                    break;
                case 'S', 's':
                    auto.moverAbajo();
                    break;
                case 'D', 'd':
                    auto.moverDerecha();
                    break;
                case 'A', 'a':
                    auto.moverIzquierda();
                    break;

                case 'E', 'e':
                    System.out.println("FIN");
                    break;
                default:

                    System.out.println("Letra Incorrecta");
                    System.out.println("Ingrese nuevamente");
            }
            if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                auto.setChocado(true);
                System.out.println("CHOCASTE CHANO !!!");
            }
        } while (op != 'e' || op != 'E');

    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

}
