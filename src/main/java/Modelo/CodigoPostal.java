package Modelo;

public class CodigoPostal {
    private int cod_postal;
    private String nom_lugar;

    public CodigoPostal() {
    }

    public CodigoPostal(int cod_postal, String nom_lugar) {
        this.cod_postal = cod_postal;
        this.nom_lugar = nom_lugar;
    }
    
    public int getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getNom_lugar() {
        return nom_lugar;
    }

    public void setNom_lugar(String nom_lugar) {
        this.nom_lugar = nom_lugar;
    }
}
