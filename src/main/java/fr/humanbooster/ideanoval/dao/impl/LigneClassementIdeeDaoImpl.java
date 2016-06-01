package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.LigneClassementIdee;
import fr.humanbooster.ideanoval.dao.LigneClassementIdeeDao;

public class LigneClassementIdeeDaoImpl implements LigneClassementIdeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public boolean addLigneClassementIdee(LigneClassementIdee ligneClassementIdee) {
		try {
			Integer id = (int) (sessionFactory.getCurrentSession().save(ligneClassementIdee));
			if (id > -1) {
				ligneClassementIdee.setIdLigneClassementIdee(id);
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
	public boolean updateLigneClassementIdee(LigneClassementIdee ligneClassementIdee) {
		try {
			sessionFactory.getCurrentSession().update(ligneClassementIdee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteLigneClassementIdee(LigneClassementIdee ligneClassementIdee) {
		try {
			sessionFactory.getCurrentSession().delete(ligneClassementIdee);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

}
