package fr.humanbooster.ideanoval.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligneclassementidee")
public class LigneClassementIdee extends LigneClassement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLigneClassementIdee;
	
	@ManyToOne
	@JoinColumn(name="classementidee")
	private ClassementIdee classementIdee;
	
	
	private Idee idee;

	public LigneClassementIdee() {

	}

	public Idee getIdee() {
		return idee;
	}

	public void setIdee(Idee idee) {
		this.idee = idee;
	}

	public int getIdLigneClassementIdee() {
		return idLigneClassementIdee;
	}

	public void setIdLigneClassementIdee(int idLigneClassementIdee) {
		this.idLigneClassementIdee = idLigneClassementIdee;
	}

	public LigneClassementIdee(int position, ClassementIdee classementIdee, Idee idee) {
		super(position);
		this.classementIdee = classementIdee;
		this.idee = idee;
	}

}
