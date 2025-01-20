public abstract class Cita {
    protected String fecha;
    protected String hora;
    protected String paciente;
    protected String psicologo;

    public Cita(String fecha, String hora, String paciente, String psicologo) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.psicologo = psicologo;
    }

    public abstract String detalles();
}
