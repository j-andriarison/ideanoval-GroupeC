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
import fr.humanbooster.ideanoval.dao.ClassementBrainsDao;
import fr.humanbooster.ideanoval.dao.ClassementBuzzsDao;
import fr.humanbooster.ideanoval.dao.ClassementTopsDao;
import fr.humanbooster.ideanoval.service.ClassementService;

public class ClassementServiceImpl implements ClassementService {

	@Autowired
	private ClassementTopsDao classementTopsDao;

	@Autowired
	private ClassementBuzzsDao classementBuzzsDao;

	@Autowired
	private ClassementBrainsDao classementBrainsDao;

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

	@Override
	public void refreshClassements() {
		// créer classement Tops
		// remplacer classement Tops
		// créer classement Buzzs
		// remplacer classement Buzzs
		// créer classement Brains
		// remplacer classement Brains
	}

	private void createClassementTops() {
		List<LigneClassementIdee> lignesClassementIdee = new ArrayList<>(10);
		// Récupérer les 10 idées les mieux notées
		//
		// Créer les lignes de classement en base

		// 5 votants minimum
		// count(v) From Vote v,Idee i GROUP BY v.idee

		// 1 :  Pourcentage  de  «  Top  »  le  plus  important  parmi
		//  les votes

		// 2 :  Nombre  de  votes  total  le  plus  important

		// 3 :  Date  de  l’idée  (la  plus  récente  l’emporte)

		// FROM Idee i,Vote v WHERE

		ClassementTops classement = new ClassementTops(Date.from(Instant.now()), lignesClassementIdee);

	}

	private void createClassementBuzzs() {
		List<LigneClassementIdee> lignesClassementIdee = new ArrayList<>(10);
		// Récupérer les 10 idées les plus commentées
		//
		// Créer les lignes de classement en base
		// 5 votants minimum

		ClassementBuzzs classement = new ClassementBuzzs(Date.from(Instant.now()), lignesClassementIdee);

	}

	private void createClassementBrains() {
		List<LigneClassementUtilisateur> lignesClassementUtilisateur = new ArrayList<>(10);
		// Récupérer les 10 utilisateurs les plus prolifiques

		ClassementBrains classement = new ClassementBrains(Date.from(Instant.now()), lignesClassementUtilisateur);

	}

}
