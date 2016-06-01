package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.ClassementBuzzs;
import fr.humanbooster.ideanoval.dao.ClassementBuzzsDao;

@Repository
public class ClassementBuzzsDaoImpl implements ClassementBuzzsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public ClassementBuzzsDaoImpl() {
		super();
	}

	@Transactional(readOnly = true)
	@Override
	public ClassementBuzzs getClassementBuzzs() {
		try {
			return (ClassementBuzzs) sessionFactory.getCurrentSession().createQuery("from ChoixPossible LIMIT 1")
					.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	@Override
	public boolean addClassementBuzzs(ClassementBuzzs classementBuzzs) {
		try {
			Integer id = (int) (sessionFactory.getCurrentSession().save(classementBuzzs));
			if (id > -1) {
				classementBuzzs.setIdClassementIdee(id);
				return true;
			} else {
				return false;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	@Override
	public boolean updateClassementBuzzs(ClassementBuzzs classementBuzzs) {
		try {
			sessionFactory.getCurrentSession().update(classementBuzzs);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteClassementBuzzs(ClassementBuzzs classementBuzzs) {
		try {
			sessionFactory.getCurrentSession().delete(classementBuzzs);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

}
