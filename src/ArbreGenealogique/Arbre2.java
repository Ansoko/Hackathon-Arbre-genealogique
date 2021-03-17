package ArbreGenealogique;

public class Arbre2 {
	private Individu r;
	private Arbre2 fg;
	private Arbre2 fd;
	
	public Arbre2 personneExiste(Individu individu){
		Arbre2 arbre = new Arbre2();
		if(RACINE() == individu){
			arbre.COMPOSER(RACINE(), FG(), FD());
		}
		else if(!arbre.VIDE()){

		}
		else if(!VIDE()){
			arbre = FG().personneExiste(individu);
			
			if(arbre.VIDE()){
				arbre = FD().personneExiste(individu);
			}
		}
		
		return arbre;
	}


	/*
	 * Constructeur, primitive CREER
	 */
	public Arbre2() {
		r = null;
	}

	/*
	 * VIDE
	 */
	Boolean VIDE() {
		return (this.r == null);
	}

	/*
	 * FG
	 */
	Arbre2 FG() {
		return (this.fg);
	}

	/*
	 * FD
	 */
	Arbre2 FD() {
		return (this.fd);
	}

	/*
	 * RACINE
	 */
	Individu RACINE() {
		return this.r;
	}

	/*
	 * COMPOSER
	 */
	void COMPOSER(Individu pr, Arbre2 pg, Arbre2 pd) {
		this.r = pr;
		this.fg = pg;
		this.fd = pd;
	}

	/*
	 * Afiichage de l'arbre d'apres un parcours Préfixé (profondeur d'abord)
	 */
	public void affichage() {
		if(!VIDE()) {
			System.out.println(RACINE().getNom() +" "+ RACINE().getPrenom());
			FG().affichage();
			FD().affichage();
		}
	}

	// autres méthodes
	boolean FEUILLE() {
		return (this.fg.VIDE() && this.fd.VIDE()); // a utiliser uniquement si on est sur que l'arbre n'est pas vide
	}

	/**
	 * Clone l'arbre
	 * 
	 * @param a L'arbre à cloner
	 */
	public void cloner(Arbre2 a) {
		this.r = a.r;
		this.fg = a.fg;
		this.fd = a.fd;
	}
}



