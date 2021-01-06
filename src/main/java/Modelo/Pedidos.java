package Modelo;

public class Pedidos {
    private int id_pedido;
    private int cant;
    private String fecha;
    private int id_prod;
    private int id_cliente;
    private int cod_postal;

    public Pedidos() {
    }

    public Pedidos(int id_pedido, int cant, String fecha, int id_prod, int id_cliente, int cod_postal) {
        this.id_pedido = id_pedido;
        this.cant = cant;
        this.fecha = fecha;
        this.id_prod = id_prod;
        this.id_cliente = id_cliente;
        this.cod_postal = cod_postal;
    }
    
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }
}
