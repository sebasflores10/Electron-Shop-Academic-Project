package Modelo;

public class Productos {
    private int id_prod;
    private String nom_prod;
    private String desc_prod;
    private double precio_prod;

    public Productos() {
    }

    public Productos(int id_prod, String nom_prod, String desc_prod, double precio_prod) {
        this.id_prod = id_prod;
        this.nom_prod = nom_prod;
        this.desc_prod = desc_prod;
        this.precio_prod = precio_prod;
    }
    
    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(double precio_prod) {
        this.precio_prod = precio_prod;
    }
}
