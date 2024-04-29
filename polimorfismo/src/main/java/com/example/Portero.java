package com.example;

public class Portero extends Futbolista {
    @Override
    public void jugar() {
        System.out.println("El portero está intentando parar el balón");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Manuel Neuer realiza una espectacular estirada para desviar el balón");
    }
}

