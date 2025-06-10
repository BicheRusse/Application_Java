package fsiAdministration.BO;

public class Utilisateur {

    private int idUtilisateur;
    private String loginUtilisateur;
    private String mdpUtilisateur;
    private boolean roleUtilisateur;

    public Utilisateur( int idUtilisateur,String mdpUtilisateur, String loginUtilisateur, boolean roleUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
        this.loginUtilisateur = loginUtilisateur;
        this.idUtilisateur = idUtilisateur;
        this.roleUtilisateur = roleUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }

    public void setMdpUtilisateur(String mdpUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
    }

    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    public void setLoginUtilisateur(String loginUtilisateur) {
        this.loginUtilisateur = loginUtilisateur;
    }

    public boolean isRoleUtilisateur() {return roleUtilisateur;}

    public void setRoleUtilisateur(boolean roleUtilisateur) {this.roleUtilisateur = roleUtilisateur;}

    public Utilisateur() {
    }
}
