package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementBrains;

public interface ClassementBrainsDao {

	//	SELECT
	public ClassementBrains getClassementBrains();

	//	CREATE
	public boolean addClassementBrains(ClassementBrains classementBrains);

	//	UPDATE
	public boolean updateClassementBrains(ClassementBrains classementBrains);

	//	DELETE
	public boolean deleteClassementBrains(ClassementBrains classementBrains);

}
