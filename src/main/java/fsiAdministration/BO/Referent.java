package fsiAdministration.BO;

import java.util.ArrayList;
import java.util.List;

public class Referent {

    private int idReferent;
    private String nomReferent;
    private String prenomReferent;
    private List<Etudiant> etudiants;

    public Referent(int idReferent, String nomReferent, String prenomReferent) {
        this.idReferent = idReferent;
        this.nomReferent = nomReferent;
        this.prenomReferent = prenomReferent;
        this.etudiants = new ArrayList<>();
    }

    public int getIdReferent() {
        return idReferent;
    }

    public void setIdReferent(int idReferent) {
        this.idReferent = idReferent;
    }

    public String getNomReferent() {
        return nomReferent;
    }

    public void setNomReferent(String nomReferent) {
        this.nomReferent = nomReferent;
    }

    public String getPrenomReferent() {
        return prenomReferent;
    }

    public void setPrenomReferent(String prenomReferent) {
        this.prenomReferent = prenomReferent;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        if (!etudiants.contains(etudiant)) {
            etudiants.add(etudiant);
            etudiant.setReferent(this); // synchronisation de la relation
        }
    }

    public void retirerEtudiant(Etudiant etudiant) {
        if (etudiants.contains(etudiant)) {
            etudiants.remove(etudiant);
            etudiant.setReferent(null); // rompre le lien côté étudiant
        }
    }
}

