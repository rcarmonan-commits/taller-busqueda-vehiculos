public class GestorVehiculos {

    // 1. Búsqueda exacta de una placa (Búsqueda Lineal)
    public static int busquedaLinealExacta(Vehiculo[] vehiculos, String placaBuscada) {
        if (vehiculos == null || placaBuscada == null) return -1;

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getPlaca().equalsIgnoreCase(placaBuscada)) {
                return i;
            }
        }
        return -1;
    }

    // 2. Búsqueda de todas las placas por prefijo
    public static Vehiculo[] busquedaPorPrefijo(Vehiculo[] vehiculos, String prefijo) {
        if (vehiculos == null || prefijo == null) return new Vehiculo[0];

        int contador = 0;
        String prefijoUpper = prefijo.toUpperCase();

        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().toUpperCase().startsWith(prefijoUpper)) {
                contador++;
            }
        }

        Vehiculo[] resultados = new Vehiculo[contador];
        int idx = 0;

        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().toUpperCase().startsWith(prefijoUpper)) {
                resultados[idx++] = v;
            }
        }

        return resultados;
    }

    // 3. Ordenamiento alfabético por placa (Insertion Sort manual)
    public static void ordenarPorPlaca(Vehiculo[] vehiculos) {
        if (vehiculos == null) return;

        int n = vehiculos.length;
        for (int i = 1; i < n; i++) {
            Vehiculo clave = vehiculos[i];
            int j = i - 1;

            while (j >= 0 && vehiculos[j].getPlaca().compareToIgnoreCase(clave.getPlaca()) > 0) {
                vehiculos[j + 1] = vehiculos[j];
                j--;
            }
            vehiculos[j + 1] = clave;
        }
    }

    // 4. Búsqueda binaria exacta por placa (requiere arreglo ordenado)
    public static int busquedaBinariaExacta(Vehiculo[] vehiculos, String placaBuscada) {
        if (vehiculos == null || placaBuscada == null) return -1;

        int lo = 0;
        int hi = vehiculos.length - 1;

        while (lo <= hi) {
            int mid = lo + ((hi - lo) >>> 1);
            int comparacion = vehiculos[mid].getPlaca().compareToIgnoreCase(placaBuscada);

            if (comparacion == 0) {
                return mid;
            } else if (comparacion < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}