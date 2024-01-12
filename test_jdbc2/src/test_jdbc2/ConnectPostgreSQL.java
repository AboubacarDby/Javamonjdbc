package test_jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectPostgreSQL {

	public static void main(String[] args) {
		{
			try {
				// étape 1: charger la classe de driver
				Class.forName("org.postgresql.Driver");
				// étape 2: créer l'objet de connexion
				Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5520/medxx", "medxx",
						"medxx");
				// étape 3: créer l'objet statement
				Statement stmt = conn.createStatement();
				// création de la requête et les éléments que l'on veut aller chercher
//				ResultSet res = stmt.executeQuery(
//						"SELECT iddresseur, age, nrbjavamon, nomdresseur, prenomdresseur FROM dresseur WHERE dresseur.iddresseur = 1");
//				Scanner saisie = new Scanner(System.in);
//				res.next();
//				Dresseur dresseur = new Dresseur(res.getInt(1), res.getInt(2), res.getInt(3), res.getString(4),
//						res.getString(5));
//				int choixDresseur;
				// étape 4: exécuter la requête
//				while (res.next()) {
//
//				}
				// Menu qui donne le choix de javamon au dresseur (javamon de niveau de 1)
//				do {
//					System.out.println("Quelle javamon (niveau 1) voulez-vous choisir : ");
//					System.out.println("\t1 - Gniarami \t2 - Canartifice \t3 - Tranchtout");
//					choixDresseur = saisie.nextInt();
//				} while (choixDresseur > 3 || choixDresseur < 1);

// 				le dresseur sélectionne un javamon, il est donc ensuite adopté par le
// 				dresseur et devient membre de son équipe

//				if (choixDresseur == 1) {
//					System.out.println("Le dresseur choisis Gniarami");
//				} else if (choixDresseur == 2) {
//					System.out.println("Le dresseur choisis Canartifice");
//				} else {
//					System.out.println("Le dresseur choisis Tranchtout");
//				}
//				String query = "INSERT INTO liaison_jvm_drs VALUES (" + choixDresseur + ", 1, 1, '1_" + choixDresseur
//						+ "')";
//				stmt.executeUpdate(query);
//				saisie.close();

				String query1 = "INSERT INTO liaison_jvm_drs.niveaujavamon VALUES 2 WHERE liaison_jvm_drs.idliaison_jvm_drs = '1_2' ";
				stmt.executeLargeUpdate(query1);
				// étape 5: fermez l'objet de connexion
				conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	// création d'une méthode pour la création de chaque javamon que l'on va créer
	static Javamon initJavamon(int idjavamon, String cri, int scorearmure, String javamon, Competence competenceBase,
			Competence competenceSpe) {

		return null;

	}

}
