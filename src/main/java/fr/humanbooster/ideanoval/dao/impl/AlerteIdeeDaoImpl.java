package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.AlerteIdee;
import fr.humanbooster.ideanoval.dao.AlerteIdeeDao;

@Repository
public class AlerteIdeeDaoImpl implements AlerteIdeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public AlerteIdeeDaoImpl() {

	}

	@Transactional
	@Override
	public boolean addAlerteIdee(AlerteIdee alerteIdee) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(alerteIdee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Transactional
	@Override
	public boolean updateAlerteIdee(AlerteIdee alerteIdee) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(alerteIdee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Transactional(readOnly = true)
	@Override
	public AlerteIdee findAlerteIdee(int idAlerteIdee) {
		return (AlerteIdee) sessionFactory.openSession().get(AlerteIdee.class, idAlerteIdee);

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<AlerteIdee> findAlerteIdeeAll() {
		return sessionFactory.getCurrentSession().createCriteria(AlerteIdee.class).list();
	}

}
