package fr.humanbooster.ideanoval.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Vote;
import fr.humanbooster.ideanoval.dao.VoteDao;
import fr.humanbooster.ideanoval.service.VoteService;

@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteDao voteDao;
	
	/**
	 * param�tre : un Vote
	 * retourne : true si le vote a �t� cr��
	 */
	@Override
	@Transactional
	public boolean createVote(Vote vote) {
		return voteDao.addVote(vote);
	}

	/**
	 * param�tre : un Vote
	 * retourne : true si le vote a �t� supprim�
	 */
	@Override
	@Transactional
	public boolean deleteVote(Vote vote) {
		return voteDao.deleteVote(vote);
	}

	/**
	 * param�tre : une Idee
	 * retourne : la liste des votes concernant cette id�e
	 */
	@Override
	@Transactional
	public List<Vote> getVotesIdee(Idee idee) {
		return voteDao.getAllVoteByIdee(idee);
	}

}
