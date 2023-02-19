package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import models.Rivista;
import utils.JpaUtils;

public class RivistaDAO {

	public void save(Rivista r) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(r);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	public Rivista getById(Long id) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			return em.find(Rivista.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Rivista r) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.remove(r);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}

	public void refresh(Rivista r) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.refresh(r);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

}
