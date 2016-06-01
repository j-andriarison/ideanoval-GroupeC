package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Idee;
//import fr.humanbooster.ideanoval.business.Utilisateur;
import fr.humanbooster.ideanoval.business.Vote;

public interface VoteDao {
	// CREATE
	public boolean addVote(Vote vote);

	// DELETE
	public boolean deleteVote(Vote vote);

	public boolean deleteVote(int idVote);

	// SELECT
	public List<Vote> getAllVoteByIdee(Idee idee);
	// public List<Vote> getAllVoteByUser(Utilisateur utilisateur);
}
