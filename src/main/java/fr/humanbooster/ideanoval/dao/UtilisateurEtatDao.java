package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.UtilisateurEtat;

public interface UtilisateurEtatDao {

	public boolean addUtilisateurEtat(UtilisateurEtat utilisateurEtat);
	public boolean updateUtilisateurEtat(UtilisateurEtat utilisateurEtat);
	public boolean deleteUtilisateurEtat(UtilisateurEtat utilisateurEtat);
	public List<UtilisateurEtat> getAllEtats();
}
