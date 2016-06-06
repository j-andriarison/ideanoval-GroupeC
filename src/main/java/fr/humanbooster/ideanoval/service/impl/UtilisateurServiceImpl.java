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
	 * param�tre : un Utilisateur 
	 * retourne : true si l'utilisateur est cr�e,
	 * false si le pseudo et/ou le mail sont d�j� utilis�s
	 */
	@Override
	public boolean createUtilisateur(Utilisateur utilisateur) {
		boolean mailOk = true;
		boolean pseudoOk = true;
		// on v�rifie si le pseudo et le mail ne sont pas d�j� utilis�s
		// avant de cr�er le nouvel utilisateur
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
	 * param�tres : un Utilisateur, un nouvel UtilisateurEtat retourne true si
	 * la mise � jour a �t� faite
	 */
	@Override
	public boolean updateUtilisateurEtat(Utilisateur utilisateur, UtilisateurEtat utilisateurEtat) {
		utilisateur.setEtatUtilisateur(utilisateurEtat);
		return utilisateurDao.updateUtilisateur(utilisateur);
	}

	/**
	 * param�tre : l'Utilisateur � supprimer 
	 * retourne : true si l'utilisateur
	 * est cr��
	 */
	@Override
	public boolean deleteUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.deleteUtilisateur(utilisateur);
	}

	/**
	 * param�tre : le pseudo de l'utilisateur recherch�
	 * retourne : l'utilisateur du pseudo
	 */
	@Override
	public Utilisateur getUtilisateurByPseudo(String pseudo) {
		return utilisateurDao.findUtilisateurByPseudo(pseudo);
	}

	/**
	 * param�tre : le mail de l'utilisateur recherch�
	 * retourne : l'utilisateur du mail
	 */
	@Override
	public Utilisateur getUtilisateurByMail(String mail) {
		return utilisateurDao.findUtilisateurByMail(mail);
	}

	/**
	 * param�tre : un Utilisateur
	 * retourne : la liste des id�es post�es par cet utilisateur
	 */
	@Override
	public List<Idee> getIdeesUtilisateur(Utilisateur utilisateur) {	
		return ideeDao.findIdeesByIdUtilisateur(utilisateur.getIdUtilisateur());
	}

	/**
	 * param�tre : un Utilisateur
	 * retourne : la liste des commentaires post�s par cet utilisateur
	 */
	@Override
	public List<Commentaire> getCommentairesUtilisateur(Utilisateur utilisateur) {
		return commentaireDao.findCommentairesUtilisateur(utilisateur);
	}

}
