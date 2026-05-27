# Sistema-de-Auditoria-Logistica

##  Descripción del Proyecto
Herramienta backend de consola desarrollada en Java, diseñada para el procesamiento, auditoría y validación de métricas de productividad en centros de distribución. El sistema simula el monitoreo de diferentes sectores de un depósito (Secos, Refrigerados, Alta Rotación), analizando el volumen de pallets procesados por distintos operarios.

El proyecto se centra en la transformación de datos multidimensionales, la detección algorítmica de cuellos de botella en la operación y la implementación de barreras de validación para garantizar la integridad del inventario físico.

## Funcionalidades Principales
* **Detección de Cuellos de Botella:** Algoritmo de búsqueda lineal sobre ejes específicos de una matriz bidimensional para identificar mínimos de productividad (operario con menor rendimiento en un sector dado).
* **Consolidación de Datos (Data Reduction):** Transformación algorítmica de datos 2D a 1D mediante el uso de acumuladores y bucles anidados, consolidando el rendimiento individual en totales sectoriales.
* **Validación Estricta de Entradas (Defensive Programming):** Sistema de carga manual para el registro de mermas (cajas dañadas) protegido por estructuras de control de estado (`while` loops) que impiden el ingreso de valores lógicamente imposibles (números negativos), protegiendo la base de datos del sistema.

## Tecnologías y Conceptos Aplicados
* **Lenguaje:** Java
* **Estructuras de Datos:** Vectores (Arrays 1D) y Matrices (Arrays 2D).
* **Lógica de Control:** Bucles iterativos anidados (`for`), sentencias condicionales (`if`), y bucles de validación (`while`).
* **Arquitectura:** Diseño modular con separación de responsabilidades entre el motor de ejecución (`Main.java`) y la lógica de negocio algorítmica (`LogicaDeposito.java`).

## Cómo ejecutar el proyecto
1. Clonar el repositorio en el entorno local.
2. Compilar los archivos ejecutando el comando:
   `javac Main.java LogicaDeposito.java`
3. Ejecutar el sistema de auditoría:
   `java Main`
