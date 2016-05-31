package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.ClassementBrains;
import fr.humanbooster.ideanoval.dao.ClassementBrainsDao;

@Repository
public class ClassementBrainsDaoImpl implements ClassementBrainsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public ClassementBrainsDaoImpl() {
		super();
	}

	public ClassementBrainsDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addClassementBrains(ClassementBrains classementBrains) {
		Integer id = (int) (sessionFactory.getCurrentSession().save(classementBrains));
		if( id > -1 ) {
			classementBrains.setIdClassementBrains(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateClassementBrains(ClassementBrains classementBrains) {
		sessionFactory.getCurrentSession().update(classementBrains);
		return true;
	}

	@Override
	public boolean deleteClassementBrains(ClassementBrains classementBrains) {
		sessionFactory.openSession().delete(classementBrains);
		return true;
	}

}
