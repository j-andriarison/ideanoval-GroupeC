package fr.humanbooster.ideanoval.service;

import java.util.List;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Vote;

public interface VoteService {

	public boolean createVote(Vote vote);

	public boolean deleteVote(Vote vote);

	public List<Vote> getVotesIdee(Idee idee);
}
