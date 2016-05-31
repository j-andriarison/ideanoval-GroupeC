package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.UtilisateurRole;

public interface UtilisateurRoleDao {
	// INSERT
	public boolean addUtilisateurRole(UtilisateurRole utilisateurRole);

	// SELECT
	public List<UtilisateurRole> findAll();
}
