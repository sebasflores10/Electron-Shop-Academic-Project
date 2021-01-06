package Modelo;

public class Cliente {
    private int id_cliente;
    private String nom;
    private String dir;
    private int tel;
    private String correo;
    private String pwd;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nom, String dir, int tel, String correo, String pwd) {
        this.id_cliente = id_cliente;
        this.nom = nom;
        this.dir = dir;
        this.tel = tel;
        this.correo = correo;
        this.pwd = pwd;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
