# Taller Práctico - Control de Placas Vehiculares

**Asignatura:** Estructuras de Datos  
**Programa:** Ingeniería de Software  
**IES:** Universidad de Cartagena  
**Tutor:** John Carlos Arrieta Arrieta

## Descripción del Ejercicio
Sistema de gestión de vehículos mediante un arreglo de objetos (`Vehiculo`) que implementa manualmente algoritmos de búsqueda y ordenamiento.

## Funcionalidades Implementadas
- **Búsqueda Lineal Exacta:** Localización secuencial de un vehículo por su placa completa ($O(n)$).
- **Búsqueda Parcial por Prefijo:** Filtrado de todos los vehículos cuya placa inicie con una cadena determinada.
- **Ordenamiento por Inserción:** Ordenamiento alfabético manual por placa.
- **Búsqueda Binaria Exacta:** Búsqueda logarítmica ($O(\log n)$) sobre el arreglo previamente ordenado.

## Estructura del Proyecto
- `src/Vehiculo.java`: Clase modelo que representa la entidad vehículo.
- `src/GestorVehiculos.java`: Métodos manuales de búsqueda y ordenamiento.
- `src/Main.java`: Ejecución de pruebas con datos de ejemplo.

## Instrucciones de Ejecución
1. Abrir el proyecto en IntelliJ IDEA (Java 17+).
2. Compilar y ejecutar la clase `src/Main.java`.