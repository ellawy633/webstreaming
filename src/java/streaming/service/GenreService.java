/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.dao.GenreDAO;
import streaming.entity.Film;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {

    

    public List<Genre> lister() {

       GenreDAO dao = new GenreDAO();
        return dao.listerGenres();
    }
public Genre chercherParId(long id){
    
    
    return new GenreDAO().recherche(id);
    
    
    
}
    
    
    
    
    
}
