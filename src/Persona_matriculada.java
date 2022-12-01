public class Persona_matriculada {
    private String nombre;
    private int numTelefono;
    private String email;

    Persona_matriculada () {
        nombre = "Juan";
        numTelefono = 643878848;
        email = "ejemplo@gmail.com ";
    }

    public String getNombre(){return nombre;}
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public int getNumTelefono(){return numTelefono;}
    public void setNumTelefono(int numTelefono){
        this.numTelefono = numTelefono;
    }
    public String getEmail(){return email;}
    public void setEmail(String email){
        this.email = email;
    }


}
