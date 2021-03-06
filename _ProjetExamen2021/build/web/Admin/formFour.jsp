<%-- 
    Document   : formFour
    Created on : 1 avr. 2021, 13:30:38
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" href="css/client.css">
    <link rel="stylesheet" href="css/client_navbar.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg fixed-top py-3">
        <div class="container">
            <a href="#" class="navbar-brand text-uppercase font-weight-bold">
                <img src="assets/ecommerce-product-images.jpg" width="50px" alt="">
            </a>
            <button type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggler navbar-toggler-right"><i class="fa fa-bars"></i></button>
            
            <div id="navbarSupportedContent" class="collapse navbar-collapse">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active"><a href="../index.html" class="nav-link text-uppercase font-weight-bold">Accueil <span class="sr-only">(current)</span></a></li>  
                    <li class="nav-item"><a href="login.jsp" class="nav-link text-uppercase font-weight-bold">Deconnexion</a></li>
                    <li class="nav-item"><a href="" class="nav-link text-uppercase font-weight-bold">Aide ?</a></li>
                </ul>
            </div>
        </div>
    </nav>
        
        <form action="../SaveFournisseurAdmin" method="POST">
<div class="container" style="margin-top: 150px">
    <div class="row py-5 mt-4 align-items-center">
        <!-- For Demo Purpose -->
        <div class="col-md-5 pr-lg-5 mb-5 mb-md-0">
            <img src="assets/photo.jpg" alt="" class="img-fluid mb-3 d-none d-md-block">
            <h1>Cr??er un compte </h1>
            <p class="font-italic text-muted mb-0">Vous souhaitez integrer une plateforme d'achat et vente en ligne  ?</p>
            <p class="font-italic text-muted">Vous ??tes ?? la bonne porte. <a href="../index.html" class="text-muted">
                <u>E-commerce</u></a>
            </p>
        </div>

        <!-- Registeration Form -->
        <div class="col-md-7 col-lg-6 ml-auto">
           
                <div class="row">
                    
                     <!-- Nom Fournisseur -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-user text-muted"></i>
                            </span>
                        </div>
                        <input id="nom" type="text" name="nom" placeholder="Nom Fournisseur" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                    <!-- Address -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-location-arrow text-muted"></i>
                            </span>
                        </div>
                        <input id="address" type="text" name="add" placeholder="Adresse" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                     <!-- Nationalite -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-globe text-muted"></i>
                            </span>
                        </div>
                        <input id="nationalite" type="text" name="nat" placeholder="Votre Nationalit??" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                     
                    <!-- Login-->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-lock text-muted"></i>
                            </span>
                        </div>
                        <input id="login" type="text" name="log_client" placeholder="Login" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                    
                    <!-- Password  -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-lock text-muted"></i>
                            </span>
                        </div>
                        <input id="password" type="password" name="mdp_client" placeholder="Password" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                    <!-- Profil  -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-user  text-muted"></i>
                            </span>
                        </div>
                        <input id="profil" type="text" name="profil" placeholder="Votre profil" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                     
                        <!-- Submit Button -->
                    <div class="form-group col-lg-12 mx-auto mb-0">
                        <button type="submit" class="btn btn-primary btn-block py-2">Cr??er un fournisseur </button>
                            
                        
                    </div>
                    
                 
                        
                   
           
        </div>
    </div>
</div>
</form>
<script>

                        // When the user clicks on <div>, open the popup
                        function myFunction() {
                            var popup = document.getElementById("myPopup");
                            popup.classList.toggle("show");
                        }

$(function () {
    $('input, select').on('focus', function () {
        $(this).parent().find('.input-group-text').css('border-color', '#80bdff');
    });
    $('input, select').on('blur', function () {
        $(this).parent().find('.input-group-text').css('border-color', '#ced4da');
    });
});
</script>

    </body>
</html>

