# JavaPOO

Colección de ejemplos de Programación Orientada a Objetos en Java.

## Estructura del código

- `src/Reporte.java`, `src/ReporteVentas.java`, `src/Exportable.java`: ejemplo simple de herencia e interfaces.
- `src/Relaciones/`: modelo de relaciones académicas (alumno, exámenes y centro educativo).
- `src/UniversidadUML/`: modelo UML de universidad (cursos, ediciones, inscripciones e instructores).

## Compilación

Este repositorio no usa Maven ni Gradle; la compilación se hace con `javac`.

```bash
javac $(find src -name '*.java' ! -name 'Main.java')
```

> `src/Main.java` usa una sintaxis de ejemplo (`void main()` con `IO.println`) que no compila con `javac` estándar.

