# Developer Notes

## Estado del proyecto

- No hay scripts de automatización (`.sh`) ni archivos de build (`pom.xml`, `build.gradle`).
- La validación actual se hace compilando fuentes directamente con `javac`.

## Validación recomendada

Desde la raíz del repositorio:

```bash
javac $(find src -name '*.java' ! -name 'Main.java')
```

## Sobre `src/Main.java`

`Main.java` está escrito como snippet didáctico y depende de `IO.println`; por eso no es un punto de entrada Java estándar ni parte de la compilación base del repositorio.

Si se requiere una ejecución estándar, crear una clase `public class Main` con `public static void main(String[] args)` y mantener `Main.java` actual como ejemplo separado.

