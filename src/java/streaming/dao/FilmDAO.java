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

/**
 *
 * @author admin
 */
public class FilmDAO {

    public void modifierFilm(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }

    public Film rechercheParIdFilm(long id) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Film.class, id);
    }

    public void supprimerFilm(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film f WHERE f.id="+id).executeUpdate();
        em.getTransaction().commit();
    }

    public void ajouterFilm(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    public List<Film> listrFilms() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT f FROM Film f ORDER BY f.id DESC").getResultList();

    }

}
