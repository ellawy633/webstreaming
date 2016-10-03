/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Serie;
import streaming.entity.Serie_;
import streaming.service.GenreService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterSerie", urlPatterns = {"/ajouter_serie"})
public class AjouterSerieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Serie s = new Serie();

        //cree un nouveau film rt lr remplit avec donnees entrees par l'uitl dan le formulaire
        s.setTitre(req.getParameter("titre"));
        s.setSynopsis(req.getParameter("synopsis"));

        new SerieService().ajouterSerie(s);

        resp.sendRedirect("lister_series");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("genres", new GenreService().lister());
        req.getRequestDispatcher("ajouter_serie.jsp").forward(req, resp);

    }
}
