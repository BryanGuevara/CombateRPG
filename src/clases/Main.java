package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Personaje jugador = new Personaje("Héroe", 100);
        Movimiento punio = new Movimiento(3, "Puño", 5);
        Movimiento golpe = new Movimiento(1, "Golpe", 15);
        Movimiento barrido = new Movimiento(2, "Barrido", 30);
        Movimiento estocada = new Movimiento(5, "Estocada", 50);
        jugador.agregarMovimiento(golpe);
        jugador.agregarMovimiento(punio);
        jugador.agregarMovimiento(barrido);
        jugador.agregarMovimiento(estocada);

        Enemigo enemigo = new Enemigo("Lobo Feroz", 100);
        Movimiento mordidaSuave = new Movimiento(1, "Mordida Suave", 10);
        Movimiento mordidaFuerte = new Movimiento(2, "Mordida Fuerte", 50);
        enemigo.agregarMovimiento(mordidaSuave);
        enemigo.agregarMovimiento(mordidaFuerte);

            System.out.println("=================================================== <[Contrincante]> =================================================");
        System.out.println("¡Comienza el combate entre " + jugador.nombre + " y " + enemigo.nombre + "!");

        while (jugador.vida > 0 && enemigo.vida > 0) {
            System.out.println("=================================================== <[Heroe]> ======================================================");
            System.out.println("Turno del jugador:");
            jugador.mostrarMovimientos();
            System.out.print("Selecciona tu movimiento: ");

            int opcionJugador = scanner.nextInt() - 1;
            Movimiento movimientoJugador = jugador.movimientos.get(opcionJugador);
            System.out.println("¡Has elegido " + movimientoJugador.getNombre() + "!");
            enemigo.recibirDanio(movimientoJugador.getDanio());
            System.out.println("El enemigo " + enemigo.nombre + " recibe " + movimientoJugador.getDanio() + " de daño. Vida restante del enemigo: " + enemigo.vida);

            if (enemigo.vida <= 0) {
            System.out.println("=================================================== <[Victoria]> =====================================================");
                System.out.println("¡Has derrotado al " + enemigo.nombre + "!");
                break;
            }

            System.out.println("=================================================== <[Lobo Feroz]> ==================================================");
            System.out.println("Turno del enemigo:");
            Movimiento movimientoEnemigo = enemigo.elegirMovimientoAleatorio();
            System.out.println("El enemigo ha usado " + movimientoEnemigo.getNombre() + "!");
            jugador.recibirDanio(movimientoEnemigo.getDanio());
            System.out.println("Recibes " + movimientoEnemigo.getDanio() + " de daño. Vida restante del jugador: " + jugador.vida);

            if (jugador.vida <= 0) { 
            System.out.println("=================================================== <[Derrota]> =====================================================");
                System.out.println("¡Has sido derrotado por el " + enemigo.nombre + "!");
                break;
            }
        }

        System.out.println("Fin del combate.");
            System.out.println("==================================================================================================================");
    } 
}
