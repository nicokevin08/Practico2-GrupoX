package com.mycompany.prac2.grupox;

import java.util.Scanner;

public class Escena {

    private Vehiculo vehiculo;
    private Pared pared;

    public Escena(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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
                    vehiculo.moverArriba();
                    break;
                case 'S', 's':
                    vehiculo.moverAbajo();
                    break;
                case 'D', 'd':
                    vehiculo.moverDerecha();
                    break;
                case 'A', 'a':
                    vehiculo.moverIzquierda();
                    break;

                case 'E', 'e':
                    System.out.println("FIN");
                    break;
                default:

                    System.out.println("Letra Incorrecta");
                    System.out.println("Ingrese nuevamente");
            }
            if (vehiculo.getPosX() == pared.getPosX() && vehiculo.getPosY() == pared.getPosY()) {
                vehiculo.setChocado(true);
                System.out.println("CHOCASTE !!!");
            }
        } while (op != 'e' || op != 'E');

    }

}
