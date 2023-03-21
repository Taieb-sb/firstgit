package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CandidatRepository {
    public ResultSet getCandidat(Connexion conn){

        Statement stmt = null;
        ResultSet resultat = null;
        try {
            while (resultat.next()) {
                System.out.println("numero : " + resultat.getInt("a_code") + " "
                        + "Loyer : " + resultat.getInt("a_Loyer") + " "
                        + "Superficie : " + resultat.getInt("a_superf" + " ")
                );
            }
        }catch (SQLException e){

        }
        return resultat;
    }
}
