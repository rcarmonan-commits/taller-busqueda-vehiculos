public class Vehiculo {
    private String placa;
    private String propietario;
    private String tipo;

    public Vehiculo(String placa, String propietario, String tipo) {
        this.placa = placa;
        this.propietario = propietario;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("Placa: %-8s | Propietario: %-20s | Tipo: %s", placa, propietario, tipo);
    }
}