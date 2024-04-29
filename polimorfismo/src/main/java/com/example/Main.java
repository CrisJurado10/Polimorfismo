package com.example;

public class Main {
    public static void main(String[] args) {
        Futbolista miFutbolista = new Futbolista();
        Futbolista miDelantero = new Delantero();
        Futbolista miPortero = new Portero();

        miFutbolista.jugar(); 
        miFutbolista.usarHabilidadEspecial();
        
        miDelantero.jugar(); 
        miDelantero.usarHabilidadEspecial(); 
        
        miPortero.jugar(); 
        miPortero.usarHabilidadEspecial(); 
    }
}