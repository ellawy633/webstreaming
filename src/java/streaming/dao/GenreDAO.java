/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.OrderBy;
import javax.persistence.Persistence;
import streaming.entity.Film;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreDAO {

    public Genre recherche(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
    return em.find(Genre.class, id);
   
            }
   
    
    

    public List<Genre> listerGenres() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT g FROM Genre g ORDER BY g.nom").getResultList();

    }


}