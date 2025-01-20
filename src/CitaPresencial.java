// Subclase para citas presenciales
class CitaPresencial extends Cita {
    private String direccion;

    public CitaPresencial(String fecha, String hora, String paciente, String psicologo, String direccion) {
        super(fecha, hora, paciente, psicologo);
        this.direccion = direccion;
    }

    @Override
    public String detalles() {
        return "Cita presencial con " + psicologo + " el " + fecha + " a las " + hora + " en " + direccion + ".";
    }
}
