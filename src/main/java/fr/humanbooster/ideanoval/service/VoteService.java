package fr.humanbooster.ideanoval.service;

import java.util.List;

import fr.humanbooster.ideanoval.business.Idee;
import fr.humanbooster.ideanoval.business.Vote;

public interface VoteService {
	// CREATE
	public boolean createVote(Vote vote);

	// DELETE
	public boolean deleteVote(Vote vote);

	public boolean deleteVote(int idVote);

	// SELECT
	public List<Vote> getAllVoteByIdee(Idee idee);
}
