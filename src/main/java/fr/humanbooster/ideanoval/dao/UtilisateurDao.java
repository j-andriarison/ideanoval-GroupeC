package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Utilisateur;

public interface UtilisateurDao {
	
	public boolean addUtilisateur(Utilisateur utilisateur);
	public boolean updateUtilisateur(Utilisateur utilisateur);
	public boolean deleteUtilisateur(Utilisateur utilisateur);
	public boolean deleteUtilisateur(int idUtilisateur);
	public Utilisateur findUtilisateurById(int idUtilisateur);
	public List<Idee> findIdeesUtilisateur(Utilisateur utilisateur);
	public List<Commentaire> findCommentairesUtilisateur(Utilisateur utilisateur);

}
