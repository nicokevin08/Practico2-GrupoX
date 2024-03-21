package com.mycompany.prac2.grupox;

public class Prac2GrupoX {

    public static void main(String[] args) {
        Vehiculo peugeot = new Auto(5, 10);
        Vehiculo benelli = new Moto(15, 60);
        Vehiculo mercerdez = new Camion(10, 32);

        Escena uno = new Escena(benelli);

        uno.jugar();
    }

}
