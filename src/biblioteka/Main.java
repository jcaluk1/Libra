package biblioteka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("METODA START - MAIN");
        BibliotekaModel model = new BibliotekaModel();
        model.napuniBiblioteku(15);

        Controller control = new Controller(model);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("biblioteka.fxml"));

        loader.setController(control);




        Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("main - main");
        launch(args);
    }
}
