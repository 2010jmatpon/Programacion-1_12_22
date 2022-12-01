public class Direccion {

    private String calle;
    private String ciudad;
    private int codPostal;
    private String pais;

    Direccion(){
        calle = "San Sebastián";
        ciudad = "Ubrique";
        codPostal = 11600;
        pais = "España";
    }

    public String getCalle(){return calle;}
    public void setCalle (String calle){
        this.calle = calle;
    }
    public String getCiudad(){return ciudad;}
    public void setCiudad (String ciudad){
        this.ciudad = ciudad;
    }
    public int getCodPostal(){return codPostal;}
    public void setCodPostal (int codPostal){
        this.codPostal = codPostal;
    }
    public String getPais(){return pais;}
    public void setPais(String pais){
        this.pais = pais;
    }
}
