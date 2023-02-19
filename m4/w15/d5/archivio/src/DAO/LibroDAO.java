package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import models.Libro;
import utils.JpaUtils;

public class LibroDAO {

	public void save(Libro l) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	public Libro getById(Long id) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			return em.find(Libro.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Libro l) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.remove(l);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}

	public void refresh(Libro l) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.refresh(l);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

}
