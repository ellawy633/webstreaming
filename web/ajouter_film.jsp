<%-- 
    Document   : _TEMPLATE
    Created on : 28 sept. 2016, 16:09:12
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_HEAD.jsp"/>
    </head>
    <body>

        <div class = "menu">
            <c:import url="_MENU.jsp"/>



        </div>
        <div class="titre">
            Nouveau film
        </div>
        <div class="contenu">
            <form method="POST">
                <label>Titre</label>
                <input name="titre" type="text"/>
                <br>
                <label>Synopsis</label>
                <textarea name="synopsis"></textarea>
                <br>
                <label>Annee de production </label>
                <input name="AnneeProd" type="text"/>
                <br>
                <label>duree en minutes </label>
                <input name="duree" type="text"/>
                <br>
                <input type="submit" value="Ajouter"/>
                
            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
