package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Utilisateur;
import fr.humanbooster.ideanoval.dao.UtilisateurDao;

@Repository
public class UtilisateurDaoImpl implements UtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;

	public UtilisateurDaoImpl() {
		super();
	}

	@Override
	@Transactional
	public boolean addUtilisateur(Utilisateur utilisateur) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(utilisateur);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean updateUtilisateur(Utilisateur utilisateur) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(utilisateur);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean deleteUtilisateur(Utilisateur utilisateur) {
		try {
			sessionFactory.getCurrentSession().delete(utilisateur);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean deleteUtilisateur(int idUtilisateur) {
		try {
			sessionFactory.getCurrentSession().delete(findUtilisateurById(idUtilisateur));
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional(readOnly = true)
	public Utilisateur findUtilisateurById(int idUtilisateur) {
		try {
			return (Utilisateur) sessionFactory.getCurrentSession().get(Utilisateur.class, idUtilisateur);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Transactional(readOnly = true)
	public Utilisateur findUtilisateurByPseudo(String pseudo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly = true)
	public Utilisateur findUtilisateurByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
