package test_jdbc2;

public class Dresseur {
	// création d'attribut qui sont spécifiques à tout les dresseurs qui seront
	// crées.
	private int idDresseur;
	private int age;
	private int nrbjavamon;
	private String nomDresseur;
	private String prenomDresseur;

	// création du constructeur avec les attributs qui sont communs à tout les
	// dresseurs que l'ont va créer dans le main
	public Dresseur(int idDresseur, int age, int nrbjavamon, String nomDresseur, String prenomDresseur) {
		this.age = age;
		this.nrbjavamon = nrbjavamon;
		this.nomDresseur = nomDresseur;
		this.prenomDresseur = prenomDresseur;
		this.idDresseur = idDresseur;
	}

	// création des getters et des setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNrbjavamon() {
		return nrbjavamon;
	}

	public void setNrbjavamon(int nrbjavamon) {
		this.nrbjavamon = nrbjavamon;
	}

	public String getNomDresseur() {
		return nomDresseur;
	}

	public void setNomDresseur(String nomDresseur) {
		this.nomDresseur = nomDresseur;
	}

	public String getPrenomDresseur() {
		return prenomDresseur;
	}

	public void setPrenomDresseur(String prenomDresseur) {
		this.prenomDresseur = prenomDresseur;
	}

	public int getIdDresseur() {
		return idDresseur;
	}

	public void setIdDresseur(int idDresseur) {
		this.idDresseur = idDresseur;
	}

}
