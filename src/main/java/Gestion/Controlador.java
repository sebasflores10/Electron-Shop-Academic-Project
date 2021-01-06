package Gestion;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {
    DataLink dl = new DataLink();
    Productos p = new Productos();
    Cliente cl = new Cliente();
    Carrito car;
    List<Productos> productos = new ArrayList();
    List<Carrito> listaCarrito = new ArrayList();
    int item;
    double total = 0.0;
    int cantidad = 1;
    int id_prod;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        productos = dl.listar();
        switch(accion){
            case "Comprar"://home
                total = 0.0;
                int pos = 0;
                double subtotal = 0;
                cantidad = 1;
                id_prod = Integer.parseInt(request.getParameter("id"));
                p = dl.listarIdProd(id_prod);
                if(listaCarrito.size() > 0){
                    for(int i = 0; i < listaCarrito.size(); i++){
                        if(id_prod == listaCarrito.get(i).getId_prod()){
                            pos = i;
                        }
                    }
                    if(id_prod == listaCarrito.get(pos).getId_prod()){
                        cantidad = listaCarrito.get(pos).getCantidad() + cantidad;
                        subtotal = subtotal + listaCarrito.get(pos).getPrecio_prod() * cantidad;
                        listaCarrito.get(pos).setCantidad(cantidad);
                        listaCarrito.get(pos).setSubtotal(subtotal);
                    } else {
                        item = item + 1;
                        car = new Carrito();
                        car.setItem(item);
                        car.setId_prod(p.getId_prod());
                        car.setNom_prod(p.getNom_prod());
                        car.setDesc_prod(p.getDesc_prod());
                        car.setPrecio_prod(p.getPrecio_prod());
                        car.setCantidad(cantidad);
                        car.setSubtotal(cantidad*p.getPrecio_prod());
                        listaCarrito.add(car);
                    }
                } else {
                    item = item + 1;
                    car = new Carrito();
                    car.setItem(item);
                    car.setId_prod(p.getId_prod());
                    car.setNom_prod(p.getNom_prod());
                    car.setDesc_prod(p.getDesc_prod());
                    car.setPrecio_prod(p.getPrecio_prod());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad*p.getPrecio_prod());
                    listaCarrito.add(car);
                }
                for(int i = 0; i < listaCarrito.size(); i++){
                    total = total + listaCarrito.get(i).getSubtotal();
                }
                request.setAttribute("contador", listaCarrito.size());
                request.setAttribute("carrito", listaCarrito);
                request.setAttribute("total", total);
                request.getRequestDispatcher("carrito.jsp").forward(request, response);
                break;
            case "AgregarCarrito":
                int poss = 0;
                double subtotall = 0;
                cantidad = 1;
                id_prod = Integer.parseInt(request.getParameter("id"));
                p = dl.listarIdProd(id_prod);
                if(listaCarrito.size() > 0){
                    for(int i = 0; i < listaCarrito.size(); i++){
                        if(id_prod == listaCarrito.get(i).getId_prod()){
                            poss = i;
                        }
                    }
                    if(id_prod == listaCarrito.get(poss).getId_prod()){
                        cantidad = listaCarrito.get(poss).getCantidad() + cantidad;
                        subtotall = subtotall + listaCarrito.get(poss).getPrecio_prod() * cantidad;
                        listaCarrito.get(poss).setCantidad(cantidad);
                        listaCarrito.get(poss).setSubtotal(subtotall);
                    } else {
                        item = item + 1;
                        car = new Carrito();
                        car.setItem(item);
                        car.setId_prod(p.getId_prod());
                        car.setNom_prod(p.getNom_prod());
                        car.setDesc_prod(p.getDesc_prod());
                        car.setPrecio_prod(p.getPrecio_prod());
                        car.setCantidad(cantidad);
                        car.setSubtotal(cantidad*p.getPrecio_prod());
                        listaCarrito.add(car);
                    }
                } else {
                    item = item + 1;
                    car = new Carrito();
                    car.setItem(item);
                    car.setId_prod(p.getId_prod());
                    car.setNom_prod(p.getNom_prod());
                    car.setDesc_prod(p.getDesc_prod());
                    car.setPrecio_prod(p.getPrecio_prod());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad*p.getPrecio_prod());
                    listaCarrito.add(car);
                }
                request.setAttribute("contador", listaCarrito.size());
                request.getRequestDispatcher("Controlador?accion=home").forward(request, response);
                break;
            case "Carrito":
                total = 0.0;
                request.setAttribute("carrito", listaCarrito);
                for(int i = 0; i < listaCarrito.size(); i++){
                    total = total + listaCarrito.get(i).getSubtotal();
                }
                request.setAttribute("total", total);
                request.getRequestDispatcher("carrito.jsp").forward(request, response);
                break;
            case "Ingresar":
                String email_tel = request.getParameter("email");
                String pwd = request.getParameter("pwd");
                cl.setCorreo(email_tel);
                cl.setPwd(pwd);
                dl.validarUsuario(cl);
                if(cl.getCorreo().equals(email_tel)){
                    request.getRequestDispatcher("perfil.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                                
                break;
            case "Confirmar"://Registro
                String nombre = request.getParameter("registroNombre");
                String apellidos = request.getParameter("registroApellidos");
                String tel = request.getParameter("registroTelefono");
                String correo = request.getParameter("registroCorreo");
                String pwdRegistro = request.getParameter("registroPwd");
                cl.setNom(nombre + " " + apellidos);
                cl.setTel(Integer.parseInt(tel));
                cl.setCorreo(correo);
                cl.setPwd(pwdRegistro);
                dl.registrarUsuario(cl);
                request.getRequestDispatcher("perfil.jsp").forward(request, response);
                break;
            /*case "ConfirmarCompra":
                
                break;
              */  
            default:
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
