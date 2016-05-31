package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.humanbooster.ideanoval.business.AlerteCommentaire;
import fr.humanbooster.ideanoval.dao.AlerteCommentaireDao;

public class AlerteCommentaireDaoImpl implements AlerteCommentaireDao {
	@Autowired
	private SessionFactory sessionFactory;

	public AlerteCommentaireDaoImpl() {
	}

	public AlerteCommentaireDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addAlerteCommentaire(AlerteCommentaire alerteCommentaire) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(alerteCommentaire);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAlerteCommentaire(AlerteCommentaire alerteCommentaire) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(alerteCommentaire);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public AlerteCommentaire findAlerteCommentaire(int idAlerteCommentaire) {
		return (AlerteCommentaire) sessionFactory.openSession().get(AlerteCommentaire.class, idAlerteCommentaire);
	}

	@Override
	public List<AlerteCommentaire> findAlerteCommentaireAll() {
		return sessionFactory.getCurrentSession().createCriteria(AlerteCommentaire.class).list();

	}

}
