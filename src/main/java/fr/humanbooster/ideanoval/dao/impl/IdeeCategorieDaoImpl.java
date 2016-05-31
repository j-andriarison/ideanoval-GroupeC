package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.IdeeCategorie;
import fr.humanbooster.ideanoval.dao.IdeeCategorieDao;

@Repository
public class IdeeCategorieDaoImpl implements IdeeCategorieDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public IdeeCategorieDaoImpl() {
		super();
	}

	public IdeeCategorieDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public boolean addIdeeCategorie(IdeeCategorie ideeCategorie) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(ideeCategorie);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean updateIdeeCategorie(IdeeCategorie ideeCategorie) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(ideeCategorie);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean deleteIdeeCategorie(IdeeCategorie ideeCategorie) {
		try {
			sessionFactory.getCurrentSession().delete(ideeCategorie);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public IdeeCategorie findIdeeCategorieById(int idIdeeCategorie) {
		return (IdeeCategorie) sessionFactory.openSession().get(IdeeCategorie.class, idIdeeCategorie);
	}

}
