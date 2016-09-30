<%-- 
    Document   : ajouter_serie
    Created on : 30 sept. 2016, 11:34:41
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class = "menu">
            <c:import url="_MENU.jsp"/>



        </div>
        <div class="titre">
            Nouveau serie
        </div>
        <div class="contenu">
            <form method="POST">
                <label>Titre</label>
                <input name="titre" type="text"/>
                <br>
                <label>Synopsis</label>
                <textarea name="synopsis"></textarea>
                <br>
                                              
                 <input type="submit" value="Ajouter"/>
                
            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div> 
        
        
        
        
        
        
        
        
        
        
        <h1>Hello World!</h1>
    </body>
</html>
