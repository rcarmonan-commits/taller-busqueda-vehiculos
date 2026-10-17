public class Main {
    public static void main(String[] args) {
        Vehiculo[] flota = {
                new Vehiculo("KLI987", "Carlos Mendoza", "Automóvil"),
                new Vehiculo("ABC123", "Ana Gómez", "Camioneta"),
                new Vehiculo("ABX456", "Roberto Silva", "Motocicleta"),
                new Vehiculo("XYZ789", "Diana Torres", "Automóvil"),
                new Vehiculo("ABC999", "María López", "Camión"),
                new Vehiculo("DEF456", "Jorge Ramírez", "Automóvil")
        };

        System.out.println("=== REGISTRO INICIAL ===");
        imprimirArreglo(flota);

        // 1. Búsqueda lineal exacta
        System.out.println("\n--- 1. Búsqueda Lineal Exacta (Placa 'XYZ789') ---");
        int idxLineal = GestorVehiculos.busquedaLinealExacta(flota, "XYZ789");
        if (idxLineal != -1) {
            System.out.println("Encontrado en índice " + idxLineal + ": " + flota[idxLineal]);
        } else {
            System.out.println("Placa no encontrada.");
        }

        // 2. Búsqueda parcial por prefijo
        System.out.println("\n--- 2. Búsqueda Parcial por Prefijo ('ABC') ---");
        Vehiculo[] resultadosPrefijo = GestorVehiculos.busquedaPorPrefijo(flota, "ABC");
        for (Vehiculo v : resultadosPrefijo) {
            System.out.println(v);
        }

        // 3. Ordenamiento alfabético por placa
        System.out.println("\n--- 3. Ordenando por Placa ---");
        GestorVehiculos.ordenarPorPlaca(flota);
        imprimirArreglo(flota);

        // 4. Búsqueda binaria exacta
        System.out.println("\n--- 4. Búsqueda Binaria Exacta (Placa 'KLI987') ---");
        int idxBinario = GestorVehiculos.busquedaBinariaExacta(flota, "KLI987");
        if (idxBinario != -1) {
            System.out.println("Encontrado en índice " + idxBinario + ": " + flota[idxBinario]);
        } else {
            System.out.println("Placa no encontrada.");
        }

        // 5. Búsqueda de elemento inexistente
        System.out.println("\n--- 5. Búsqueda Binaria de Placa Inexistente ('ZZZ000') ---");
        int idxInexistente = GestorVehiculos.busquedaBinariaExacta(flota, "ZZZ000");
        System.out.println("Resultado (índice esperado -1): " + idxInexistente);
    }

    private static void imprimirArreglo(Vehiculo[] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("[" + i + "] " + vehiculos[i]);
        }
    }
}