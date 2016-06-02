package fr.humanbooster.ideanoval.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Vote;
import fr.humanbooster.ideanoval.dao.VoteDao;
import fr.humanbooster.ideanoval.service.VoteService;
/**
 * 
 * Cette classe permet d'exploiter l'interface VoteService
 * @author Jean ANDRIANARISON
 *
 */
@Service
public class VoteServiceImpl implements VoteService {
	@Autowired
	private VoteDao voteDao;
	/**
	 * La createVote() permet d'enregister une Vote passé en paramètre.
	 * Elle fait appel au service addVote dans le VoteDao.
	 * @param Objet Vote
	 * @return true si l'enregistrement est en succès
	 */
	@Override
	public boolean createVote(Vote vote) {
		return voteDao.addVote(vote);
	}
	/**
	 * La deleteVote() permet de supprimer une Vote passé en paramètre.
	 * Elle fait appel au service deleteVote(Vote vote) dans le VoteDao.
	 * @param Objet Vote
	 * @return true si la suppression est en succès
	 */
	@Override
	public boolean deleteVote(Vote vote) {
		
		return voteDao.deleteVote(vote);
	}
	/**
	 * La createVote() permet d'enregister une Vote passé en paramètre.
	 * Elle fait appel au service deleteVote(int idVote) dans le VoteDao.
	 * @param Int idVote
	 * @return true si la suppression est en succès
	 */
	@Override
	public boolean deleteVote(int idVote) {
		return voteDao.deleteVote(idVote);
	}

	/**
	 * La getAllVoteByIdee() permet de lister Vote passé en paramètre.
	 * Elle fait appel au service getAllVoteByIdee() dans le VoteDao.
	 * @param Objet Idee
	 * @return List<Vote>
	 */
	@Override
	public List<Vote> getAllVoteByIdee(Idee idee) {
		List<Vote> votes = (List<Vote>)voteDao.getAllVoteByIdee(idee);
		return votes;
	}

}
