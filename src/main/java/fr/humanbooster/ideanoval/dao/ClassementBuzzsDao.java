package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementBuzzs;

public interface ClassementBuzzsDao {

	// SELECT
	public ClassementBuzzs getClassementBuzzs();

	// CREATE
	public boolean addClassementBuzzs(ClassementBuzzs classementBuzzs);

	// UPDATE
	public boolean updateClassementBuzzs(ClassementBuzzs classementBuzzs);

	// DELETE
	public boolean deleteClassementBuzzs(ClassementBuzzs classementBuzzs);

}
