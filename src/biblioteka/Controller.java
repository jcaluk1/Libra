package biblioteka;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    public TextField IdTextAutor;
    public TextField IdTextNaslov;
    public TextField IdTextISDN;
    public BibliotekaModel model;
    public ChoiceBox<Knjiga> choiceKnjige;

    public Controller (BibliotekaModel model) {
        System.out.println("Konstruktor - kontroler");
        this.model = model;
    }


    @FXML
    public void initialize () {
        System.out.println("initialize - controler");
        choiceKnjige.setItems(model.getKnjige());

        model.trenutnaKnjigaProperty().addListener(
                (neki_vrag, oldKnjiga, newKnjiga) -> {
                    System.out.println("Initialzie - LISTENER");
                    //      choiceKnjige.setItems(model.getKnjige());
                    if (oldKnjiga != null) {
                        IdTextAutor.textProperty().unbindBidirectional(oldKnjiga.autorProperty());
                        IdTextNaslov.textProperty().unbindBidirectional(oldKnjiga.naslovProperty());
                        IdTextISDN.textProperty().unbindBidirectional(oldKnjiga.isdnProperty());
                    }

                    if (newKnjiga == null) {

                        IdTextAutor.setText("Kikac");
                        IdTextNaslov.setText("Kikac");
                        IdTextISDN.setText("Kikac");
                    } else {
                        IdTextAutor.textProperty().bindBidirectional(newKnjiga.autorProperty());
                        IdTextNaslov.textProperty().bindBidirectional(newKnjiga.naslovProperty());
                        IdTextISDN.textProperty().bindBidirectional(newKnjiga.isdnProperty());
                    }


                }
        );
    }
    public void promjenaKnjige(ActionEvent actionEvent) {
        System.out.println("-- On Akcija --");
        model.setTrenutnaKnjiga(choiceKnjige.getValue());
    }
}
