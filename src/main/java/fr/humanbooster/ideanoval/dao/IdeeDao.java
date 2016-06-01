package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Idee;

public interface IdeeDao {

	// CREATE
	public boolean addIdee(Idee idee);

	// UPDATE
	public boolean updateIdee(Idee idee);

	// DELETE
	public boolean deleteIdee(Idee idee);
	public boolean deleteIdeeById(int idIdee);

	// SELECT
	public Idee findIdeeById(int idIdee);
	public List<Idee> findIdeesByIdUtilisateur(int idUtilisateur);

}
