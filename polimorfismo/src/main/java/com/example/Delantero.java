package com.example;

public class Delantero extends Futbolista {
    @Override
    public void jugar() {
        System.out.println("El delantero está intentando marcar un gol");
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println("Leo Messi regatea a todos los defensas y prepara su zurda para realizar un gran tiro");
    }
}