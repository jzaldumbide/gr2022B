public class main {
    public static void main(String[] args) {
        System.out.println("\t Datos Estudiantes");
        System.out.println("");
        Estudiantes est = new Estudiantes();
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Apellido: "+est.getApellido());
        System.out.println("Edad: "+est.getEdad());
        System.out.println("Codigo Unico: "+est.getCodi());
        System.out.println("");
    }
}
