package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.humanbooster.ideanoval.business.AlerteIdee;
import fr.humanbooster.ideanoval.dao.AlerteIdeeDao;

public class AlerteIdeeDaoImpl implements AlerteIdeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public AlerteIdeeDaoImpl() {
	}

	public AlerteIdeeDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

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

	@Override
	public AlerteIdee findAlerteIdee(int idAlerteIdee) {
		return (AlerteIdee) sessionFactory.openSession().get(AlerteIdee.class, idAlerteIdee);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AlerteIdee> findAlerteIdeeAll() {
		return sessionFactory.getCurrentSession().createCriteria(AlerteIdee.class).list();

	}

}
