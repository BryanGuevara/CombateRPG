package clases;

public class Movimiento {
    private int id;
    private String nombre;
    private int danio;

    public Movimiento(int id, String nombre, int danio) {
        this.id = id;
        this.nombre = nombre;
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }
}