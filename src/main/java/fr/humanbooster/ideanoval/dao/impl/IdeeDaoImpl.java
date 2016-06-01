package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.dao.IdeeDao;

@Repository
public class IdeeDaoImpl implements IdeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public IdeeDaoImpl() {
		super();
	}

	@Override
	@Transactional
	public boolean addIdee(Idee idee) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(idee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateIdee(Idee idee) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(idee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteIdee(Idee idee) {
		try {
			sessionFactory.getCurrentSession().delete(idee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteIdee(int idIdee) {
		try {
			sessionFactory.getCurrentSession().delete(findIdeeById(idIdee));
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Idee findIdeeById(int idIdee) {
		try {
			return (Idee) sessionFactory.openSession().get(Idee.class, idIdee);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
