<%-- 
    Document   : lister_films
    Created on : 28 sept. 2016, 11:52:04
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       
        <a href="index.html"> Home </a>
        <a href="lister_films.html"> Liste de Film </a>
        <a href="liste_serie.html"> Liste de series </a>
        <a href="ajouter_film.html"> Ajouter film </a>
        <a href="ajouter_serie.html"> Ajouter serie </a>
        
         <h1> ${titre} </h1>
         
         
         <div>
             <c:forEach items="${mesFilms}" var="monFilm">
                 ${monFilm.titre}
                 
             </c:forEach>

         <div>${pied} </div>

        
    </body>
</html>
