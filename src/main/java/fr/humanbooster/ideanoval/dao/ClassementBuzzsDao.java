package fr.humanbooster.ideanoval.dao;

import fr.humanbooster.ideanoval.business.ClassementBuzzs;

public interface ClassementBuzzsDao {

	public ClassementBuzzs getClassementBuzzs();
	public boolean addClassementBuzzs(ClassementBuzzs classementBuzzs);
	public void updateClassementBuzzs(ClassementBuzzs classementBuzzs);
	public void deleteClassementBuzzs(ClassementBuzzs classementBuzzs);
	
}
