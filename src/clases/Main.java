package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================== <[Nombre del Heroe]> =============================================");
        System.out.print("¿Cual es tu nombre?: ");
        String nombre = scanner.next();

        Personaje jugador = new Personaje(nombre, 100);
        Movimiento puño = new Movimiento(3, "Puño", 5);
        Movimiento golpe = new Movimiento(1, "Golpe", 15);
        Movimiento barrido = new Movimiento(2, "Barrido", 30);
        jugador.agregarMovimiento(golpe);
        jugador.agregarMovimiento(puño);
        jugador.agregarMovimiento(barrido);

        while (jugador.vida > 0) {
            Enemigo enemigo = Enemigo.generarEnemigoAleatorio(nombre);
            System.out.println("=================================================== <[Contrincante]> =================================================");
            System.out.println("¡Comienza el combate entre " + jugador.nombre + " y " + enemigo.nombre + "!\n");
            System.out.println(enemigo.obtenerDialogo() + "\n");
            mostrarVida(jugador, enemigo);

            while (jugador.vida > 0 && enemigo.vida > 0) {
                System.out.println("=================================================== <[Heroe]> ======================================================");
                System.out.println("Turno de " + jugador.nombre + ": ");
                jugador.mostrarMovimientos();
                System.out.println("4. Curar (Restaura 50 de vida)");
                System.out.println("0. No hacer nada");
                System.out.print("Selecciona tu movimiento: ");

                int opcionJugador = scanner.nextInt();

                if (opcionJugador == 4) {
                    int vidaCurada = 50;
                    jugador.vida += vidaCurada;

                    if (jugador.vida > 100) {
                        jugador.vida = 100;
                    }

                    System.out.println("\n¡Has elegido Curar! Has restaurado " + vidaCurada + " de vida.");
                    System.out.println("Tu vida actual es: " + jugador.vida + "/100");

                } else if (opcionJugador > 0 && opcionJugador <= 3) {
                    Movimiento movimientoJugador = jugador.movimientos.get(opcionJugador - 1);
                    System.out.println("\n¡Has elegido " + movimientoJugador.getNombre() + "!");
                    enemigo.recibirDanio(movimientoJugador.getDanio());
                    System.out.println("El enemigo " + enemigo.nombre + " recibe " + movimientoJugador.getDanio() + " de daño. Vida restante del enemigo: " + enemigo.vida);
                } else if (opcionJugador == 0) {
                    System.out.println("\nEl jugador ha decidido no hacer nada. El enemigo no ha recibido daño en este turno.");
                } else {
                    System.out.println("\n¡Opción no válida! Intenta de nuevo.");
                    continue; // Repetir el turno
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
                System.out.println("Recibes " + movimientoEnemigo.getDanio() + " de daño. Vida restante del jugador: " + jugador.vida + "/100");

                if (jugador.vida <= 0) {
                    System.out.println("=================================================== <[Derrota]> =====================================================");
                    System.out.println("¡Has sido derrotado por el " + enemigo.nombre + "!");
                    break; // Salir del ciclo interno
                }
            }
        }
        System.out.println("Gracias por jugar! El juego ha terminado.");
        System.out.println("==================================================================================================================");
    }

    private static void mostrarVida(Personaje jugador, Enemigo enemigo) {
        System.out.println(jugador.nombre + " - Vida: " + jugador.vida + "/100");
        System.out.println(enemigo.nombre + " - Vida: " + enemigo.vida);
    }

}
