package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementBrains;

public interface ClassementBrainsDao {

	//	SELECT
	public ClassementBrains getClassementBrains();

	//	CREATE
	public boolean addClassementBrains(ClassementBrains classementBrains);

	//	UPDATE
	public void updateClassementBrains(ClassementBrains classementBrains);

	//	DELETE
	public void deleteClassementBrains(ClassementBrains classementBrains);

}
