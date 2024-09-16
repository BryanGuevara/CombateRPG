# Modelo de Combates RPG

## Descripción

El **Modelo de Combates RPG** es un juego de combate por turnos en consola, desarrollado en Java. En este juego, el jugador toma el rol de un héroe que se enfrenta a distintos enemigos, utilizando una variedad de movimientos para atacar o curarse. El enemigo también responde con sus propios ataques. El objetivo es derrotar al enemigo antes de ser derrotado.

## Características

- **Sistema de Combate por Turnos**: El jugador y el enemigo alternan turnos para atacar o curarse.
- **Movimientos Personalizados**: El jugador y el enemigo tienen una lista de movimientos con diferentes niveles de daño.
- **Enemigos Aleatorios**: Cada combate es único, ya que los enemigos se generan de forma aleatoria, con diferentes habilidades y puntos de vida.
- **Opciones de Curación**: El jugador tiene la opción de curarse en lugar de atacar durante su turno.

## Cómo Jugar

1. **Introducir Nombre del Héroe**: Al iniciar el juego, se te pedirá que introduzcas un nombre para tu personaje.
2. **Comienza el Combate**: Se generará un enemigo aleatorio con puntos de vida y movimientos específicos.
3. **Turno del Jugador**:
   - Se mostrarán los movimientos disponibles (ataques con distintos niveles de daño) y la opción de curarte.
   - Introduce el número correspondiente al movimiento que deseas utilizar.
4. **Turno del Enemigo**: El enemigo seleccionará aleatoriamente un movimiento para atacarte.
5. **Fin del Juego**:
   - El combate termina cuando la vida del jugador o del enemigo llega a 0.
   - Si derrotas al enemigo, ganarás. Si tu vida se reduce a 0, perderás el combate.

## Enemigos
| Nombre              | Vida | Movimientos                                                                 |
|---------------------|------|-----------------------------------------------------------------------------|
| Lobo Feroz          | 100  | - Mordida Suave (10)<br>- Sarpazo (50)<br>- Arañazo (20)                     |
| Monstruo de Baba     | 80   | - Golpe Gelatinoso (15)<br>- Ácido Corrosivo (40)                           |
| Avispón             | 70   | - Picadura Venenosa (25)<br>- Vuelo Rasante (15)<br>- Aguijón (30)           |
| Oso                 | 150  | - Golpe Pesado (50)<br>- Rugido (10)<br>- Embestida (40)<br>- Mordida (35)   |
| Esqueleto           | 90   | - Golpe de Hueso (20)<br>- Rayo Oscuro (30)                                 |
| Mago Oscuro         | 120  | - Bola Sombría (35)<br>- Tormenta Oscura (45)<br>- Maldición (25)            |
| Dragón de Fuego     | 200  | - Llamarada (60)<br>- Golpe de Cola (40)<br>- Vuelo Incendiario (50)         |
| Hombre Lobo         | 130  | - Garra Letal (45)<br>- Mordida Lupina (35)                                  |
| Golem de Roca       | 180  | - Golpe de Roca (50)<br>- Terremoto (60)                                    |
| Serpiente Venenosa  | 60   | - Mordida Venenosa (25)<br>- Constricción (15)                               |

## Ejemplo de Ejecución

```
=================================================== <[Nombre del Heroe]> =============================================
¿Cual es tu nombre?: Thor
=================================================== <[Contrincante]> =================================================
¡Comienza el combate entre Thor y Esqueleto!

Thor - Vida: 100
Esqueleto - Vida: 90
=================================================== <[Heroe]> ======================================================
Turno de Thor: 
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Curar (Restaura 50 de vida)
Selecciona tu movimiento: 3

¡Has elegido Barrido!
El enemigo Esqueleto recibe 30 de daño. Vida restante del enemigo: 60
=================================================== <[Esqueleto]> ==================================================
Turno del enemigo:

El enemigo ha usado Golpe de Hueso!
Recibes 20 de daño. Vida restante del jugador: 80
=================================================== <[Heroe]> ======================================================
Turno de Thor: 
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Curar (Restaura 50 de vida)
Selecciona tu movimiento: 1

¡Has elegido Golpe!
El enemigo Esqueleto recibe 15 de daño. Vida restante del enemigo: 45
=================================================== <[Esqueleto]> ==================================================
Turno del enemigo:

El enemigo ha usado Golpe de Hueso!
Recibes 20 de daño. Vida restante del jugador: 60
=================================================== <[Heroe]> ======================================================
Turno de Thor: 
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Curar (Restaura 50 de vida)
Selecciona tu movimiento: 3

¡Has elegido Barrido!
El enemigo Esqueleto recibe 30 de daño. Vida restante del enemigo: 15
=================================================== <[Esqueleto]> ==================================================
Turno del enemigo:

El enemigo ha usado Golpe de Hueso!
Recibes 20 de daño. Vida restante del jugador: 40
=================================================== <[Heroe]> ======================================================
Turno de Thor: 
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Curar (Restaura 50 de vida)
Selecciona tu movimiento: 4

¡Has elegido Curar! Has restaurado 50 de vida.
Tu vida actual es: 90
=================================================== <[Esqueleto]> ==================================================
Turno del enemigo:

El enemigo ha usado Golpe de Hueso!
Recibes 20 de daño. Vida restante del jugador: 70
=================================================== <[Heroe]> ======================================================
Turno de Thor: 
1. Golpe (Daño: 15)
2. Puño (Daño: 5)
3. Barrido (Daño: 30)
4. Curar (Restaura 50 de vida)
Selecciona tu movimiento: 3

¡Has elegido Barrido!
El enemigo Esqueleto recibe 30 de daño. Vida restante del enemigo: 0
=================================================== <[Victoria]> =====================================================
¡Has derrotado al Esqueleto!
==================================================================================================================
```