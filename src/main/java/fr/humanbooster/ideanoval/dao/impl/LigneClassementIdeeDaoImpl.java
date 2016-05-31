package fr.humanbooster.ideanoval.dao.impl;

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
		Integer id = (int) (sessionFactory.getCurrentSession().save(ligneClassementIdee));
		if (id > -1) {
			ligneClassementIdee.setIdLigneClassementIdee(id);
			return true;
		} else {
			return false;
		}
	}

	@Transactional
	@Override
	public void updateLigneClassementIdee(LigneClassementIdee ligneClassementIdee) {
		sessionFactory.getCurrentSession().update(ligneClassementIdee);
	}

	@Transactional
	@Override
	public void deleteLigneClassementIdee(LigneClassementIdee ligneClassementIdee) {
		sessionFactory.openSession().delete(ligneClassementIdee);
	}

}
