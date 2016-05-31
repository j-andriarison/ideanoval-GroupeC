package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.humanbooster.ideanoval.business.ClassementTops;
import fr.humanbooster.ideanoval.dao.ClassementTopsDao;

@Repository
public class ClassementTopsDaoImpl implements ClassementTopsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public ClassementTopsDaoImpl() {
		super();
	}

	public ClassementTopsDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addClassementTops(ClassementTops classementTops) {
		Integer id = (int) (sessionFactory.getCurrentSession().save(classementTops));
		if( id > -1 ) {
			classementTops.setIdClassementIdee(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateClassementTops(ClassementTops classementTops) {
		sessionFactory.getCurrentSession().update(classementTops);
		return true;
	}

	@Override
	public boolean deleteClassementTops(ClassementTops classementTops) {
		sessionFactory.openSession().delete(classementTops);
		return true;
	}

}
