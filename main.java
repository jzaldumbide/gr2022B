public class main {
    public static void main(String[] args) {
        System.out.println("\t Datos Estudiantes");
        System.out.println("");
        Estudiantes est = new Estudiantes();
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Apellido: "+est.getApellido());
        System.out.println("Edad: "+est.getEdad());
        System.out.println("Codigo Unico: "+est.getCodi());
        System.out.printf("Usuario GitHub : "+est.getUsuario());
        System.out.println("");


        System.out.println("==========================");
        est.setNombre("Wilson");
        est.setApellido("Guayanay");
        est.setEdad(23);
        est.setCodi("06");
        est.setUsuario("WilsonG08");
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Apellido: "+est.getApellido());
        System.out.println("Edad: "+est.getEdad());
        System.out.println("Codigo Unico: "+est.getCodi());
        System.out.printf("Usuario GitHub : "+est.getUsuario());
        System.out.println("");

        System.out.println("==========================");
        est.setNombre("Alexis");
        est.setApellido("Chasi");
        est.setEdad(27);
        est.setCodi("16");
        est.setUsuario("AlexisChasi");
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Apellido: "+est.getApellido());
        System.out.println("Edad: "+est.getEdad());
        System.out.println("Codigo Unico: "+est.getCodi());
        System.out.printf("Usuario GitHub : "+est.getUsuario());
        System.out.println("");



    }
}
