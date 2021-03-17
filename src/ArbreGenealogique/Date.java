package ArbreGenealogique;

import java.util.Scanner;

public class Date {
	private int jour;
	private int mois;
	private int annee;

	/**
	 * Constructeur vide
	 * 
	 */
	public Date() {
		System.out.println("jour de naissance?");
		Scanner sc = new Scanner(System.in);
		this.jour = sc.nextInt();
		System.out.println("mois de naissance?");
		this.mois = sc.nextInt();
		System.out.println("annee de naissance?");
		this.annee = sc.nextInt();
	}

	/**
	 * Constructeur
	 * 
	 */
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	/*
	 * toString
	 */
	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}

	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public boolean comparateurDate(Date date) {
		boolean inf; //vrai si date1 < date2
		inf = true;
		if(this.getAnnee() > date.getAnnee()) {
			inf = false;
		} else {
			if(this.getAnnee() == date.getAnnee()) {
				if(this.getMois() > date.getMois()) {
					inf = false;
				} else {
					if(this.getMois() == date.getMois()) {
						if (this.getJour() > date.getJour()){
							inf = false;
						}
					}
				}
			}
		}
		return (inf);
	}


}
