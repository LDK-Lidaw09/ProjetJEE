<%-- 
    Document   : formproduit
    Created on : 30 mars 2021, 03:57:10
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
 <link rel="stylesheet" href="css/client.css">
     <link rel="stylesheet" href="css/client_navbar.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <form action="../SaveProduit" method="POST">
    <div class="container" style="margin-top: 150px">
    <div class="row py-5 mt-4 align-items-center">
        
         <div class="col-md-5 pr-lg-5 mb-5 mb-md-0">
            <img src="assets/ecommerce-product-page-nike-1.png" alt="" class="img-fluid mb-3 d-none d-md-block">
            <h1>Enregistrer un produit</h1>
            </p>
        </div>
       <!-- Registeration Form -->
        <div class="col-md-7 col-lg-6 ml-auto">
           
                <div class="row">

                   <!-- Name --> 
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-user text-muted"></i>
                            </span>
                        </div>
                        <input type="text" name="nom" placeholder="Nom du produit " class="form-control bg-white border-left-0 border-md" required>
                    </div>

                     <!-- Categorie -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-user text-muted"></i>
                            </span>
                        </div>
                        <input type="text" name="categorie" placeholder="La catégorie du produit" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                    <!-- Quantité -->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-location-arrow text-muted"></i>
                            </span>
                        </div>
                        <input  type="number" name="qte" placeholder="quantite du produit" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                     <!-- Prix du produit-->
                    <div class="input-group col-lg-12 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-briefcase text-muted"></i>
                            </span>
                        </div>
                        <input type="number" name="prix" placeholder="Le prix du produit" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                     
                    <!-- Date de Fabrication-->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-lock text-muted"></i>
                            </span>
                        </div>
                        <input type="date" name="datefab" placeholder="La date de fabrication" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                    
                    <!-- Date d'expiration  -->
                    <div class="input-group col-lg-6 mb-4">
                        <div class="input-group-prepend">
                            <span class="input-group-text bg-white px-4 border-md border-right-0">
                                <i class="fa fa-lock text-muted"></i>
                            </span>
                        </div>
                        <input type="date" name="datexp" placeholder="La date d'expiration" class="form-control bg-white border-left-0 border-md" required>
                    </div>
                    
                     
                        <!-- Submit Button -->
                    <div class="form-group col-lg-12 mx-auto mb-0">
                        <button type="submit" class="btn btn-primary btn-block py-2">Soummettre Le produit </button>
                            
                        
                    </div>
                    
                 
                        
                    <!-- Divider Text -->
                    <div class="form-group col-lg-12 mx-auto d-flex align-items-center my-4">
                        <div class="border-bottom w-100 ml-5"></div>
                        <span class="px-2 small text-muted font-weight-bold text-muted">OR</span>
                        <div class="border-bottom w-100 mr-5"></div>
                    </div>

                
                    

                    <!-- Already Registered -->
                    <div class="text-center w-100">
                        <p class="text-muted font-weight-bold">Voulez vous voir vos produits ? <a href="../Viewproduct" class="text-primary ml-2">Afficher les produits</a></p>
                    </div>

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
