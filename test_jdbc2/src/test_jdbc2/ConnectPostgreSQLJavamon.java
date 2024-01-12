package test_jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectPostgreSQLJavamon {

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
				ResultSet res = stmt.executeQuery("SELECT * dresseur");
				res.next();
				// étape 4: exécuter la requête
				while (res.next()) {

					System.out.println(res.getInt(1) + " " + res.getInt(2) + " " + res.getString(3) + " "
							+ res.getString(4) + " " + res.getInt(5));

				}

				// étape 5: fermez l'objet de connexion
				conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
