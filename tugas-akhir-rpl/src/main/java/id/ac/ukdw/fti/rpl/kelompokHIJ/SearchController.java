package id.ac.ukdw.fti.rpl.kelompokHIJ;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SearchController implements Initializable {
    Database db = new Database();

    @FXML
    private Button eventsButtonSearch;

    @FXML
    private ListView<String> eventsResultSearch;

    @FXML
    private TextField eventsSearchField;

    @FXML
    private TextField periodSearchField;

    @FXML
    private ListView<String> periodsResultSet;

    @FXML
    private Button periodsSearchButton;
    @FXML
    void buttonSearch(ActionEvent event) {

    }

   

    // @FXML
    // void buttonSearch(ActionEvent event){
    //     String cari = eventsSearchField.getText().toLowerCase();
    //     // cari = cari.replace(" ", "-");
    //     System.out.println(cari);
    //     ArrayList<Verses> getSearch = db.eventsButtonSearch(cari);
    //     ObservableList<String> hasilCariEvent = FXCollections.observableArrayList();
    //     for(Verses isiCari : getSearch){
    //         hasilCariEvent.add(isiCari.getVerse()+"\n"+isiCari.getVerseText()+"\n");
    //         System.out.println(isiCari.getVerse() + isiCari.getVerseText());
    //         // tambahItem(isiCari.getVerse());
    // }
    @FXML
    void home(ActionEvent home) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("versetable.fxml"));
        
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);

        scene.setRoot(root);
        stage.setTitle("Pencarian");
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }



}

