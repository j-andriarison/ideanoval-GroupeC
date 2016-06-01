package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.UtilisateurEtat;

public interface UtilisateurEtatDao {

	// CREATE
	public boolean addUtilisateurEtat(UtilisateurEtat utilisateurEtat);

	// UPDATE
	public boolean updateUtilisateurEtat(UtilisateurEtat utilisateurEtat);

	// DELETE
	public boolean deleteUtilisateurEtat(UtilisateurEtat utilisateurEtat);

	// SELECT
	public List<UtilisateurEtat> getAllEtats();
}
