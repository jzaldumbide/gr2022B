public class Metodos {
    public void nom_Chasi(){
        Estudiantes est = new Estudiantes();
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
        System.out.println("Usuario GitHub : " + est.getUsuario());
        System.out.println("---------------------");
        System.out.println("| Ejercicio GitHub  |");
        System.out.println("---------------------");
        System.out.println("");
    }
}
