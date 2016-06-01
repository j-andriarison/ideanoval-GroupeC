package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.Utilisateur;

public interface UtilisateurDao {
	
	public boolean addUtilisateur(Utilisateur utilisateur);
	public boolean updateUtilisateur(Utilisateur utilisateur);
	public boolean deleteUtilisateur(Utilisateur utilisateur);
	public boolean deleteUtilisateur(int idUtilisateur);
	public Utilisateur findUtilisateurById(int idUtilisateur);
	public Utilisateur findUtilisateurByPseudo(String pseudo);
	public Utilisateur findUtilisateurByMail(String mail);

}
