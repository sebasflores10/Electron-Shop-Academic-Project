package Modelo;

public class Proveedor {
    private int id_prov;
    private String nom_prov;
    private String dir_prov;
    private int tel_prov;
    private int id_prod;

    public Proveedor() {
    }
    
    public Proveedor(int id_prov, String nom_prov, String dir_prov, int tel_prov, int id_prod) {
        this.id_prov = id_prov;
        this.nom_prov = nom_prov;
        this.dir_prov = dir_prov;
        this.tel_prov = tel_prov;
        this.id_prod = id_prod;
    }
    
    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    public String getDir_prov() {
        return dir_prov;
    }

    public void setDir_prov(String dir_prov) {
        this.dir_prov = dir_prov;
    }

    public int getTel_prov() {
        return tel_prov;
    }

    public void setTel_prov(int tel_prov) {
        this.tel_prov = tel_prov;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
}
