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
| Fantasma Errante    | 60   | - Toque Helado (15)<br>- Grito Espeluznante (30)                             |
| Troll de las Montañas| 120  | - Golpe de Garra (40)<br>- Rugido de Guerra (20)<br>- Cabezazo (50)         |
| Duende Travieso     | 50   | - Trampa de Red (10)<br>- Picoteo (25)<br>- Bromas Traicioneras (15)        |
| Banshee             | 75   | - Lamento de la Muerte (35)<br>- Toque Sombrío (20)                          |
| Minotauro           | 140  | - Emboscada (60)<br>- Embiste Feroz (45)<br>- Cuerpo a Cuerpo (40)          |
| Vampiro             | 90   | - Mordida de Vampiro (25)<br>- Niebla Aterradora (35)<br>- Encantar (20)    |
| Zombi               | 80   | - Mordisco Infectado (15)<br>- Golpe Torpe (20)                             |
| Criatura del Pantano | 100  | - Bofetada de Lodo (20)<br>- Trampa de Pantano (35)<br>- Zancada Resbaladiza (15) |
| Reptil Volador      | 70   | - Aguijón Venomoso (30)<br>- Rugido (25)                                    |
| Hechicero Elemental  | 110  | - Fuego de la Tierra (40)<br>- Tornado de Agua (35)<br>- Trueno Helado (50) |
| Fénix               | 120  | - Canto de la Vida (40)<br>- Llama Renovadora (50)                          |
| Grifo               | 140  | - Zancada del Grifo (30)<br>- Garra Afilada (60)<br>- Ala Furia (50)       |
| Quimera             | 160  | - Aliento de Fuego (70)<br>- Zancada de Monstruo (50)<br>- Mordida Letal (40) |
| Sirena              | 80   | - Canto Seductor (20)<br>- Cola Cortante (30)                              |
| Dragón de Hielo     | 200  | - Aliento Congelante (80)<br>- Golpe de Cola (40)<br>- Embestida Gélida (60) |
| Gárgola             | 90   | - Roca Aterradora (25)<br>- Piedra Voladora (30)                            |
| Hada Malvada        | 50   | - Toque de la Muerte (20)<br>- Grito Siniestro (35)                        |
| Kitsune             | 70   | - Mordisco Afilado (15)<br>- Juego de Sombras (20)                         |
| Kraken              | 220  | - Tentáculos de Horror (50)<br>- Inmersión (60)                            |
| Lich                | 110  | - Rayo Mortífero (40)<br>- Maldición (25)                                   |
| Goblin              | 40   | - Bofetada (5)<br>- Trampa de Red (10)                                     |
| Cíclope            | 130  | - Golpe de Cíclope (60)<br>- Embestida (50)                                |
| Basilisco           | 150  | - Mirada Petrificante (30)<br>- Aliento Venenoso (25)                      |
| Hombre Pájaro       | 85   | - Garra Filosa (30)<br>- Vuelo Acertado (50)                               |
| Esfinge             | 100  | - Desafío (10)<br>- Deslumbrar (20)                                        |
| Valkiria            | 90   | - Bola de Fuego (40)<br>- Furia (30)                                       |
| Zorro Fantasma      | 60   | - Espanto (15)<br>- Zancada Fantasmal (20)                                 |
| Minx                | 80   | - Corte Sutil (25)<br>- Beso (20)                                          |
| Banshee de Hielo    | 75   | - Grito Gélido (35)<br>- Flecha Helada (25)                                |
| Espíritu de la Naturaleza | 95 | - Furia de la Naturaleza (40)<br>- Destrucción (30)                     |
| Tigre de Nieve      | 130  | - Mordida del Tigre (35)<br>- Zancada Aterradora (30)                      |
| Espectro            | 75   | - Aguijón Letal (25)<br>- Zancada Fantasmal (20)                           |
| Caballero Caído     | 160  | - Corte de Espada (40)<br>- Carga (30)                                     |
| Búho de Guerra      | 90   | - Garra del Búho (25)<br>- Grito de Guerra (35)                            |
| Rocío de la Noche   | 85   | - Esencia de Noche (30)<br>- Rayo de Luna (20)                            |
| Hombre de Hielo     | 140  | - Aliento Frío (40)<br>- Mordida de Hielo (50)                             |
| Fantasma de Guerra   | 100  | - Luz de la Muerte (25)<br>- Sombra (30)                                   |
| Reina Araña         | 110  | - Tejer Red (35)<br>- Mordisco Venenoso (20)                              |
| Basilisco de Fuego  | 150  | - Fuego Explosivo (40)<br>- Piedra de Lava (50)                            |
| Cazador Nocturno    | 130  | - Disparo de Fuego (50)<br>- Fuego Ancestral (70)                          |
| Río de Lava         | 180  | - Fuego Volcánico (50)<br>- Garras de Lava (60)                           |
| Sombra Vengativa    | 120  | - Sombra Mortal (30)<br>- Danza de Sombras (25)                           |
| Gallina             | 5    | - Picotazo (1)                                                             |
| Heroe (?)           | 100  | - Golpe (15)<br>- Barrido (30)<br>- Puño (5)                               |

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
