package DAO;

import javax.persistence.EntityManager;

import models.Utente;
import utils.JpaUtils;

public class UtenteDAO {

	public void save(Utente u) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	public Utente getById(Long id) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			return em.find(Utente.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Utente u) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

}
