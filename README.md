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
Decisión de diseño: aplicar el patrón Creacional para separar la construcción del objeto de su representación final.
### Justificación:
La clase Automovil se mantiene inmutable (no cambia después de creada).

El AutomovilBuilder concentra toda la lógica de construcción y es más flexible al permitir parámetros opcionales sin necesidad de subclases ni múltiples constructores.

El código cliente es más legible: se lee como una secuencia de configuraciones.

### Paso 3 — Definir el contrato (Automovil y AutomovilBuilder)
Automovil (clase inmutable):

Contiene solo atributos finales (motor, color, llantas, etc.....).

Constructor privado: 

solo puede ser creado por el builder.

AutomovilBuilder:

Métodos setMotor(...), setColor(...), setLlantas(...), etc.

Método build() que devuelve un Automovil.

### Paso 4 — Construcción paso a paso con Builder
En lugar de poner:

```java
Automovil auto = new Automovil("V8", "Rojo", "Deportivas", "Bose", "Cuero", true, true); 
```

Usamos:

```java
Automovil auto = new Automovil.AutomovilBuilder()
        .setMotor("V8")
        .setColor("Rojo")
        .setLlantas("Deportivas")
        .setSonido("Bose")
        .setInteriores("Cuero")
        .setTechoSolar(true)
        .setGps(true)
        .build();
```

Resultado: el código cliente es más legible, claro y flexible.

### Paso 5 — Implementación del Builder

Se encapsula la construcción: todos los parámetros opcionales se definen en el Builder.

Inmutabilidad: el objeto final Automovil no expone setters.

Reutilización: distintos autos se crean fácilmente cambiando solo algunos atributos.

Cómo demuestra los beneficios: el builder elimina constructores telescópicos, mantiene la clase Automovil simple y permite omitir parámetros sin romper la lógica.

### Paso 6 — Ejemplo de uso (Main.java)

```java
Automovil auto1 = new Automovil.AutomovilBuilder()
        .setMotor("V8")
        .setColor("Rojo")
        .setTechoSolar(true)
        .setGps(true)
        .build();

Automovil auto2 = new Automovil.AutomovilBuilder()
        .setMotor("Eléctrico")
        .setColor("Azul")
        .build();
```

### Evidencia:

auto1 tiene configuraciones completas.

auto2 solo define motor y color, pero sigue siendo un objeto válido.

### Paso 7 — Cómo cada beneficio queda reflejado

### Legibilidad y claridad

Evidencia: la secuencia de métodos del builder se lee como una lista de configuraciones.

No hay confusión con el orden de parámetros como en los constructores telescópicos.

### Inmutabilidad

Evidencia: Automovil no expone setters, sus atributos son final y solo se asignan una vez vía AutomovilBuilder.

### Flexibilidad

Evidencia: se pueden omitir atributos opcionales (auto2) sin necesidad de subclases ni múltiples constructores.

### Separación de construcción y representación

Evidencia: Automovil solo define los atributos del auto; AutomovilBuilder se encarga de la construcción.

Cambiar la forma de construir un auto no afecta la clase Automovil.

### Paso 8 — Pruebas rápidas de validación

Crear un automóvil deportivo:

```java
Automovil deportivo = new Automovil.AutomovilBuilder()
        .setMotor("V8 Biturbo")
        .setColor("Negro")
        .setLlantas("Deportivas 20''")
        .build(); 
```

Crear un automóvil económico:

```java
Automovil economico = new Automovil.AutomovilBuilder()
        .setMotor("1.6")
        .setColor("Blanco")
        .build();
 
```

Evidencia de flexibilidad: ambos objetos son válidos aunque definan configuraciones distintas.

## Diagrama UML










