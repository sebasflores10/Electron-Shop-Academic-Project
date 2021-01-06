package Gestion;

import Modelo.Cliente;
import Modelo.DataLink;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsuarioController extends HttpServlet {
    DataLink dl = new DataLink();
    Cliente cl = new Cliente();
    int r;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("email");
        if(accion.equals("Iniciar sesión")){
            String email_tel = request.getParameter("email");
            String pwd = request.getParameter("pwd");
            cl.setCorreo(email_tel);
            cl.setPwd(pwd);
            //r = dl.validar(cl);
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
