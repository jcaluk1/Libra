package biblioteka;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;

public class BibliotekaModel {
    private ObservableList<Knjiga> knjige = FXCollections.observableArrayList();
    private SimpleObjectProperty<Knjiga> trenutnaKnjiga = new SimpleObjectProperty<Knjiga>();



    public ObservableList<Knjiga> getKnjige() {
        return knjige;
    }

    public void setKnjige(ObservableList<Knjiga> knjige) {
        this.knjige = knjige;
    }

    public Knjiga getTrenutnaKnjiga() {
        return trenutnaKnjiga.get();
    }

    public SimpleObjectProperty<Knjiga> trenutnaKnjigaProperty() {
        return trenutnaKnjiga;
    }

    public void setTrenutnaKnjiga(Knjiga trenutnaKnjiga) {
        this.trenutnaKnjiga.set(trenutnaKnjiga);
    }

    public void napuniBiblioteku (int broj_knjiga) {

        for (int i=0; i<broj_knjiga; i++) {
            Knjiga temp = new Knjiga("Autor"+i, "Naslov"+i, i+""+i);
            knjige.add(temp);
        }
        trenutnaKnjiga.set(null);
    }


}
