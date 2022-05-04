package _BiletAlma;

public class Yolcu {

    private String name;
    private String surname;
    private String cinsiyet;
    private String telefon;

    public Yolcu() {
    }

    public Yolcu(String name, String surname, String cinsiyet, String telefon) {
        this.name = name;
        this.surname = surname;
        this.cinsiyet = cinsiyet;
        this.telefon = telefon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
