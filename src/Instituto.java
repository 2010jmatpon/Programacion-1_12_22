public class Instituto {
    private String nombre;
    private String curso;
    private String grupo;

    Instituto(){
        nombre = "Ies Los Remedios";
        curso = "1º E.S.O. ";
        grupo = "B";
    }
    public String getNombre(){return nombre;}
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getCurso(){return curso;}
    public void setCurso (String curso){
        this.curso = curso;
    }
    public String getGrupo(){return grupo;}
    public void setGrupo (String grupo){
        this.grupo = grupo;
    }
}
