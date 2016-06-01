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
	/**
	 * Constructueur de la classe UtilisateurRoleDaoImpl qui initialise la session Factory
	 * @param sessionFactory
	 */
	public UtilisateurRoleDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	/**
	 * La m�thode addUtilisateurRole() permet d'ajouter un r�le de l'utilisateur pass� en param�tre
	 * @param Objet UtilisateurRole
	 * @return true si l'UtilisateurRole est ajout� dans la table en succ�s
	 */
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
	/**
	 * La m�thode updateUtilisateurRole() permet de mettre � jour un r�le de l'utilisateur pass� en param�tre
	 * @param Objet UtilisateurRole
	 * @return true si la mise � jour est en succ�s
	 */
	@Override
	@Transactional
	public boolean updateUtilisateurRole(UtilisateurRole utilisateurRole) {
		sessionFactory.getCurrentSession().update(utilisateurRole);
		return true;
	}
/**
 * La m�thode deleteUtilisateurRole() permet de supprimer un r�le de l'utilisateur pass� en param�tre
 * @param Objet utilisateurRole
 * @return true si la suppression est en succ�s
 */
	@Override
	@Transactional
	public boolean deleteUtilisateurRole(UtilisateurRole utilisateurRole) {
		sessionFactory.openSession().delete(utilisateurRole);
		return true;
	}
	/**
	 * Cette m�thode permet de r�cuperer la liste de r�le des utilisateurs
	 * @return List<UtilisateurRole>
	 */
	@Override
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<UtilisateurRole> getAllRole() {
		return sessionFactory.getCurrentSession().createQuery("from UtilisateurRole").list();
			}
}
