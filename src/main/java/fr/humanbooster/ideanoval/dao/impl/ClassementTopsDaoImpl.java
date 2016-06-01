package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.ClassementTops;
import fr.humanbooster.ideanoval.dao.ClassementTopsDao;

@Repository
public class ClassementTopsDaoImpl implements ClassementTopsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public ClassementTopsDaoImpl() {
		super();
	}

	@Transactional(readOnly = true)
	@Override
	public ClassementTops getClassementTops() {
		try {
			return (ClassementTops) sessionFactory.getCurrentSession().createQuery("from ChoixPossible LIMIT 1")
					.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	@Override
	public boolean addClassementTops(ClassementTops classementTops) {
		try {
			Integer id = (int) (sessionFactory.getCurrentSession().save(classementTops));
			if (id > -1) {
				classementTops.setIdClassementIdee(id);
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
	public boolean updateClassementTops(ClassementTops classementTops) {
		try {
			sessionFactory.getCurrentSession().update(classementTops);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteClassementTops(ClassementTops classementTops) {
		try {
			sessionFactory.getCurrentSession().delete(classementTops);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

}
