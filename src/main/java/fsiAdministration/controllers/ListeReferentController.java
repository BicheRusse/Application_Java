package fsiAdministration.controllers;

import fsiAdministration.BO.Referent;
import fsiAdministration.DAO.ReferentDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ListeReferentController extends MenuController implements Initializable {

    @FXML
    private TableView<Referent> tvReferents;

    @FXML
    private TableColumn<Referent, String> tcNomReferent;

    @FXML
    private TableColumn<Referent, String> tcPrenomReferent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Préparation des colonnes
        tcNomReferent.setCellValueFactory(cellData -> cellData.getValue().nomReferentProperty());
        tcPrenomReferent.setCellValueFactory(cellData -> cellData.getValue().prenomReferentProperty());

        // Chargement depuis la base
        ReferentDAO referentDAO = new ReferentDAO();
        List<Referent> mesReferents = referentDAO.findAll();
        ObservableList<Referent> referentOL = FXCollections.observableArrayList(mesReferents);

        tvReferents.setItems(referentOL);
    }
}
