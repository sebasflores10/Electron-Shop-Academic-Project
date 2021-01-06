package Modelo;

import Data.Conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

public class DataLink {
    Connection conn;
    Conexion cxn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Productos listarIdProd(int id){
        String sql = "select * from PRODUCTOS where id_prod = " + id;
        Productos p = new Productos();
        try{
            conn = cxn.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p.setId_prod(rs.getInt(1));
                p.setNom_prod(rs.getString(2));
                p.setDesc_prod(rs.getString(3));
                p.setPrecio_prod(rs.getDouble(4));
            }
        } catch(Exception e) {
            System.out.print("El producto no existe\n" + e.getMessage());
        }    
        return p;
    }
    
    public List listar(){
        List<Productos> productos = new ArrayList();
        String sql = "select * from PRODUCTOS";
        try{
            conn = cxn.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos p = new Productos();
                p.setId_prod(rs.getInt(1));
                p.setNom_prod(rs.getString(2));
                p.setDesc_prod(rs.getString(3));
                p.setPrecio_prod(rs.getDouble(4));
                productos.add(p);
            }
        }catch(Exception e){
            System.out.print("Error al solicitar los productos\n"+e.getMessage());
        }
        
        return productos;
    }
    
    public void listarProducto(int id, HttpServletResponse response){
        String sql = "select * from PRODUCTOS where id_prod = " + id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try{
            conn = cxn.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch(Exception e) {
            System.out.print("Hubo un error al cargar los productos\n" + e.getMessage());
        }
    }
    
    public Cliente validarUsuario(Cliente cl){
        String sql = "select * from CLIENTES where email = ? and pwd = ?";
        try{
            conn = cxn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(5, cl.getCorreo());
            ps.setString(6, cl.getPwd());
            rs = ps.executeQuery();
            while(rs.next()){
                cl.setCorreo(rs.getString("email"));
                cl.setPwd(rs.getString("pwd"));
            }
        } catch(Exception e) {
            System.out.print("El usuario no existe");
            return null;
        }
        
        return cl;
    }
    
    public int registrarUsuario(Cliente cl){
        int r = 0;
        String sql = "insert into CLIENTES(id_cliente,nom,dir,tel,correo,pwd) values(?,?,?,?,?,?)";
        try{
            conn = cxn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "id_cli_tienda_reg.nextval");
            ps.setString(2, cl.getNom());
            ps.setString(3, "N/A");
            ps.setString(4, String.valueOf(cl.getTel()));
            ps.setString(5, cl.getCorreo());
            ps.setString(6, cl.getPwd());
            r = ps.executeUpdate();
            if(r == 1){
                r = 1;
            } else {
                r = 0;
            }
        } catch(Exception e) {
            System.out.print("Hubo un error al registrar\n" + e.getMessage());
        }
        
        return r;
    }
}
