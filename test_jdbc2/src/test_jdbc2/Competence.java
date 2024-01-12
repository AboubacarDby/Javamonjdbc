package test_jdbc2;

public class Competence {
	// création des attributs qui va être utiliser pour la compétence du javamon
	// dans le main et pour l'éxecution
	private int idCompetence;
	private String nomAttaque;
	private int nrbDegats;

//	création du constructeur de la classe compétence 
	public Competence(int idCompetence, String nomAttaque, int nrbDegats) {
		this.idCompetence = idCompetence;
		this.nomAttaque = nomAttaque;
		this.nrbDegats = nrbDegats;
	}

//	création des getters et des setters
	public int getIdCompetence() {
		return idCompetence;
	}

	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}

	public String getNomAttaque() {
		return nomAttaque;
	}

	public void setNomAttaque(String nomAttaque) {
		this.nomAttaque = nomAttaque;
	}

	public int getNrbDegats() {
		return nrbDegats;
	}

	public void setNrbDegats(int nrbDegats) {
		this.nrbDegats = nrbDegats;
	}

}
