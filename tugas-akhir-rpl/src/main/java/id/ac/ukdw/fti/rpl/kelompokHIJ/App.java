package id.ac.ukdw.fti.rpl.kelompokHIJ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("versetable.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("EASY BIBLE");
        stage.setScene(scene);
        stage.show();
    }
    public static void main( String[] args )
    {
       launch(args);
    }
}
