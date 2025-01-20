// Main
public class Main {
    public static void main(String[] args) {
        Cita citaOnline = new CitaEnLinea("20/01/2025", "10:00", "Juan Pérez", "Dr. López", "https://zoom.com/abc123");
        Cita citaPresencial = new CitaPresencial("21/01/2025", "11:00", "Ana Torres", "Dra. Martínez", "Av. Central 123");
        
        System.out.println(citaOnline.detalles());
        System.out.println(citaPresencial.detalles());
    }
}
