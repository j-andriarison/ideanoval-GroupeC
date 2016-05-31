package fr.humanbooster.ideanoval.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional(readOnly=true)
	@Override
	public ClassementTops getClassementTops() {
		return (ClassementTops) sessionFactory.getCurrentSession().createQuery("from ChoixPossible LIMIT 1").uniqueResult();
	}

	@Transactional
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

	@Transactional
	@Override
	public void updateClassementTops(ClassementTops classementTops) {
		sessionFactory.getCurrentSession().update(classementTops);
	}

	@Transactional
	@Override
	public void deleteClassementTops(ClassementTops classementTops) {
		sessionFactory.openSession().delete(classementTops);
	}

}
