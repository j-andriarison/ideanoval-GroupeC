package fr.humanbooster.ideanoval.service;

import java.util.List;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Utilisateur;
import fr.humanbooster.ideanoval.business.UtilisateurEtat;

public interface UtilisateurService {
	
	public boolean createUtilisateur(Utilisateur utilisateur);
	public boolean updateUtilisateurEtat(Utilisateur utilisateur,UtilisateurEtat utilisateurEtat);
	public boolean deleteUtilisateur(Utilisateur utilisateur);
	public Utilisateur getUtilisateurByPseudo(String pseudo);
	public Utilisateur getUtilisateurByMail(String mail);
	public List<Idee> getIdeesUtilisateur(Utilisateur utilisateur);
	public List<Commentaire> getCommentairesUtilisateur(Utilisateur utilisateur);
	
}
