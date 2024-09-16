package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================== <[Nombre del Heroe]> =============================================");
        System.out.print("¿Cual es tu nombre?: ");
        String Nombre = scanner.next();

        Personaje jugador = new Personaje(Nombre, 100);
        Movimiento punio = new Movimiento(3, "Puño", 5);
        Movimiento golpe = new Movimiento(1, "Golpe", 15);
        Movimiento barrido = new Movimiento(2, "Barrido", 30);
        jugador.agregarMovimiento(golpe);
        jugador.agregarMovimiento(punio);
        jugador.agregarMovimiento(barrido);

        Enemigo enemigo = Enemigo.generarEnemigoAleatorio();

        System.out.println("=================================================== <[Contrincante]> =================================================");
        System.out.println("¡Comienza el combate entre " + jugador.nombre + " y " + enemigo.nombre + "!\n");
        System.out.println(jugador.nombre + " - Vida: " + jugador.vida);
        System.out.println(enemigo.nombre + " - Vida: " + enemigo.vida);

        while (jugador.vida > 0 && enemigo.vida > 0) {
            System.out.println("=================================================== <[Heroe]> ======================================================");
            System.out.println("Turno de " + jugador.nombre + ": ");
            jugador.mostrarMovimientos();
            System.out.println("4. Curar (Restaura 50 de vida)");
            System.out.print("Selecciona tu movimiento: ");

            int opcionJugador = scanner.nextInt() - 1;
            if (opcionJugador == 3) {

                int vidaCurada = 50;
                jugador.vida += vidaCurada;

                if (jugador.vida > 100) {
                    jugador.vida = 100;
                }

                System.out.println("\n¡Has elegido Curar! Has restaurado " + vidaCurada + " de vida.");
                System.out.println("Tu vida actual es: " + jugador.vida);

            } else if (opcionJugador < 3 && opcionJugador > -1) {
                Movimiento movimientoJugador = jugador.movimientos.get(opcionJugador);
                System.out.println("\n¡Has elegido " + movimientoJugador.getNombre() + "!");
                enemigo.recibirDanio(movimientoJugador.getDanio());
                System.out.println("El enemigo " + enemigo.nombre + " recibe " + movimientoJugador.getDanio() + " de daño. Vida restante del enemigo: " + enemigo.vida);
            } else {
                System.out.println("\n¡Has elegido hace nada!");
                System.out.println("El enemigo no a recibido daño en este Turno");
            }

            if (enemigo.vida <= 0) {
                System.out.println("=================================================== <[Victoria]> =====================================================");
                System.out.println("¡Has derrotado al " + enemigo.nombre + "!");
                break;
            }

            System.out.println("=================================================== <[" + enemigo.nombre + "]> ==================================================");
            System.out.println("Turno del enemigo:");
            Movimiento movimientoEnemigo = enemigo.elegirMovimientoAleatorio();
            System.out.println("\nEl enemigo ha usado " + movimientoEnemigo.getNombre() + "!");
            jugador.recibirDanio(movimientoEnemigo.getDanio());
            System.out.println("Recibes " + movimientoEnemigo.getDanio() + " de daño. Vida restante del jugador: " + jugador.vida);

            if (jugador.vida <= 0) {
                System.out.println("=================================================== <[Derrota]> =====================================================");
                System.out.println("¡Has sido derrotado por el " + enemigo.nombre + "!");
                break;
            }
        }
        System.out.println("==================================================================================================================");
    }
}
