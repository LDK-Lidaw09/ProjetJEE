<%-- 
    Document   : Pannel
    Created on : 1 avr. 2021, 12:37:18
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" href="Admin/css/client.css">
    <link rel="stylesheet" href="Admin/css/client_navbar.css">
    <!-- Navbar-->
<header class="header">
    <nav class="navbar navbar-expand-lg fixed-top py-3">
        <div class="container">
            <a href="#" class="navbar-brand text-uppercase font-weight-bold">
                <img src="assets/shopping-online.jpg" width="50px" alt="">
            </a>
            <button type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggler navbar-toggler-right"><i class="fa fa-bars"></i></button>
            
            <div id="navbarSupportedContent" class="collapse navbar-collapse">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active"><a href="../index.html" class="nav-link text-uppercase font-weight-bold">Accueil <span class="sr-only">(current)</span></a></li>
                    
                    
                    <li class="nav-item"><a href="Admin/login.jsp" class="nav-link text-uppercase font-weight-bold">Admin</a></li>
                    
                    <li class="nav-item"><a href="#" class="nav-link text-uppercase font-weight-bold">Aide ?</a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("login")==null)
            {
                response.sendRedirect("../LoginAdmin");
                       }
         %>
          <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script>
        $(function () {
            $(window).on('scroll', function () {
                if ( $(window).scrollTop() > 10 ) {
                    $('.navbar').addClass('active');
                } else {
                    $('.navbar').removeClass('active');
                }
            });
        });
</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <div class="container" >
    
 <div class="pt-5" style="margin-top: 150px">
    <div class="row">
        <div class="container">
            <h1 class="text-uppercase" style="margin-left: 40%">a propos</h1>
            <div class="container-fluid">
                <p>
                    Bienvenue dans l'espace de l'administrateur!! <br>
                    Vous avez la possiblité de lister les commandes , mofifier un utilisateur (client, fournisseur),les lister et plein d'autres choses . <br>
                    Apprécier cette experience en ligne!
                </p>
            </div>


            <hr class="my-5">
        </div>
    </div>

                    <!-- List Fournisseur  -->
                    <div class="media position-relative">
                        <img src="Admin/assets/fournisseur.jpg" class="input-group col-lg-2 mb-4" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0">Afficher les fournisseurs</h5>
                            <p>Lister les Fournisseurs</p>
                            
                            <div class="input-group col-lg-4 mb-4" style="margin-left: 300px">
                            <a href="ListeFour" class="stretched-link">Basculer</a>
                           </div>
                            
                        </div>
                        </div>
                    
                     <!-- List Client-->
                    <div class="media position-relative">
                        <img src="Admin/assets/client.jpg" class="input-group col-lg-2 mb-4" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0">Afficher les clients</h5>
                            <p>Liste des clients</p>
                            
                            <div class="input-group col-lg-4 mb-4" style="margin-left: 300px">
                            <a href="ListeClient" class="stretched-link">Basculer</a>
                           </div>
                            
                        </div>
                        </div>
                     <!-- List Product -->
                    <div class="media position-relative">
                        <img src="Admin/assets/ecommerce-product-images.jpg" class="input-group col-lg-2 mb-4" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0">Afficher les produits</h5>
                            <p>Liste des produits</p>
                            
                            <div class="input-group col-lg-4 mb-4" style="margin-left: 300px">
                            <a href="Viewproduct" class="stretched-link">Basculer</a>
                           </div>
                            
                        </div>
                        </div>
                     
                      <!-- List Livraison -->
                    <div class="media position-relative">
                        <img src="Admin/assets/livraison.jpg" class="input-group col-lg-2 mb-4" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0">Afficher les livraisons</h5>
                            <p>Liste des Livraison</p>
                            
                            <div class="input-group col-lg-4 mb-4" style="margin-left: 300px">
                            <a href="ListeLivraison" class="stretched-link">Basculer</a>
                           </div>
                            
                        </div>
                        </div>
                      
                    <!-- Add Four -->
                    <div class="media position-relative">
                        <img src="Admin/assets/four.jpg" class="input-group col-lg-2 mb-4" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0">Ajouter un nouveau fournisseur </h5>
                            <p>Ajout fournisseur</p>
                            
                            <div class="input-group col-lg-4 mb-4" style="margin-left: 300px">
                            <a href="Admin/formFour.jsp" class="stretched-link">Basculer</a>
                           </div>
                            
                        </div>
                        </div>
                     <!-- Add Client -->
                    <div class="media position-relative">
                        <img src="Admin/assets/client_1.jpeg" class="input-group col-lg-2 mb-4" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0">Ajouter un nouveau Client</h5>
                            <p>Ajout Client</p>
                            
                            <div class="input-group col-lg-4 mb-4" style="margin-left: 300px">
                            <a href="Admin/form.jsp" class="stretched-link">Basculer</a>
                           </div>
                            
                        </div>
                        </div>
   
                     <!-- Submit Button -->
                     <div  class="input-group col-lg-2 mb-4" style="margin-left: 375px">
                        <a href="Admin/login.jsp" class="btn btn-primary btn-block py-2">
                            <span class="font-weight-bold">Deconnexion</span>
                        </a>
                    </div>
                    
</div>      
    </body>
</html>
