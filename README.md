# Modelo de Combates RPG

## Descripción

Este proyecto implementa un sencillo modelo de combate RPG en Java, donde un héroe y un enemigo se enfrentan en un combate por turnos. El jugador puede elegir entre diferentes movimientos de ataque, mientras que el enemigo selecciona un ataque de forma aleatoria. El objetivo es reducir la vida del oponente a cero para ganar la batalla.

## Funcionalidades

- **Personaje (Jugador y Enemigo)**: Cada personaje tiene una cantidad inicial de vida y una lista de movimientos de ataque.
- **Movimientos**: Cada movimiento tiene un nombre y un valor de daño que afecta al oponente.
- **Combate por turnos**: El jugador elige su movimiento, mientras que el enemigo selecciona uno de manera aleatoria.
- **Condiciones de victoria o derrota**: El combate termina cuando la vida de un personaje llega a cero.
  
## Clases

1. **Main**: Contiene la lógica del juego y gestiona el flujo del combate.
2. **Personaje**: Representa al jugador. Posee una vida inicial y una lista de movimientos.
3. **Enemigo**: Representa al enemigo, similar a la clase `Personaje`, pero con la capacidad de elegir un ataque aleatorio.
4. **Movimiento**: Define los ataques que un personaje puede usar, con atributos como el nombre del ataque y el daño que inflige.

## Uso

Al ejecutar el programa, se inicia un combate entre el héroe y el enemigo (Lobo Feroz). El jugador debe seleccionar un movimiento en cada turno, y el enemigo responderá con un ataque aleatorio. El combate se repite hasta que la vida de uno de los personajes llegue a 0.

### Ejemplo de Ejecución

```
=================================================== <[Contrincante]> =================================================
¡Comienza el combate entre Héroe y Lobo Feroz!
=================================================== <[Heroe]> ======================================================
Turno del jugador:
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Estocada (Daño: 50)
Selecciona tu movimiento: 4
¡Has elegido Estocada!
El enemigo Lobo Feroz recibe 50 de daño. Vida restante del enemigo: 50
=================================================== <[Lobo Feroz]> ==================================================
Turno del enemigo:
El enemigo ha usado Mordida Suave!
Recibes 10 de daño. Vida restante del jugador: 90
=================================================== <[Heroe]> ======================================================
Turno del jugador:
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Estocada (Daño: 50)
Selecciona tu movimiento: 3
¡Has elegido Barrido!
El enemigo Lobo Feroz recibe 30 de daño. Vida restante del enemigo: 20
=================================================== <[Lobo Feroz]> ==================================================
Turno del enemigo:
El enemigo ha usado Mordida Suave!
Recibes 10 de daño. Vida restante del jugador: 80
=================================================== <[Heroe]> ======================================================
Turno del jugador:
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Estocada (Daño: 50)
Selecciona tu movimiento: 1
¡Has elegido Golpe!
El enemigo Lobo Feroz recibe 15 de daño. Vida restante del enemigo: 5
=================================================== <[Lobo Feroz]> ==================================================
Turno del enemigo:
El enemigo ha usado Mordida Fuerte!
Recibes 50 de daño. Vida restante del jugador: 30
=================================================== <[Heroe]> ======================================================
Turno del jugador:
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Estocada (Daño: 50)
Selecciona tu movimiento: 2
¡Has elegido Puño!
El enemigo Lobo Feroz recibe 5 de daño. Vida restante del enemigo: 0
=================================================== <[Victoria]> ====================================================
¡Has derrotado al Lobo Feroz!
Fin del combate.
==================================================================================================================
```
