package Modelo;

public class Tienda {
    private int id_tienda;
    private String nom_tienda;
    private String dir_tienda;
    private int id_pedido;
    private int cod_postal;

    public Tienda() {
    }

    public Tienda(int id_tienda, String nom_tienda, String dir_tienda, int id_pedido, int cod_postal) {
        this.id_tienda = id_tienda;
        this.nom_tienda = nom_tienda;
        this.dir_tienda = dir_tienda;
        this.id_pedido = id_pedido;
        this.cod_postal = cod_postal;
    }
    
    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNom_tienda() {
        return nom_tienda;
    }

    public void setNom_tienda(String nom_tienda) {
        this.nom_tienda = nom_tienda;
    }

    public String getDir_tienda() {
        return dir_tienda;
    }

    public void setDir_tienda(String dir_tienda) {
        this.dir_tienda = dir_tienda;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }
}
