# Calculadora Java con Maven


## Descripción

Proyecto de calculadora en Java desarrollado con Maven que implementa operaciones básicas siguiendo principios SOLID y buenas prácticas de desarrollo.

## Características

- Interfaz de consola interactiva
- Operaciones básicas (suma, resta, multiplicación, división)
- Validación de entradas
- Manejo de errores robusto
- Pruebas unitarias completas
- Integración continua con Jenkins

## Tecnologías

| Tecnología | Versión |
|------------|---------|
| Java       | 17      |
| Maven      | 3.8+    |
| JUnit      | 5       |
| Mockito    | 5.15.2  |

## Requisitos

- JDK 17+
- Maven 3.8+
- Git

## Compilar proyecto

mvn clean package


## Ejecutar

java -jar target/proyecto-calculadora-1.0-SNAPSHOT.jar

## Ejecutar pruebas

mvn test

## Generar reporte de coberturas

mvn jacoco:report

## Ver reporte

open target/site/jacoco/index.html

## Estructura del reporte

src/
├── main/java/com/iessanalberto/dam1/
│   ├── Main.java
│   ├── CalculadoraConsole.java
│   └── Operaciones.java
└── test/java/com/iessanalberto/dam1/
├── CalculadoraConsoleTest.java
└── OperacionesTest.java

## Contribución

Haz fork del proyecto

Crea tu rama (git checkout -b feature/nueva-funcionalidad)

Haz commit de tus cambios (git commit -m 'Añade funcionalidad')

Haz push a la rama (git push origin feature/nueva-funcionalidad)

Abre un Pull Request

# Calculadora Java con Maven | TDD 


## Metodología TDD (Test-Driven Development)

Este proyecto sigue el enfoque **Test-Driven Development** (Desarrollo Guiado por Pruebas), implementando:

### Ciclo TDD
1. **RED** - Escribir una prueba fallida
2. **GREEN** - Implementar el código mínimo para pasar la prueba
3. **REFACTOR** - Mejorar el código manteniendo los tests

### Ejemplo Implementado
```java
// 1. Primero la prueba (RED)
@Test
public void testSumaPositivos() {
    assertEquals(5, operaciones.suma(2, 3));
}

// 2. Implementación mínima (GREEN)
public int suma(int a, int b) {
    return 5; // Primera implementación
}

// 3. Refactor (mejor implementación)
public int suma(int a, int b) {
    return a + b;
}



## Instalación

1. Clonar el repositorio:

git clone https://github.com/beatrizfouve1/proyectojenkinscalcularfx



