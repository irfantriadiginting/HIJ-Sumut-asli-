package id.ac.ukdw.fti.rpl.kelompokHIJ;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import id.ac.ukdw.fti.rpl.kelompokHIJ.database.Database;

import id.ac.ukdw.fti.rpl.kelompokHIJ.modal.Verses;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FXMLController implements Initializable {
    private ObservableList<Verses> verses = FXCollections.observableArrayList();


    @FXML
    private TableView<Verses> tableVerses;

    @FXML
    private Button searchButton;

    @FXML
    private TextField textField;

    @FXML
    private TableColumn<Verses, Integer> verseIdColumn;

    @FXML
    private TableColumn<Verses, String> verseColumn;

    @FXML
    private TableColumn<Verses, String> eventsColumn;


    @FXML
    private TableColumn<Verses, Integer> versePeriodsColumn;

    @FXML
    private TableColumn<Verses, String> verseTextColumn;

    @FXML
    void moveToSearchMenu(ActionEvent moveToSearchMenu) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pencarian.fxml"));
        
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);

        scene.setRoot(root);
        stage.setTitle("EASY BIBLE");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

        verses = Database.instance.getAllVerses();
        
        verseIdColumn.setCellValueFactory(new PropertyValueFactory<Verses, Integer>("verseId"));
        verseColumn.setCellValueFactory(new PropertyValueFactory<Verses, String>("verse"));
        eventsColumn.setCellValueFactory(new PropertyValueFactory<Verses, String>("eventsDescribed"));
        verseTextColumn.setCellValueFactory(new PropertyValueFactory<Verses,String>("verseText"));
        versePeriodsColumn.setCellValueFactory(new PropertyValueFactory<Verses,Integer>("yearNum"));
        tableVerses.setItems(verses);
    }


}
