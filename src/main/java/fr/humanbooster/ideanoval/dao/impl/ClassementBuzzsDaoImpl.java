package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.ClassementBuzzs;
import fr.humanbooster.ideanoval.dao.ClassementBuzzsDao;

@Repository
public class ClassementBuzzsDaoImpl implements ClassementBuzzsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public ClassementBuzzsDaoImpl() {
		super();
	}

	public ClassementBuzzsDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addClassementBuzzs(ClassementBuzzs classementBuzzs) {
		Integer id = (int) (sessionFactory.getCurrentSession().save(classementBuzzs));
		if( id > -1 ) {
			classementBuzzs.setIdClassementIdee(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateClassementBuzzs(ClassementBuzzs classementBuzzs) {
		sessionFactory.getCurrentSession().update(classementBuzzs);
		return true;
	}

	@Override
	public boolean deleteClassementBuzzs(ClassementBuzzs classementBuzzs) {
		sessionFactory.openSession().delete(classementBuzzs);
		return true;
	}

}
