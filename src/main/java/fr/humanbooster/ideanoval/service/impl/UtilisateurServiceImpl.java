package fr.humanbooster.ideanoval.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Utilisateur;
import fr.humanbooster.ideanoval.business.UtilisateurEtat;
import fr.humanbooster.ideanoval.dao.CommentaireDao;
import fr.humanbooster.ideanoval.dao.IdeeDao;
import fr.humanbooster.ideanoval.dao.UtilisateurDao;
import fr.humanbooster.ideanoval.service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurDao utilisateurDao;
	@Autowired
	private IdeeDao ideeDao;
	@Autowired
	private CommentaireDao commentaireDao;

	/**
	 * paramètre : un Utilisateur 
	 * retourne : true si l'utilisateur est crée,
	 * false si le pseudo et/ou le mail sont déjà utilisés
	 */
	@Override
	public boolean createUtilisateur(Utilisateur utilisateur) {
		boolean mailOk = true;
		boolean pseudoOk = true;
		// on vérifie si le pseudo et le mail ne sont pas déjà utilisés
		// avant de créer le nouvel utilisateur
		if (utilisateurDao.findUtilisateurByPseudo(utilisateur.getPseudo()) != null)
			pseudoOk = false;
		if (utilisateurDao.findUtilisateurByMail(utilisateur.getEmail()) != null)
			mailOk = false;
		if (pseudoOk && mailOk) {
			utilisateurDao.addUtilisateur(utilisateur);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * paramètres : un Utilisateur, un nouvel UtilisateurEtat retourne true si
	 * la mise à jour a été faite
	 */
	@Override
	public boolean updateUtilisateurEtat(Utilisateur utilisateur, UtilisateurEtat utilisateurEtat) {
		utilisateur.setEtatUtilisateur(utilisateurEtat);
		return utilisateurDao.updateUtilisateur(utilisateur);
	}

	/**
	 * paramètre : l'Utilisateur à supprimer 
	 * retourne : true si l'utilisateur
	 * est créé
	 */
	@Override
	public boolean deleteUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.deleteUtilisateur(utilisateur);
	}

	/**
	 * paramètre : le pseudo de l'utilisateur recherché
	 * retourne : l'utilisateur du pseudo
	 */
	@Override
	public Utilisateur getUtilisateurByPseudo(String pseudo) {
		return utilisateurDao.findUtilisateurByPseudo(pseudo);
	}

	/**
	 * paramètre : le mail de l'utilisateur recherché
	 * retourne : l'utilisateur du mail
	 */
	@Override
	public Utilisateur getUtilisateurByMail(String mail) {
		return utilisateurDao.findUtilisateurByMail(mail);
	}

	/**
	 * paramètre : un Utilisateur
	 * retourne : la liste des idées postées par cet utilisateur
	 */
	@Override
	public List<Idee> getIdeesUtilisateur(Utilisateur utilisateur) {	
		return ideeDao.findIdeesByIdUtilisateur(utilisateur.getIdUtilisateur());
	}

	/**
	 * paramètre : un Utilisateur
	 * retourne : la liste des commentaires postés par cet utilisateur
	 */
	@Override
	public List<Commentaire> getCommentairesUtilisateur(Utilisateur utilisateur) {
		return commentaireDao.findCommentairesUtilisateur(utilisateur);
	}

}
