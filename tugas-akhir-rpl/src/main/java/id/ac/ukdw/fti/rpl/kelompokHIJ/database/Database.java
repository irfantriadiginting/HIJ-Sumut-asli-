package id.ac.ukdw.fti.rpl.kelompokHIJ.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import id.ac.ukdw.fti.rpl.kelompokHIJ.modal.Verses;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Database {
    String querySelect = "SELECT verseID, osisRef, verseText, eventsDescribed,yearNum FROM verses";

    final String url = "jdbc:sqlite:vizbible.db";
    private ObservableList<Verses> verses = FXCollections.observableArrayList();
    private Connection connection = null;
    public static Database instance = new Database();

    public Database() {
        try {
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public Connection openConnection() {
        return connection;
    }

    public ObservableList<Verses> getAllVerses() {
        ObservableList<Verses> verses = FXCollections.observableArrayList();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(querySelect);
            while (result.next()) {
                Verses verse = new Verses();
                verse.setVerseId(result.getInt("verseID"));
                verse.setVerse(result.getString("osisRef"));
                verse.setVerseText(result.getString("verseText"));
                verse.setEventsDescribed(result.getString("eventsDescribed"));
                verse.setYearNum(result.getInt("yearNum"));;
                verses.add(verse);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        return verses;
    }

    public ArrayList<id.ac.ukdw.fti.rpl.kelompokHIJ.modal.Verses> eventsButtonSearch(String cari) {
        return null;
    }
    
}

