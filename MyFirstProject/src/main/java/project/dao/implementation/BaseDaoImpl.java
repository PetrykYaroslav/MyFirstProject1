package project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import project.dao.BaseDao;
import project.domain.Teacher;

public class BaseDaoImpl<E> implements BaseDao<E> {

	private Class<E> entityClass;

	public BaseDaoImpl() {

	}

	public BaseDaoImpl(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public void add(E entity) {
		entityManager.persist(entity);
	}

	@Transactional
	public void delete(E entity) {
		entityManager.remove(entityManager.merge(entity));
	}

	@Transactional
	public E update(E entity) {
		return entityManager.merge(entity);
	}

	@Transactional
	public E findById(int id) {
		return (E) entityManager
				.createQuery(
						"SELECT c FROM " + entityClass.getSimpleName()
								+ " c WHERE c.id = :id").setParameter("id", id)
				.getSingleResult();

	}
	@Transactional
	public List<E> getAll() {
		return entityManager.createQuery("from " + entityClass.getSimpleName())
				.getResultList();
	}

}
