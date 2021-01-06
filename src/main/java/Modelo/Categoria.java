package Modelo;

public class Categoria {
    private int id_categoria;
    private String descripcion;
    private int id_prod;

    public Categoria() {
    }

    public Categoria(int id_categoria, String descripcion, int id_prod) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.id_prod = id_prod;
    }
    
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
}
