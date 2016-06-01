package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.dao.CommentaireDao;

@Repository
public class CommentaireDaoImpl implements CommentaireDao {

	@Autowired
	private SessionFactory sessionFactory;

	public CommentaireDaoImpl() {
		super();
	}

	@Override
	@Transactional
	public boolean addCommentaire(Commentaire commentaire) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(commentaire);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateCommentaire(Commentaire commentaire) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(commentaire);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteCommentaire(Commentaire commentaire) {
		try {
			sessionFactory.getCurrentSession().delete(commentaire);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteCommentaireById(int idCommentaire) {
		try {
			sessionFactory.getCurrentSession().delete(findCommentaireById(idCommentaire));
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Commentaire findCommentaireById(int idCommentaire) {
		try {
			return (Commentaire) sessionFactory.getCurrentSession().get(Commentaire.class, idCommentaire);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	// Cette méthode retourne tous les commentaires
	// concernant une idée
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Commentaire> findCommentairesIdee(Idee idee) {
		try {
			Query query = sessionFactory.getCurrentSession()
					.createQuery("SELECT c FROM Commentaire c WHERE c.idIdee=:iI");
			query.setInteger("iI", idee.getIdIdee());
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
