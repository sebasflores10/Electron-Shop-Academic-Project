<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/fa4b938cba.js" crossorigin="anonymous"></script>
        <title>Registro</title>
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-md-center">
                <div class="card" style="width: 50rem;">
                    <div class="card-body">
                        <form action="Controlador?accion=Confirmar" method="POST">
                            <div class="form-row">
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault01">Nombre</label>
                                <input type="text" class="form-control" id="registroNombre" name="registroNombre" required>
                              </div>
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault02">Apellidos</label>
                                <input type="text" class="form-control" id="registroApellidos" name="registroApellidos" required>
                              </div>
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault03">Número telefónico</label>
                                <input type="tel" class="form-control" id="registroTelefono" name="registroTelefono" required>
                              </div>
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault04">Correo electrónico</label>
                                <input type="email" class="form-control" id="registroCorreo" name="registroCorreo" required>
                              </div>
                            </div>
                            <div class="form-row">
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault05">Provincia</label>
                                <input type="text" class="form-control" id="registroProvincia" name="registroProvincia" required>
                              </div>
                              <div class="col-md-3 mb-3">
                                <label for="validationDefault06">Cantón</label>
                                <select class="custom-select" id="registroCanton" name="registroCanton" required>
                                  <option selected disabled>Seleccione un cantón...</option>
                                  <option value="Hatillo">Hatillo</option>
                                  <option value="Zapote">Zapote</option>
                                  <option value="San Francisco de Dos Ríos">San Francisco de Dos Ríos</option>
                                  <option value="Escazú">Escazú</option>
                                  <option value="Alajuelita">Alajuelita</option>
                                </select>
                              </div>
                              <div class="col-md-3 mb-3">
                                <label for="validationDefault07">Código Postal</label>
                                <input type="text" class="form-control" id="registroPostal" name="registroPostal" required>
                              </div>
                            </div>
                            <div class="form-row">
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault08">Contraseña</label>
                                <input type="password" class="form-control" id="registroPwd" name="registroPwd" required>
                              </div>
                              <div class="col-md-6 mb-3">
                                <label for="validationDefault09">Confirmar contraseña</label>
                                <input type="password" class="form-control" id="registroConfirmaPwd" name="registroConfirmaPwd" required>
                              </div>
                            </div>
                            <div class="form-group">
                              <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="registroCheckbox" required>
                                <label class="form-check-label" for="registrpCheckbox">
                                  Acepto los términos y condiciones
                                </label>
                              </div>
                            </div>
                            <button class="btn btn-primary" type="submit" name="Confirmar">Confirmar</button>
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
