package fr.humanbooster.ideanoval.service.impl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.humanbooster.ideanoval.business.ClassementBrains;
import fr.humanbooster.ideanoval.business.ClassementBuzzs;
import fr.humanbooster.ideanoval.business.ClassementTops;
import fr.humanbooster.ideanoval.business.LigneClassementIdee;
import fr.humanbooster.ideanoval.business.LigneClassementUtilisateur;
import fr.humanbooster.ideanoval.business.Utilisateur;
import fr.humanbooster.ideanoval.dao.ClassementBrainsDao;
import fr.humanbooster.ideanoval.dao.ClassementBuzzsDao;
import fr.humanbooster.ideanoval.dao.ClassementTopsDao;
import fr.humanbooster.ideanoval.dao.LigneClassementIdeeDao;
import fr.humanbooster.ideanoval.dao.LigneClassementUtilisateurDao;
import fr.humanbooster.ideanoval.service.ClassementService;
import fr.humanbooster.ideanoval.service.UtilisateurService;

/**
 * Service permettant de g�rer les classements.
 * 13 juin 2016 18:34:35
 * 
 * @author Frederic Moussiegt
 */
public class ClassementServiceImpl implements ClassementService {

	@Autowired
	private ClassementTopsDao classementTopsDao;

	@Autowired
	private ClassementBuzzsDao classementBuzzsDao;

	@Autowired
	private ClassementBrainsDao classementBrainsDao;

	@Autowired
	private UtilisateurService utilisateurService;
	
	@Autowired
	private LigneClassementUtilisateurDao ligneClassementUtilisateurDao;

	// Constructeurs
	public ClassementServiceImpl() {
		super();
	}

	// Getters/setters
	@Override
	public ClassementTops getClassementTops() {
		return classementTopsDao.getClassementTops();
	}

	@Override
	public ClassementBuzzs getClassementBuzzs() {
		return classementBuzzsDao.getClassementBuzzs();
	}

	@Override
	public ClassementBrains getClassementBrains() {
		return classementBrainsDao.getClassementBrains();
	}

	// M�thodes

	/**
	 * M�thode permettant de mettre � jour les classements. Elle est appel�e toutes les 24h.
	 */
	@Override
	public void refreshClassements() {
		// cr�er classement Tops
		createClassementTops();
		// remplacer classement Tops

		// cr�er classement Buzzs
		createClassementBuzzs();
		// remplacer classement Buzzs

		// cr�er classement Brains
		createClassementBrains();
		// remplacer classement Brains

	}

	private void createClassementTops() {
		List<LigneClassementIdee> lignesClassementIdee = new ArrayList<>(10);
		// R�cup�rer les 10 id�es les mieux not�es
		//
		// Cr�er les lignes de classement en base

		// 5 votants minimum
		// count(v) From Vote v,Idee i GROUP BY v.idee

		// 1�: �Pourcentage �de �� �Top �� �le �plus �important �parmi
		// �les�votes

		// 2�: �Nombre �de �votes �total �le �plus �important

		// 3�: �Date �de �l�id�e �(la �plus �r�cente �l�emporte)

		// FROM Idee i,Vote v WHERE

		ClassementTops classement = new ClassementTops(Date.from(Instant.now()), lignesClassementIdee);

	}

	private void createClassementBuzzs() {
		List<LigneClassementIdee> lignesClassementIdee = new ArrayList<>(10);
		// R�cup�rer les 10 id�es les plus comment�es
		//
		// Cr�er les lignes de classement en base
		// 5 votants minimum

		ClassementBuzzs classement = new ClassementBuzzs(Date.from(Instant.now()), lignesClassementIdee);

	}

	void createClassementBrains() {
		// R�cup�rer les 10 utilisateurs les plus prolifiques
		// Gestion des �galit�s?
		List<Utilisateur> brains = utilisateurService.getBrains();
		List<LigneClassementUtilisateur> lignes = new ArrayList<>();

		// R�cup�rer l'ancien classement et les anciennes lignes de classement
		ClassementBrains classementPrecedent = classementBrainsDao.getClassementBrains();
		List<LigneClassementUtilisateur> lignesPrecedentes = ligneClassementUtilisateurDao.getAllLignesClassementUtilisateur();
		
		//	Cr�er le nouveau classement
		ClassementBrains classement = new ClassementBrains(Date.from(Instant.now()), lignes);
		
		// Cr�er les lignes de classement
		for (int i = 0; i < brains.size(); i++) {
			lignes.add(new LigneClassementUtilisateur(i, classement, brains.get(i)));
		}
		
		//	Sauvegarder le nouveau classement
		//	TODO: faut-il cr�er les lignes � part ou sont-elles cr��es directement?
		classementBrainsDao.updateClassementBrains(classement);
		
		//	Supprimer l'ancien classement
		classementBrainsDao.deleteClassementBrains(classementPrecedent);
		
		//	TODO: reste-t-il les lignes de classements?
	}

}
