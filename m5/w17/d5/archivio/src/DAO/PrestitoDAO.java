package DAO;

import javax.persistence.EntityManager;

import models.Prestito;
import utils.JpaUtils;

public class PrestitoDAO {

	public void save(Prestito p) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	public Prestito getById(Long id) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			return em.find(Prestito.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Prestito p) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}
}
