package com.acme;

public class Holamundo {
    public static void main(String[] args) {
       Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        msg.Saludar(nombre);
    }
}
