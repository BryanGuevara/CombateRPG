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
  public Enemigo() {
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

    public static Enemigo generarEnemigoAleatorio() {
        Random random = new Random();
        int mounstro = random.nextInt(9);

        Enemigo enemigo = null;

        if (mounstro == 0) {
            enemigo = new Enemigo("Lobo Feroz", 100);
            Movimiento mordidaSuave = new Movimiento(1, "Mordida Suave", 10);
            Movimiento sarpazo = new Movimiento(2, "Sarpazo", 50);
            Movimiento arañazo = new Movimiento(3, "Arañazo", 20);
            enemigo.agregarMovimiento(mordidaSuave);
            enemigo.agregarMovimiento(sarpazo);
            enemigo.agregarMovimiento(arañazo);
        }

        if (mounstro == 1) {
            enemigo = new Enemigo("Monstruo de Baba", 80);
            Movimiento golpeGelatinoso = new Movimiento(1, "Golpe Gelatinoso", 15);
            Movimiento acidoCorrosivo = new Movimiento(2, "Ácido Corrosivo", 40);
            enemigo.agregarMovimiento(golpeGelatinoso);
            enemigo.agregarMovimiento(acidoCorrosivo);
        }

        if (mounstro == 2) {
            enemigo = new Enemigo("Avispón", 70);
            Movimiento picaduraVeneno = new Movimiento(1, "Picadura Venenosa", 25);
            Movimiento vueloRasante = new Movimiento(2, "Vuelo Rasante", 15);
            Movimiento aguijon = new Movimiento(3, "Aguijón", 30);
            enemigo.agregarMovimiento(picaduraVeneno);
            enemigo.agregarMovimiento(vueloRasante);
            enemigo.agregarMovimiento(aguijon);
        }

        if (mounstro == 3) {
            enemigo = new Enemigo("Oso", 150);
            Movimiento golpePesado = new Movimiento(1, "Golpe Pesado", 50);
            Movimiento rugido = new Movimiento(2, "Rugido", 10);
            Movimiento embestida = new Movimiento(3, "Embestida", 40);
            Movimiento mordida = new Movimiento(4, "Mordida", 35);
            enemigo.agregarMovimiento(golpePesado);
            enemigo.agregarMovimiento(rugido);
            enemigo.agregarMovimiento(embestida);
            enemigo.agregarMovimiento(mordida);
        }

        if (mounstro == 4) {
            enemigo = new Enemigo("Esqueleto", 90);
            Movimiento golpeHueso = new Movimiento(1, "Golpe de Hueso", 20);
            Movimiento rayoOscuro = new Movimiento(2, "Rayo Oscuro", 30);
            enemigo.agregarMovimiento(golpeHueso);
            enemigo.agregarMovimiento(rayoOscuro);
        }

        if (mounstro == 5) {
            enemigo = new Enemigo("Mago Oscuro", 120);
            Movimiento bolaSombria = new Movimiento(1, "Bola Sombría", 35);
            Movimiento tormentaOscura = new Movimiento(2, "Tormenta Oscura", 45);
            Movimiento maldicion = new Movimiento(3, "Maldición", 25);
            enemigo.agregarMovimiento(bolaSombria);
            enemigo.agregarMovimiento(tormentaOscura);
            enemigo.agregarMovimiento(maldicion);
        }

        if (mounstro == 6) {
            enemigo = new Enemigo("Dragón de Fuego", 200);
            Movimiento llamarada = new Movimiento(1, "Llamarada", 60);
            Movimiento golpeDeCola = new Movimiento(2, "Golpe de Cola", 40);
            Movimiento vueloIncendiario = new Movimiento(3, "Vuelo Incendiario", 50);
            enemigo.agregarMovimiento(llamarada);
            enemigo.agregarMovimiento(golpeDeCola);
            enemigo.agregarMovimiento(vueloIncendiario);
        }

        if (mounstro == 7) {
            enemigo = new Enemigo("Hombre Lobo", 130);
            Movimiento garraLetal = new Movimiento(1, "Garra Letal", 45);
            Movimiento mordidaLupina = new Movimiento(2, "Mordida Lupina", 35);
            enemigo.agregarMovimiento(garraLetal);
            enemigo.agregarMovimiento(mordidaLupina);
        }

        if (mounstro == 8) {
            enemigo = new Enemigo("Golem de Roca", 180);
            Movimiento golpeRoca = new Movimiento(1, "Golpe de Roca", 50);
            Movimiento terremoto = new Movimiento(2, "Terremoto", 60);
            enemigo.agregarMovimiento(golpeRoca);
            enemigo.agregarMovimiento(terremoto);
        }

        if (mounstro == 9) {
            enemigo = new Enemigo("Serpiente Venenosa", 60);
            Movimiento mordidaVeneno = new Movimiento(1, "Mordida Venenosa", 25);
            Movimiento constriccion = new Movimiento(2, "Constricción", 15);
            enemigo.agregarMovimiento(mordidaVeneno);
            enemigo.agregarMovimiento(constriccion);
        }

        return enemigo;
    }
}
