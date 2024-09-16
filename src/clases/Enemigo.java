package clases;

import java.util.ArrayList;
import java.util.Random;

public class Enemigo {
    int vida;
    String nombre;
    ArrayList<Movimiento> movimientos;

    public Enemigo(String nombre, int vidaInicial) {
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

    public Movimiento elegirMovimientoAleatorio() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(movimientos.size());  
        return movimientos.get(indiceAleatorio); 
    }
}

