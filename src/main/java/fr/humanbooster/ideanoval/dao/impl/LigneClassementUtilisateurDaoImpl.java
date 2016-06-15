package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.LigneClassementUtilisateur;
import fr.humanbooster.ideanoval.dao.LigneClassementUtilisateurDao;

public class LigneClassementUtilisateurDaoImpl implements LigneClassementUtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public boolean addLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur) {
		try {
			Integer id = (int) (sessionFactory.getCurrentSession().save(ligneClassementUtilisateur));
			if (id > -1) {
				ligneClassementUtilisateur.setIdLigneClassementUtilisateur(id);
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
	public boolean updateLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur) {
		try {
			sessionFactory.getCurrentSession().update(ligneClassementUtilisateur);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	@Override
	public boolean deleteLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur) {
		try {
			sessionFactory.getCurrentSession().delete(ligneClassementUtilisateur);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional
	@Override
	public List<LigneClassementUtilisateur> getAllLignesClassementUtilisateur() {
		return sessionFactory.getCurrentSession().createCriteria(LigneClassementUtilisateur.class).list();
	}
}
