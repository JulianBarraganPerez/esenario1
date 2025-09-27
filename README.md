# esenario 1
## Identificación del patrón
### Tipo de patrón: Creacional
### Patrón aplicado: Builder
## Justificación
El patrón Builder es ideal cuando queremos crear objetos complejos con muchos parámetros opcionales, evitando constructores telescópicos y mejorando la legibilidad y flexibilidad del código.
## Solucion del problema y guia paso a paso
### Paso 1 — Entender el problema
Problema: crear un objeto Automóvil con múltiples configuraciones opcionales (motor, color, llantas, sistema de sonido, interiores, techo solar, GPS) lleva a constructores telescópicos (demasiados parámetros) o múltiples constructores sobrecargados.
### Consecuencia técnica:
Dificultad de mantenimiento: cada cambio en la clase obliga a modificar todos los constructores.

Legibilidad reducida: el orden de los parámetros en constructores largos es propenso a errores.

Baja flexibilidad: si un atributo es opcional, se necesitan constructores adicionales o parámetros por defecto.

### Paso 2 — Decidir el rol del Builder
Decisión de diseño: aplicar el patrón Builder para separar la construcción del objeto de su representación final.
### Justificación:
La clase Automovil se mantiene inmutable (no cambia después de creada).

El AutomovilBuilder concentra toda la lógica de construcción y es más flexible al permitir parámetros opcionales sin necesidad de subclases ni múltiples constructores.

El código cliente es más legible: se lee como una secuencia de configuraciones.

### Paso 3 — Definir el contrato (Automovil y AutomovilBuilder)
Automovil (clase inmutable):

Contiene solo atributos finales (motor, color, llantas, etc.).

Constructor privado: solo puede ser creado por el builder.

AutomovilBuilder:

Métodos setMotor(...), setColor(...), setLlantas(...), etc.

Método build() que devuelve un Automovil.

### Paso 4 — Construcción paso a paso con Builder
En lugar de:

''' java
Automovil auto = new Automovil("V8", "Rojo", "Deportivas", "Bose", "Cuero", true, true); 
'''





