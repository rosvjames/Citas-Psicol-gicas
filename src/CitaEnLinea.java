// Subclase para citas en línea
class CitaEnLinea extends Cita {
    private String enlace; // Encapsulamiento

    public CitaEnLinea(String fecha, String hora, String paciente, String psicologo, String enlace) {
        super(fecha, hora, paciente, psicologo);
        this.enlace = enlace;
    }

    public String getEnlace() { // Método para acceder al enlace
        return enlace;
    }

    @Override
    public String detalles() {
        return "Cita en línea con " + psicologo + " el " + fecha + " a las " + hora + ". Enlace: " + enlace;
    }
}
