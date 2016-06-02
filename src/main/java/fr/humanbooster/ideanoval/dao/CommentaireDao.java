package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Utilisateur;

public interface CommentaireDao {

	// CREATE
	public boolean addCommentaire(Commentaire commentaire);

	// UPDATE
	public boolean updateCommentaire(Commentaire commentaire);

	// DELETE
	public boolean deleteCommentaire(Commentaire commentaire);
	public boolean deleteCommentaireById(int idCommentaire);

	// SELECT
	public Commentaire findCommentaireById(int idCommentaire);
	public List<Commentaire> findCommentairesIdee(Idee idee);
	public List<Commentaire> findCommentairesUtilisateur(Utilisateur utilisateur);

}
