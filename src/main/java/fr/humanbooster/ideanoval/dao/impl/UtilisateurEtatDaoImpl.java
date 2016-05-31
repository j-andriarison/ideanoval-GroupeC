package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.UtilisateurEtat;
import fr.humanbooster.ideanoval.dao.UtilisateurEtatDao;

@Repository
public class UtilisateurEtatDaoImpl implements UtilisateurEtatDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public UtilisateurEtatDaoImpl() {
		super();
	}

	public UtilisateurEtatDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public boolean addUtilisateurEtat(UtilisateurEtat utilisateurEtat) {
		Integer id = (int) (sessionFactory.getCurrentSession().save(utilisateurEtat));
		if( id > -1 ) {
			utilisateurEtat.setIdEtatUtilisateur(id);
			return true;
		} else {
			return false;
		}
	}

	@Transactional
	@Override
	public boolean updateUtilisateurEtat(UtilisateurEtat utilisateurEtat) {
		sessionFactory.getCurrentSession().update(utilisateurEtat);
		return true;
	}

	@Transactional
	@Override
	public boolean deleteUtilisateurEtat(UtilisateurEtat utilisateurEtat) {
		sessionFactory.openSession().delete(utilisateurEtat);
		return true;
	}

	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	@Override
	public List<UtilisateurEtat> getAllEtats() {
		return sessionFactory.getCurrentSession().createCriteria(UtilisateurEtat.class).list();
	}

}
