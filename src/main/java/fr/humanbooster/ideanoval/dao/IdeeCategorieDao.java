package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.IdeeCategorie;

public interface IdeeCategorieDao {
	
	public boolean addIdeeCategorie(IdeeCategorie ideeCategorie);
	public boolean updateIdeeCategorie(IdeeCategorie ideeCategorie);
	public boolean deleteIdeeCategorie(IdeeCategorie ideeCategorie);
	public IdeeCategorie findIdeeCategorieById(int idIdeeCategorie);
	
}
