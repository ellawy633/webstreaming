/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ModifierFilmServlet", urlPatterns = {"/modifier_film"})
public class ModifierFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // recupere en fonction id
        Film film = new FilmService().rechercheParId(Long.valueOf(req.getParameter("monId")));
        

//set attribu monfilm ver jsp
        req.setAttribute("monFilm", film);
       
        

//forward ver   jsp
        req.getRequestDispatcher("modifier_film.jsp").forward(req, resp);
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Film f = new FilmService().rechercheParId(Long.valueOf(req.getParameter("id")));
        
        
        //cree un nouveau film rt lr remplit avec donnees entrees par l'uitl dan le formulaire
      f.setTitre( req.getParameter("titre")); 
      f.setSynopsis( req.getParameter("synopsis")); 
      f.setAnnee( Integer.valueOf(req.getParameter("anneeProd")) ); 
      f.setDuree( Integer.valueOf(req.getParameter("duree")) ); 
     
      new FilmService().modifierFilm(f);
        
   resp.sendRedirect("lister_films");
        
    }

    
}
