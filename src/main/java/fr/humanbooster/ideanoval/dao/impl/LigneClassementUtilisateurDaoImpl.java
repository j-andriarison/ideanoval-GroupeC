package fr.humanbooster.ideanoval.dao.impl;

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
		Integer id = (int) (sessionFactory.getCurrentSession().save(ligneClassementUtilisateur));
		if (id > -1) {
			ligneClassementUtilisateur.setIdLigneClassementUtilisateur(id);
			return true;
		} else {
			return false;
		}
	}

	@Transactional
	@Override
	public void updateLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur) {
		sessionFactory.getCurrentSession().update(ligneClassementUtilisateur);
	}

	@Transactional
	@Override
	public void deleteLigneClassementUtilisateur(LigneClassementUtilisateur ligneClassementUtilisateur) {
		sessionFactory.openSession().delete(ligneClassementUtilisateur);
	}
}
