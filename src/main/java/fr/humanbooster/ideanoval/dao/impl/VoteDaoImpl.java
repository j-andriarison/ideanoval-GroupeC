package fr.humanbooster.ideanoval.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Vote;
import fr.humanbooster.ideanoval.dao.VoteDao;

@Repository
public class VoteDaoImpl implements VoteDao {

	@Autowired
	private SessionFactory sessionFactory;

	public VoteDaoImpl() {
		super();
	}

	@Override
	@Transactional
	public boolean addVote(Vote vote) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(vote);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteVote(Vote vote) {
		try {
			sessionFactory.getCurrentSession().delete(vote);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteVote(int idVote) {
		try {
			sessionFactory.getCurrentSession().delete(idVote);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Vote> getAllVoteByIdee(Idee idee) {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Vote.class).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}

	}

}
