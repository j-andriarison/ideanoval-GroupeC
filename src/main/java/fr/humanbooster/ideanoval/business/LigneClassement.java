package fr.humanbooster.ideanoval.business;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class LigneClassement {
	private int position;

	public LigneClassement() {
		super();
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public LigneClassement(int position) {
		super();
		this.position = position;
	}

}
