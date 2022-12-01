import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Persona_matriculada persona_matriculada1 = new Persona_matriculada();

        System.out.println("Persona matriculada 1");
        System.out.println("Nombre: " + persona_matriculada1.getNombre());
        System.out.println("Múmero Telefono: " + persona_matriculada1.getNumTelefono());
        System.out.println("Email: " + persona_matriculada1.getEmail());

        Direccion direccion = new Direccion();

        System.out.println("Dirección");
        System.out.println("Calle: " + direccion.getCalle());
        System.out.println("Ciudad: " + direccion.getCiudad());
        System.out.println("Código Postal " + direccion.getCodPostal());
        System.out.println("País: " + direccion.getPais());

        Instituto instituto = new Instituto();

        System.out.println("Instituto");
        System.out.println("Nombre: " + instituto.getNombre());
        System.out.println("Curso: " + instituto.getCurso());
        System.out.println("Grupo: " + instituto.getGrupo());
    }
}