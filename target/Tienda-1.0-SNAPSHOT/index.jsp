<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/fa4b938cba.js" crossorigin="anonymous"></script>
        <title>Electron Shop</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" name="accion" href="Controlador?accion=home">Electron Shop</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <a class="nav-link" name="accion" href="Controlador?accion=home">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Ofertas del día</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link" href="Controlador?accion=Carrito" tabindex="-1" aria-disabled="true"><i class="fas fa-cart-plus"><label style="color: white">${contador}</label></i>Carrito de compras</a>
                </li>
              </ul>
              <form class="form-inline my-2 my-lg-0">
                  <input class="form-control mr-sm-2" type="search" placeholder="Buscar" style="width: 20rem;" aria-label="Search">
                <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Buscar</button>
              </form>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp">Iniciar sesión</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="registro.jsp">Registrarse</a>
                    </li>
                </ul>
            </div>
          </nav>
        <div class="container mt-4">
            <div class="row">
                <c:forEach var="p" items="${productos}">
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header">
                                <label>${p.getNom_prod()}</label>
                            </div>
                            <div class="card-body">
                                <i>₡${p.getPrecio_prod()}</i>
                                <img src="" width="200" height="180">
                            </div>
                            <div class="card-footer text-center">
                                <label>${p.getDesc_prod()}</label>
                                <div>
                                    <a href="Controlador?accion=AgregarCarrito&id=${p.getId_prod()}" class="btn btn-outline-info">Agregar al carrito</a>
                                    <a href="Controlador?accion=Comprar&id=${p.getId_prod()}" class="btn btn-danger">Ir a Comprar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>               
            </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
