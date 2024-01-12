package test_jdbc2;

public class Javamon {
	// création d'attribut qui sont spécifiques à tout les Javamon qui seront crées.

	private int idJavamon;
	private String cri;
	private int ptDeVie;
	private int scoreArmure;
	private String nomJavamon;
	private Competence competenceBase;
	private Competence competenceSpe;

	// création du constructeur qui correspond aux attributs que tout les
	// javamons vont posséder.
	public Javamon(int idJavamon, String cri, int ptDeVie, int scoreArmure, String nomJavamon,
			Competence competenceBase, Competence competenceSpe) {
		super();
		this.idJavamon = idJavamon;
		this.cri = cri;
		this.ptDeVie = ptDeVie;
		this.scoreArmure = scoreArmure;
		this.nomJavamon = nomJavamon;
		this.competenceBase = competenceBase;
		this.competenceSpe = competenceSpe;

	}

	// initialisation des getters et des setters des attributs crées avant
	public int getIdJavamon() {
		return idJavamon;
	}

	public void setIdJavamon(int idJavamon) {
		this.idJavamon = idJavamon;
	}

	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}

	public int getPtDeVie() {
		return ptDeVie;
	}

	public void setPtDeVie(int ptDeVie) {
		this.ptDeVie = ptDeVie;
	}

	public int getScoreArmure() {
		return scoreArmure;
	}

	public void setScoreArmure(int scoreArmure) {
		this.scoreArmure = scoreArmure;
	}

	public String getNomJavamon() {
		return nomJavamon;
	}

	public void setNomJavamon(String nomJavamon) {
		this.nomJavamon = nomJavamon;
	}

	public Competence competenceBase() {
		return competenceBase;
	}

	public void setIdCompetenceBase(Competence competenceBase) {
		this.competenceBase = competenceBase;
	}

	public Competence getCompetenceSpe() {
		return competenceSpe;
	}

	public void setCompetenceSpe(Competence competenceSpe) {
		this.competenceSpe = competenceSpe;
	}

}
