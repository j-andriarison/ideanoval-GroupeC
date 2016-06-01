package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;
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
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Idee> findIdeesUtilisateur(Utilisateur utilisateur) {
		/*
		 * try { Query query = sessionFactory.getCurrentSession().createQuery(
		 * "SELECT c FROM Commentaire c WHERE c.idIdee=:iI");
		 * query.setInteger("iI", idee.getIdIdee()); return query.list(); }
		 * catch (HibernateException e) { e.printStackTrace(); }
		 */
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Commentaire> findCommentairesUtilisateur(Utilisateur utilisateur) {
		/*
		 * try { Query query = sessionFactory.getCurrentSession().createQuery(
		 * "SELECT c FROM Commentaire c WHERE c.idIdee=:iI");
		 * query.setInteger("iI", idee.getIdIdee()); return query.list(); }
		 * catch (HibernateException e) { e.printStackTrace(); }
		 */
		return null;
	}

}
