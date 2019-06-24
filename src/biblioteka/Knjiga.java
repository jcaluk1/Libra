package biblioteka;

import javafx.beans.property.SimpleStringProperty;

public class Knjiga {
    private SimpleStringProperty autor, naslov, isdn;

    public Knjiga () {
        autor = new SimpleStringProperty("");
        naslov = new SimpleStringProperty("");
        isdn = new SimpleStringProperty("");
    }

    public Knjiga(String autor, String naslov, String isdn) {
        this.autor = new SimpleStringProperty(autor);
        this.naslov = new SimpleStringProperty(naslov);
        this.isdn = new SimpleStringProperty(isdn);
    }

    public String getAutor() {
        return autor.get();
    }

    public SimpleStringProperty autorProperty() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor.set(autor);
    }


    public String getNaslov() {
        return naslov.get();
    }

    public SimpleStringProperty naslovProperty() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov.set(naslov);
    }


    public String getIsdn() {
        return isdn.get();
    }

    public SimpleStringProperty isdnProperty() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn.set(isdn);
    }

    @Override
    public String toString() {
        return autor.get() + ", " + naslov.get() + ", " + isdn.get();
    }


}
