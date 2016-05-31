package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementBrains;

public interface ClassementBrainsDao {

	public ClassementBrains getClassementBrains();
	public boolean addClassementBrains(ClassementBrains classementBrains);
	public void updateClassementBrains(ClassementBrains classementBrains);
	public void deleteClassementBrains(ClassementBrains classementBrains);
	
}
