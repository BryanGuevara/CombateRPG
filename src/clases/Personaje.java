package clases;

import java.util.ArrayList;

public class Personaje {
    int vida;
    String nombre;
    ArrayList<Movimiento> movimientos; 

    public Personaje(String nombre, int vidaInicial) {
        this.nombre = nombre;
        this.vida = vidaInicial;
        this.movimientos = new ArrayList<>();
    }

    public void agregarMovimiento(Movimiento movimiento) {
        movimientos.add(movimiento);
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void mostrarMovimientos() {
        for (int i = 0; i < movimientos.size(); i++) {
            Movimiento m = movimientos.get(i);
            System.out.println((i + 1) + ". " + m.getNombre() + " (Daño: " + m.getDanio() + ")");
        }
    }
}


