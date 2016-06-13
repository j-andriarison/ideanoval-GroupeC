package fr.humanbooster.ideanoval.service;

import java.util.List;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.EtatUtilisateur;
import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Utilisateur;

public interface UtilisateurService {
	
	public boolean createUtilisateur(Utilisateur utilisateur);
	public boolean updateEtatUtilisateur(Utilisateur utilisateur,EtatUtilisateur etatUtilisateur);
	public boolean deleteUtilisateur(Utilisateur utilisateur);
	public Utilisateur getUtilisateurByPseudo(String pseudo);
	public Utilisateur getUtilisateurByMail(String mail);
	public List<Idee> getIdeesUtilisateur(Utilisateur utilisateur);
	public List<Commentaire> getCommentairesUtilisateur(Utilisateur utilisateur);
	
}
