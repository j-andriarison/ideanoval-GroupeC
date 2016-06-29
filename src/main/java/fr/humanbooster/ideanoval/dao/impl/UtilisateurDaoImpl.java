package fr.humanbooster.ideanoval.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Utilisateur;
import fr.humanbooster.ideanoval.dao.UtilisateurDao;

@SuppressWarnings("deprecation")
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
		try {
			@SuppressWarnings("unchecked")
			Query query = sessionFactory.getCurrentSession().createQuery("FROM Utilisateur u WHERE u.pseudo=:Up");
			query.setString("Up", pseudo);
			Utilisateur utilisateur = (Utilisateur) query.uniqueResult();
			return utilisateur;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}	
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Utilisateur findUtilisateurByMail(String mail) {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("FROM Utilisateur u WHERE u.mail=:Um");
			query.setString("Um", mail);
			Utilisateur utilisateur = (Utilisateur) query.uniqueResult();
			return utilisateur;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}	
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Utilisateur> getBrains() {
		List<Utilisateur> result = new ArrayList<>(10);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("SELECT u FROM Utilisateur u, Idee i GROUP BY i.idUtilisateur ORDER BY count(i.idUtilisateur) DESC");
			query.setMaxResults(10);
			result = query.list();
			return result;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
