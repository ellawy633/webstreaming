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
            Modifier film :${monFilm.titre}
        </div>
        <div class="contenu">
            <form method="POST">
               
                <label>Titre</label>
                <input type="hidden" value="${monFilm.id}" name="id"/>
                <input name="titre" type="text" value="${monFilm.titre}"/>
                <br>
                <label>Synopsis</label>
                <textarea name="synopsis">${monFilm.synopsis}</textarea>
                <br>
                <label>Annee de production </label>
                <input name="anneeProd" type="text" value="${monFilm.annee}" />
                <br>
                <label>duree en minutes </label>
                <input name="duree" type="text"value="${monFilm.duree}"/>
                <br>
                <input type="submit" value="Modifier"/>
                
            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
