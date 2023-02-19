package DAO;

import javax.persistence.EntityManager;

import models.Elemento;
import utils.JpaUtils;

public class ElementoDAO {

	public void save(Elemento el) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(el);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	public Elemento getById(Long id) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			return em.find(Elemento.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Elemento el) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.remove(em.contains(el) ? el: em.merge(el));
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}
	
	public void refresh(Elemento el) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.refresh(el);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

}
