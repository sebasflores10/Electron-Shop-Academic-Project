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
        <div class="container">
            <div class="row justify-content-md-center">
                <div class="card" style="width: 21rem;">
                    <img src="" class="card-img-top" alt="">
                    <div class="card-body">
                        <form action="Controlador?accion=Ingresar" method="POST">
                            <div class="form-group">
                              <label for="email_tel">Email o número telefónico</label>
                              <input type="text" name="email" class="form-control" id="email_telLogin" aria-describedby="emailHelp" required>
                            </div>
                            <div class="form-group">
                              <label for="pwd">Contraseña</label>
                              <input type="password" name="pwd" class="form-control" id="pwdLogin" required>
                              <small id="pwdHelp" class="form-text text-muted">La contraseña debe contener como mínimo 8 caracteres</small>
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                              <label class="form-check-label" for="exampleCheck1">Recordar contraseña</label>
                            </div>
                            <div class="form-group">
                              <a class="form-label" href="registro.jsp">¿No tienes una cuenta?</a>
                            </div>
                            <button type="submit" class="btn btn-primary" value="Ingresar">Ingresar</button>
                        </form>
                    </div>
                  </div>
            </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
