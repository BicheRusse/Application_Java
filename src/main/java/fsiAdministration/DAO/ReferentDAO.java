package fsiAdministration.DAO;

import fsiAdministration.BO.Referent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReferentDAO {

    private Connection connection;

    public ReferentDAO() {
        this.connection = Connexion.getConnexion(); // Connexion.getConnexion() doit retourner une instance JDBC valide
    }

    public List<Referent> findAll() {
        List<Referent> referents = new ArrayList<>();

        String query = "SELECT id_referent, nom_referent, prenom_referent FROM referent";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id_referent");
                String nom = rs.getString("nom_referent");
                String prenom = rs.getString("prenom_referent");

                Referent referent = new Referent(id, nom, prenom);
                referents.add(referent);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return referents;
    }
}
