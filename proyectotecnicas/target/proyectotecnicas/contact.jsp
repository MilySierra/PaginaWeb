<%-- 
    Document   : contact
    Created on : 23/05/2024, 12:27:14 a. m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Banco MD - Online Courses HTML Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet"> 

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">

    <style>
        .alert {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
        }
    
        .alert-success {
            color: #155724;
            background-color: #d4edda;
            border-color: #c3e6cb;
        }
    
        .alert-danger {
            color: #721c24;
            background-color: #f8d7da;
            border-color: #f5c6cb;
        }
    </style>
    
    <script>
        function mostrarMensaje(mensaje) {
            document.getElementById("mensaje").innerHTML = mensaje;
            document.getElementById("mensaje").style.display = "block";
        }

        function ocultarMensaje() {
            document.getElementById("mensaje").style.display = "none";
        }
    </script>
</head>

<body>
    <!-- Topbar Start -->
    <div class="container-fluid d-none d-lg-block">
        <div class="row align-items-center py-4 px-xl-5">
            <div class="col-lg-3">
                <a href="" class="text-decoration-none">
                    <h1 class="m-0"><span class="text-primary">Banco</span>LXL</h1>
                </a>
            </div>
            <div class="col-lg-3 text-right">
                <div class="d-inline-flex align-items-center">
                    <i class="fa fa-2x fa-map-marker-alt text-primary mr-3"></i>
                    <div class="text-left">
                        <h6 class="font-weight-semi-bold mb-1">Nuestra Oficina</h6>
                        <small>Avenida Rionegro</small>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 text-right">
                <div class="d-inline-flex align-items-center">
                    <i class="fa fa-2x fa-envelope text-primary mr-3"></i>
                    <div class="text-left">
                        <h6 class="font-weight-semi-bold mb-1">Gmail</h6>
                        <small>banco@gmail.com</small>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 text-right">
                <div class="d-inline-flex align-items-center">
                    <i class="fa fa-2x fa-phone text-primary mr-3"></i>
                    <div class="text-left">
                        <h6 class="font-weight-semi-bold mb-1">Contáctanos</h6>
                        <small>+57 3103567582</small>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->


    <!-- Navbar Start -->
    <div class="container-fluid">
        <div class="row border-top px-xl-5">
            <div class="col-lg-3 d-none d-lg-block">
                <a class="d-flex align-items-center justify-content-between bg-secondary w-100 text-decoration-none" data-toggle="collapse" href="#navbar-vertical" style="height: 67px; padding: 0 30px;">
                    <h5 class="text-primary m-0"><i class="fa fa-book-open mr-2"></i>Redes sociales</h5>
                    <i class="fa fa-angle-down text-primary"></i>
                </a>
                <nav class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0 bg-light" id="navbar-vertical" style="width: calc(100% - 30px); z-index: 9;">
                    <div class="navbar-nav w-100">

                        <a href="" class="nav-item nav-link">Facebook</a>
                        <a href="" class="nav-item nav-link">Instagram</a>
                    </div>
                </nav>
            </div>
            <div class="col-lg-9">
                <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
                    <a href="" class="text-decoration-none d-block d-lg-none">
                        <h1 class="m-0"><span class="text-primary">Banco</span>LXL</h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav py-0">
                            <a href="index.jsp" class="nav-item nav-link">Inicio</a>
                            <a href="about.jsp" class="nav-item nav-link">Sobre</a>
                            <a href="course.jsp" class="nav-item nav-link">Educación financiera</a>
                            <a href="contact.jsp" class="nav-item nav-link active">Inf. Personal</a>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </div>
    <!-- Navbar End -->


    <!-- Header Start -->
    <div class="container-fluid page-header" style="margin-bottom: 90px;">
        <div class="container">
            <div class="d-flex flex-column justify-content-center" style="min-height: 300px">
                <h3 class="display-4 text-white text-uppercase">Inf. Personal</h3>
                <div class="d-inline-flex text-white">
                    <p class="m-0 text-uppercase"><a class="text-white" href="">Inicio</a></p>
                    <i class="fa fa-angle-double-right pt-1 px-3"></i>
                    <p class="m-0 text-uppercase">Inf. Personal</p>
                </div>
            </div>
        </div>
    </div>
    <!-- Header End -->


   <!-- Contact Start -->
