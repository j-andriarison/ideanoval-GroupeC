package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementTops;

public interface ClassementTopsDao {

	public ClassementTops getClassementTops();
	public boolean addClassementTops(ClassementTops classementTops);
	public void updateClassementTops(ClassementTops classementTops);
	public void deleteClassementTops(ClassementTops classementTops);
	
}
