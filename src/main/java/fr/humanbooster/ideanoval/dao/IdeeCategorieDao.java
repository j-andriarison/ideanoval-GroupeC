package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.IdeeCategorie;

public interface IdeeCategorieDao {

	// CREATE
	public boolean addIdeeCategorie(IdeeCategorie ideeCategorie);

	// UPDATE
	public boolean updateIdeeCategorie(IdeeCategorie ideeCategorie);

	// DELETE
	public boolean deleteIdeeCategorie(IdeeCategorie ideeCategorie);

	// SELECT
	public IdeeCategorie findIdeeCategorieById(int idIdeeCategorie);
	// public List<IdeeCategorie> getAllIdeeCategorie();

}
