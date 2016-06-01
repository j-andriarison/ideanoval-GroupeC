package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementTops;

public interface ClassementTopsDao {

	// SELECT
	public ClassementTops getClassementTops();

	// CREATE
	public boolean addClassementTops(ClassementTops classementTops);

	// UPDATE
	public void updateClassementTops(ClassementTops classementTops);

	// DELETE
	public void deleteClassementTops(ClassementTops classementTops);

}
