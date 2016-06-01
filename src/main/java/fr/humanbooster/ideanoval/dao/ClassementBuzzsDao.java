package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementBuzzs;

public interface ClassementBuzzsDao {

	// SELECT
	public ClassementBuzzs getClassementBuzzs();

	// CREATE
	public boolean addClassementBuzzs(ClassementBuzzs classementBuzzs);

	// UPDATE
	public void updateClassementBuzzs(ClassementBuzzs classementBuzzs);

	// DELETE
	public void deleteClassementBuzzs(ClassementBuzzs classementBuzzs);

}