<div class="container-fluid py-5">
    <div class="container py-5">
        <div class="text-center mb-5">
            <h5 class="text-primary text-uppercase mb-3" style="letter-spacing: 5px;">Inicio de sesión</h5>
            <h1>Ingrese su usuario y contraseña</h1>
        </div>
        
        <div class="row justify-content-center">
            <div class="col-lg-8">
                <div class="contact-form bg-secondary rounded p-5">
                    <div id="success"></div>
                        <!-- Formulario único con dos botones con acciones diferentes -->
                        <form method="post">
                            <div class="control-group mb-3">
                                <input type="text" name="usuario" class="form-control border-0 p-4" placeholder="Usuario" required="required">
                            </div>
                            <div class="control-group mb-3">
                                <input type="password" name="contrasena" class="form-control border-0 p-4" placeholder="Contraseña" required="required">
                            </div>
                            <div class="text-center">
                                <button type="submit" formaction="RegistroUsuarioServlet" class="btn btn-primary py-3 px-5" onclick="ocultarMensaje">Registrarse</button>
                                <div class="mx-2 d-inline-block"></div>
                                <button type="submit" formaction="InicioSesionServlet" class="btn btn-primary py-3 px-5" onclick="ocultarMensaje">Iniciar sesión</button>
                            </div>
                        </form>
                        <div id="mensaje" class="alert" role="alert">
                            <% 
                            String mensaje = (String) request.getAttribute("mensaje"); 
                            mensaje = mensaje != null ? mensaje : ""; // Si mensaje es null, asigna una cadena vacía
                            %>
                            <%= mensaje %>
                        </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Contact End -->

    <!-- Footer Start -->
    <div class="container-fluid bg-dark text-white py-5 px-sm-3 px-lg-5" style="margin-top: 60px;">
        <div class="row pt-5">
            <div class="col-lg-7 col-md-12">
                <div class="row">
                    <div class="col-md-6 mb-5">
                        <h5 class="text-primary text-uppercase mb-4" style="letter-spacing: 5px;">Contáctanos</h5>
                        <p><i class="fa fa-map-marker-alt mr-2"></i>Avenida Rionegro</p>
                        <p><i class="fa fa-phone-alt mr-2"></i>+57 3103567582</p>
                        <p><i class="fa fa-envelope mr-2"></i>banco@gmail.com</p>
                        <div class="d-flex justify-content-start mt-4">
                            <a class="btn btn-outline-light btn-square mr-2" href="https://www.facebook.com/share/GKtPZ3sjRcZTzPGx/?mibextid=LQQJ4d"><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-outline-light btn-square" href="https://www.instagram.com/banco_lxl?igsh=MTY3aWpha3JuOTVpZw%3D%3D&utm_source=qr"><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                    <div class="col-md-6 mb-5">
                        <h5 class="text-primary text-uppercase mb-4" style="letter-spacing: 5px;">Legal</h5>
                        <div class="d-flex flex-column justify-content-start">
                            <span class="text-white mb-2"><i class="fa fa-angle-right mr-2"></i>Transparencia</span>
                            <span class="text-white mb-2"><i class="fa fa-angle-right mr-2"></i>Atención al consumidor</span>
                            <span class="text-white mb-2"><i class="fa fa-angle-right mr-2"></i>Procesos licitatorios seguros</span>
                            <span class="text-white mb-2"><i class="fa fa-angle-right mr-2"></i>Defensor del consumidor</span>
                            <span class="text-white"><i class="fa fa-angle-right mr-2"></i>Protección de datos</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-5 col-md-12 mb-5">
                <h5 class="text-primary text-uppercase mb-4" style="letter-spacing: 5px;">Vigilado</h5>
                <p>Productos y servicios de Banca, Fiducia, Banca de Inversión, Financiamiento, además del portafolio ofrecido por las entidades del exterior en Panamá, Estados Unidos y Puerto Rico.</p>

            </div>
        </div>
    </div>
    <!-- Footer End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-angle-double-up"></i></a>


    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Contact Javascript File -->
    <script src="mail/jqBootstrapValidation.min.js"></script>
    <script src="mail/contact.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="mail/jqBootstrapValidation.min.js"></script>
    <script src="mail/contact.js"></script>
    <script src="js/main.js"></script>
</body>

</html>
