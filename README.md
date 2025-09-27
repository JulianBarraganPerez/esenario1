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
