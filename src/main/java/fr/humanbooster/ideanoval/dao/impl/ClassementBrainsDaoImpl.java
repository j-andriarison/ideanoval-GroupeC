package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.ClassementBrains;
import fr.humanbooster.ideanoval.dao.ClassementBrainsDao;

@Repository
public class ClassementBrainsDaoImpl implements ClassementBrainsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public ClassementBrainsDaoImpl() {
		super();
	}

	@Transactional(readOnly = true)
	@Override
	public ClassementBrains getClassementBrains() {
		try {
			return (ClassementBrains) sessionFactory.getCurrentSession().createQuery("from ChoixPossible LIMIT 1")
					.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	@Override
	public boolean addClassementBrains(ClassementBrains classementBrains) {
		try {
			Integer id = (int) (sessionFactory.getCurrentSession().save(classementBrains));
			if (id > -1) {
				classementBrains.setIdClassementBrains(id);
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
	public boolean updateClassementBrains(ClassementBrains classementBrains) {
		try {
			sessionFactory.getCurrentSession().update(classementBrains);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteClassementBrains(ClassementBrains classementBrains) {
		try {
			sessionFactory.getCurrentSession().delete(classementBrains);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

}
