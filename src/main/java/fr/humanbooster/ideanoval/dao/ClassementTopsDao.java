package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementTops;

public interface ClassementTopsDao {

	// SELECT
	public ClassementTops getClassementTops();

	// CREATE
	public boolean addClassementTops(ClassementTops classementTops);

	// UPDATE
	public boolean updateClassementTops(ClassementTops classementTops);

	// DELETE
	public boolean deleteClassementTops(ClassementTops classementTops);

}
