package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.UtilisateurRole;
import fr.humanbooster.ideanoval.dao.UtilisateurRoleDao;

@Repository
public class UtilisateurRoleDaoImpl implements UtilisateurRoleDao {
	@Autowired
	private SessionFactory sessionFactory;

	public UtilisateurRoleDaoImpl() {
		
	}

	public UtilisateurRoleDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public boolean addUtilisateurRole(UtilisateurRole utilisateurRole) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(utilisateurRole);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<UtilisateurRole> findAll() {

		return sessionFactory.getCurrentSession().createQuery("from UtilisateurRole").list();
	}
}
