package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Utilisateur;

public interface UtilisateurDao {

	// CREATE
	public boolean addUtilisateur(Utilisateur utilisateur);

	// UPDATE
	public boolean updateUtilisateur(Utilisateur utilisateur);

	// DELETE
	public boolean deleteUtilisateur(Utilisateur utilisateur);

	public boolean deleteUtilisateur(int idUtilisateur);

	// SELECT
	public Utilisateur findUtilisateurById(int idUtilisateur);

	public Utilisateur findUtilisateurByPseudo(String pseudo);

	public Utilisateur findUtilisateurByMail(String mail);
	
	public List<Utilisateur> getBrains();

}
