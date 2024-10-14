package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemigo {

    int vida;
    String nombre;
    ArrayList<Movimiento> movimientos;
    String dialogo;

    public Enemigo(String nombre, int vidaInicial, String dialogo) {
        this.nombre = nombre;
        this.vida = vidaInicial;
        this.movimientos = new ArrayList<>();
        this.dialogo = dialogo;
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

    public String obtenerDialogo() {
        return dialogo;
    }

    public Movimiento elegirMovimientoAleatorio() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(movimientos.size());
        return movimientos.get(indiceAleatorio);
    }

    public static Enemigo generarEnemigoAleatorio(String NombreJugador) {

        Enemigo[] enemigos = new Enemigo[]{
           new Enemigo("Lobo Feroz", 100, "¡Auuuu! ¡Estoy listo para la caza!"),
            new Enemigo("Monstruo de Baba", 80, "Glup, glup... ¡Te disolveré!"),
            new Enemigo("Avispón", 70, "¡Zzzzzz! No escaparás de mi aguijón."),
            new Enemigo("Oso", 150, "Grrrrr... No tienes oportunidad contra mi fuerza."),
            new Enemigo("Esqueleto", 90, "¡Tic-tac! ¡El tiempo no está de tu lado!"),
            new Enemigo("Mago Oscuro", 120, "¡Las sombras están de mi lado!"),
            new Enemigo("Dragón de Fuego", 200, "¡Siente el ardor de mis llamas!"),
            new Enemigo("Hombre Lobo", 130, "¡Luna llena o no, siempre estaré hambriento!"),
            new Enemigo("Golem de Roca", 180, "Mi cuerpo es de piedra, ¡y tú no lo romperás!"),
            new Enemigo("Serpiente Venenosa", 60, "Ssss... ¡Mi veneno es letal!"),
            new Enemigo("Fantasma Errante", 60, "¡Te seguiré hasta el fin de los tiempos!"),
            new Enemigo("Troll de las Montañas", 120, "¡No pasarás sin pagar el peaje!"),
            new Enemigo("Duende Travieso", 50, "¡Jejeje, te haré una pequeña trampa!"),
            new Enemigo("Banshee", 75, "¡Escucha mi lamento, humano!"),
            new Enemigo("Minotauro", 140, "¡El laberinto será tu perdición!"),
            new Enemigo("Vampiro", 90, "La noche es joven, y tengo sed."),
            new Enemigo("Zombi", 80, "Cerebroooos..."),
            new Enemigo("Criatura del Pantano", 100, "Este barro será tu tumba."),
            new Enemigo("Reptil Volador", 70, "¡Nadie puede escapar de mis garras desde el cielo!"),
            new Enemigo("Hechicero Elemental", 110, "¡Domino todos los elementos, mortal!"),
            new Enemigo("Fénix", 120, "De mis cenizas, ¡renaceré!"),
            new Enemigo("Grifo", 140, "¡Mezcla perfecta de bestia y ave, soy imparable!"),
            new Enemigo("Quimera", 160, "¡Tres cabezas son mejor que una!"),
            new Enemigo("Sirena", 80, "Ven... Te guiaré a las profundidades."),
            new Enemigo("Dragón de Hielo", 200, "Mi aliento helado te congelará en un instante."),
            new Enemigo("Gárgola", 90, "No solo soy una estatua..."),
            new Enemigo("Hada Malvada", 50, "¡Te maldeciré por toda la eternidad!"),
            new Enemigo("Kitsune", 70, "¡Mis trucos no tienen fin!"),
            new Enemigo("Kraken", 220, "¡No podrás escapar de mis tentáculos!"),
            new Enemigo("Lich", 110, "¡Soy eterno, y tú solo eres polvo!"),
            new Enemigo("Goblin", 40, "¡Jajaja, te quitaré todo lo que tienes!"),
            new Enemigo("Cíclope", 130, "¡Con mi único ojo lo veo todo!"),
            new Enemigo("Basilisco", 150, "¡Una mirada y serás piedra!"),
            new Enemigo("Hombre Pájaro", 85, "Mis alas son la envidia de todos los cielos."),
            new Enemigo("Esfinge", 100, "¡Responde mi acertijo o perece!"),
            new Enemigo("Valkiria", 90, "¡Solo los más valientes cruzan mi camino!"),
            new Enemigo("Zorro Fantasma", 60, "¡Ni vivo, ni muerto, pero siempre cazando!"),
            new Enemigo("Minx", 80, "¡No puedes atrapar lo que no ves!"),
            new Enemigo("Banshee de Hielo", 75, "Mi llanto es más frío que el invierno."),
            new Enemigo("Espíritu de la Naturaleza", 95, "¡Soy una con el bosque!"),
            new Enemigo("Tigre de Nieve", 130, "¡Rápido como el viento en una tormenta de nieve!"),
            new Enemigo("Espectro", 75, "No podrás tocarme... ¡pero yo sí a ti!"),
            new Enemigo("Caballero Caído", 160, "¡Una vez fui un héroe... ahora soy tu pesadilla!"),
            new Enemigo("Búho de Guerra", 90, "¡Mis ojos ven todo en la oscuridad!"),
            new Enemigo("Rocío de la Noche", 85, "¡Cuando cae la noche, yo gobierno!"),
            new Enemigo("Hombre de Hielo", 140, "¡Mi corazón es tan frío como mis puños!"),
            new Enemigo("Fantasma de Guerra", 100, "Las batallas no terminan ni en la muerte."),
            new Enemigo("Reina Araña", 110, "¡No escaparás de mi red!"),
            new Enemigo("Basilisco de Fuego", 150, "¡Fuego y veneno en uno!"),
            new Enemigo("Cazador Nocturno", 130, "¡La noche es mi aliada y tú mi presa!"),
            new Enemigo("Río de Lava", 180, "¡Nadie puede cruzar mi furia ardiente!"),
            new Enemigo("Sombra Vengativa", 120, "¡Te seguiré hasta que obtenga mi venganza!"),
            
            new Enemigo(NombreJugador + "(?)", 100, NombreJugador + ": ¿Quién eres?  \n"
            + NombreJugador + "(?): Soy la versión de ti que siempre soñaste ser, pero jamás lograrás alcanzar.  \n"
            + NombreJugador + ": ¡No te creo! ¡No puedes ser mejor que yo!  \n"
            + NombreJugador + "(?): (se ríe) Prepárate para descubrir lo patético que eres en comparación conmigo.\n¡Voy a disfrutar cada segundo de tu derrota! "),
            
            new Enemigo("Gallina", 5, "Coo coo coo")
        };

        List<List<Movimiento>> movimientos = new ArrayList<>();
       movimientos.add(List.of(new Movimiento(1, "Mordida Suave", 10), new Movimiento(2, "Sarpazo", 50), new Movimiento(3, "Arañazo", 20))); // Lobo Feroz
        movimientos.add(List.of(new Movimiento(1, "Golpe Gelatinoso", 15), new Movimiento(2, "Ácido Corrosivo", 40))); // Monstruo de Baba
        movimientos.add(List.of(new Movimiento(1, "Picadura Venenosa", 25), new Movimiento(2, "Vuelo Rasante", 15), new Movimiento(3, "Aguijón", 30))); // Avispón
        movimientos.add(List.of(new Movimiento(1, "Golpe Pesado", 50), new Movimiento(2, "Rugido", 10), new Movimiento(3, "Embestida", 40), new Movimiento(4, "Mordida", 35))); // Oso
        movimientos.add(List.of(new Movimiento(1, "Golpe de Hueso", 20), new Movimiento(2, "Rayo Oscuro", 30))); // Esqueleto
        movimientos.add(List.of(new Movimiento(1, "Bola Sombría", 35), new Movimiento(2, "Tormenta Oscura", 45), new Movimiento(3, "Maldición", 25))); // Mago Oscuro
        movimientos.add(List.of(new Movimiento(1, "Llamarada", 60), new Movimiento(2, "Golpe de Cola", 40), new Movimiento(3, "Vuelo Incendiario", 50))); // Dragón de Fuego
        movimientos.add(List.of(new Movimiento(1, "Garra Letal", 45), new Movimiento(2, "Mordida Lupina", 35))); // Hombre Lobo
        movimientos.add(List.of(new Movimiento(1, "Golpe de Roca", 50), new Movimiento(2, "Terremoto", 60))); // Golem de Roca
        movimientos.add(List.of(new Movimiento(1, "Mordida Venenosa", 25), new Movimiento(2, "Constricción", 15))); // Serpiente Venenosa
        movimientos.add(List.of(new Movimiento(1, "Toque Helado", 15), new Movimiento(2, "Grito Espeluznante", 30))); // Fantasma Errante
        movimientos.add(List.of(new Movimiento(1, "Golpe de Garra", 40), new Movimiento(2, "Rugido de Guerra", 20), new Movimiento(3, "Cabezazo", 50))); // Troll de las Montañas
        movimientos.add(List.of(new Movimiento(1, "Trampa de Red", 10), new Movimiento(2, "Picoteo", 25), new Movimiento(3, "Bromas Traicioneras", 15))); // Duende Travieso
        movimientos.add(List.of(new Movimiento(1, "Lamento de la Muerte", 35), new Movimiento(2, "Toque Sombrío", 20))); // Banshee
        movimientos.add(List.of(new Movimiento(1, "Emboscada", 60), new Movimiento(2, "Embiste Feroz", 45), new Movimiento(3, "Cuerpo a Cuerpo", 40))); // Minotauro
        movimientos.add(List.of(new Movimiento(1, "Mordida de Vampiro", 25), new Movimiento(2, "Niebla Aterradora", 35), new Movimiento(3, "Encantar", 20))); // Vampiro
        movimientos.add(List.of(new Movimiento(1, "Mordisco Infectado", 15), new Movimiento(2, "Golpe Torpe", 20))); // Zombi
        movimientos.add(List.of(new Movimiento(1, "Bofetada de Lodo", 20), new Movimiento(2, "Trampa de Pantano", 35), new Movimiento(3, "Zancada Resbaladiza", 15))); // Criatura del Pantano
        movimientos.add(List.of(new Movimiento(1, "Aguijón Venomoso", 30), new Movimiento(2, "Rugido", 25))); // Reptil Volador
        movimientos.add(List.of(new Movimiento(1, "Fuego de la Tierra", 40), new Movimiento(2, "Tornado de Agua", 35), new Movimiento(3, "Trueno Helado", 50))); // Hechicero Elemental
        movimientos.add(List.of(new Movimiento(1, "Canto de la Vida", 40), new Movimiento(2, "Llama Renovadora", 50))); // Fénix
        movimientos.add(List.of(new Movimiento(1, "Zancada del Grifo", 30), new Movimiento(2, "Garra Afilada", 60), new Movimiento(3, "Ala Furia", 50))); // Grifo
        movimientos.add(List.of(new Movimiento(1, "Aliento de Fuego", 70), new Movimiento(2, "Zancada de Monstruo", 50), new Movimiento(3, "Mordida Letal", 40))); // Quimera
        movimientos.add(List.of(new Movimiento(1, "Canto Seductor", 20), new Movimiento(2, "Cola Cortante", 30))); // Sirena
        movimientos.add(List.of(new Movimiento(1, "Aliento Congelante", 80), new Movimiento(2, "Golpe de Cola", 40), new Movimiento(3, "Embestida Gélida", 60))); // Dragón de Hielo
        movimientos.add(List.of(new Movimiento(1, "Roca Aterradora", 25), new Movimiento(2, "Piedra Voladora", 30))); // Gárgola
        movimientos.add(List.of(new Movimiento(1, "Toque de la Muerte", 20), new Movimiento(2, "Grito Siniestro", 35))); // Hada Malvada
        movimientos.add(List.of(new Movimiento(1, "Mordisco Afilado", 15), new Movimiento(2, "Juego de Sombras", 20))); // Kitsune
        movimientos.add(List.of(new Movimiento(1, "Tentáculos de Horror", 50), new Movimiento(2, "Inmersión", 60))); // Kraken
        movimientos.add(List.of(new Movimiento(1, "Rayo Mortífero", 40), new Movimiento(2, "Maldición", 25))); // Lich
        movimientos.add(List.of(new Movimiento(1, "Bofetada", 5), new Movimiento(2, "Trampa de Red", 10))); // Goblin
        movimientos.add(List.of(new Movimiento(1, "Golpe de Cíclope", 60), new Movimiento(2, "Embestida", 50))); // Cíclope
        movimientos.add(List.of(new Movimiento(1, "Mirada Petrificante", 30), new Movimiento(2, "Aliento Venenoso", 25))); // Basilisco
        movimientos.add(List.of(new Movimiento(1, "Garra Filosa", 30), new Movimiento(2, "Vuelo Acertado", 50))); // Hombre Pájaro
        movimientos.add(List.of(new Movimiento(1, "Desafío", 10), new Movimiento(2, "Deslumbrar", 20))); // Esfinge
        movimientos.add(List.of(new Movimiento(1, "Bola de Fuego", 40), new Movimiento(2, "Furia", 30))); // Valkiria
        movimientos.add(List.of(new Movimiento(1, "Espanto", 15), new Movimiento(2, "Zancada Fantasmal", 20))); // Zorro Fantasma
        movimientos.add(List.of(new Movimiento(1, "Corte Sutil", 25), new Movimiento(2, "Beso", 20))); // Minx
        movimientos.add(List.of(new Movimiento(1, "Grito Gélido", 35), new Movimiento(2, "Flecha Helada", 25))); // Banshee de Hielo
        movimientos.add(List.of(new Movimiento(1, "Furia de la Naturaleza", 40), new Movimiento(2, "Destrucción", 30))); // Espíritu de la Naturaleza
        movimientos.add(List.of(new Movimiento(1, "Mordida del Tigre", 35), new Movimiento(2, "Zancada Aterradora", 30))); // Tigre de Nieve
        movimientos.add(List.of(new Movimiento(1, "Aguijón Letal", 25), new Movimiento(2, "Zancada Fantasmal", 20))); // Espectro
        movimientos.add(List.of(new Movimiento(1, "Corte de Espada", 40), new Movimiento(2, "Carga", 30))); // Caballero Caído
        movimientos.add(List.of(new Movimiento(1, "Garra del Búho", 25), new Movimiento(2, "Grito de Guerra", 35))); // Búho de Guerra
        movimientos.add(List.of(new Movimiento(1, "Esencia de Noche", 30), new Movimiento(2, "Rayo de Luna", 20))); // Rocío de la Noche
        movimientos.add(List.of(new Movimiento(1, "Aliento Frío", 40), new Movimiento(2, "Mordida de Hielo", 50))); // Hombre de Hielo
        movimientos.add(List.of(new Movimiento(1, "Luz de la Muerte", 25), new Movimiento(2, "Sombra", 30))); // Fantasma de Guerra
        movimientos.add(List.of(new Movimiento(1, "Tejer Red", 35), new Movimiento(2, "Mordisco Venenoso", 20))); // Reina Araña
        movimientos.add(List.of(new Movimiento(1, "Fuego Explosivo", 40), new Movimiento(2, "Piedra de Lava", 50))); // Basilisco de Fuego
        movimientos.add(List.of(new Movimiento(1, "Disparo de Fuego", 50), new Movimiento(2, "Fuego Ancestral", 70))); // Cazador Nocturno
        movimientos.add(List.of(new Movimiento(1, "Fuego Volcánico", 50), new Movimiento(2, "Garras de Lava", 60))); // Río de Lava
        movimientos.add(List.of(new Movimiento(1, "Sombra Mortal", 30), new Movimiento(2, "Danza de Sombras", 25))); // Sombra Vengativa
        movimientos.add(List.of(new Movimiento(3, "Puño", 5), new Movimiento(1, "Golpe", 15), new Movimiento(2, "Barrido", 30))); // Heroe (?)
        movimientos.add(List.of(new Movimiento(1, "Picotazo", 1))); // Gallina

        Random random = new Random();
        int mounstro = random.nextInt(enemigos.length);

        Enemigo enemigoSeleccionado = enemigos[mounstro];
        for (Movimiento movimiento : movimientos.get(mounstro)) {
            enemigoSeleccionado.agregarMovimiento(movimiento);
        }

        return enemigoSeleccionado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
}
