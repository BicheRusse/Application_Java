package fsiAdministration.BO;


public class Etudiant {

    private int idEtudiant;
    private String  nomEtudiant;
    private String prenomEtudiant;
    private int idSection;
    private Referent referent;

    public Etudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant) {
        this.idEtudiant = idEtudiant;
        this.nomEtudiant = new String(nomEtudiant);
        this.prenomEtudiant = new String(prenomEtudiant);
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant.get();
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant.set(nomEtudiant);
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant.get();
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant.set(prenomEtudiant);
    }

    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public String nomEtudiant() {
        return nomEtudiant;
    }

    public String prenomEtudiant() {
        return prenomEtudiant;
    }

    public Referent getReferent() {
        return referent;
    }

    public void setReferent(Referent referent) {
        this.referent = referent;
    }
}
