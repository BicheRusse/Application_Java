package fsiAdministration.controllers;

import fsiAdministration.BO.Etudiant;
import fsiAdministration.DAO.EtudiantDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ListeEtudiantController extends MenuController implements Initializable {

    @FXML
    private TableView<Etudiant> tvEtudiants;

    @FXML
    private TableColumn<Etudiant, String> tcNomEtud;

    @FXML
    private TableColumn<Etudiant, String> tcPrenomEtud;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialisation des colonnes
        tcNomEtud.setCellValueFactory(cellData -> cellData.getValue().nomEtudiantProperty());
        tcPrenomEtud.setCellValueFactory(cellData -> cellData.getValue().prenomEtudiantProperty());

        // Récupération des données
        EtudiantDAO etudDAO = new EtudiantDAO();
        List<Etudiant> mesEtud = etudDAO.findAll();

        // Conversion en ObservableList et injection dans le TableView
        ObservableList<Etudiant> mesEtudOL = FXCollections.observableArrayList(mesEtud);
        tvEtudiants.setItems(mesEtudOL);
    }

    /*
    private ObservableList<Etudiant> getTestList() {
        Etudiant etud1 = new Etudiant(1, "Goudet", "Magali");
        Etudiant etud2 = new Etudiant(2, "Dupont", "Jean");
        return FXCollections.observableArrayList(etud1, etud2);
    }
    */
}
