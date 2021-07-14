package Modelo;
public class USR {
    /*se crean los variables que estan en la base de datos para hacer la insercion posteriormente*/
    private String id;
    private String nombreUSR;
    private String pasword;
    private String tipon;

    public String getTipon() {
        return tipon;
    }

    public void setTipon(String tipon) {
        this.tipon = tipon;
    }
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreUSR() {
        return nombreUSR;
    }

    public void setNombreUSR(String nombreUSR) {
        this.nombreUSR = nombreUSR;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}