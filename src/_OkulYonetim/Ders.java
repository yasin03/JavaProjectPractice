package _OkulYonetim;

public class Ders {

    //fields (variable) : name,code,prefix,note,Teacher
    //Methods : Course() , addTeacher() , printTeacher()

    private String dersAdi;
    private String dersKodu;
    private Ogretmen dersOgretmen;
    private double sozluNot;
    private double yaziliNot;
    private double ortalama;
    private boolean gectiMi;



    public void Ders() {

    }
    public void ekleOgretmen() {

    }
    public void yazdirOgretmen() {

    }
    private double ortalamaBul(double sozluNot, double yaziliNot) {
        double ort = (sozluNot*0.20)+(yaziliNot*0.8);
        return ort;
    }

    public Ders(String dersAdi, String dersKodu, Ogretmen dersOgretmen, double sozluNot, double yaziliNot) {
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
        this.dersOgretmen = dersOgretmen;
        this.sozluNot = sozluNot;
        this.yaziliNot = yaziliNot;
        this.ortalama=ortalamaBul(sozluNot, yaziliNot);
        this.gectiMi = gectiMi();
    }
    private boolean gectiMi() {
        boolean result = false;
        if (ortalama>50) {
            result = true;
        }
        return result;
    }

    public boolean isGectiMi() {
        return gectiMi;
    }

    public void setGectiMi(boolean gectiMi) {
        this.gectiMi = gectiMi;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }


    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(String dersKodu) {
        this.dersKodu = dersKodu;
    }

    public Ogretmen getDersOgretmen() {
        return dersOgretmen;
    }

    public void setDersOgretmen(Ogretmen dersOgretmen) {
        this.dersOgretmen = dersOgretmen;
    }

    public double getSozluNot() {
        return sozluNot;
    }

    public void setSozluNot(double sozluNot) {
        this.sozluNot = sozluNot;
    }

    public double getYaziliNot() {
        return yaziliNot;
    }

    public void setYaziliNot(double yaziliNot) {
        this.yaziliNot = yaziliNot;
    }
    @Override
    public String toString() {
        return "Ders{" +
                "dersAdi='" + dersAdi + '\'' +
                ", dersKodu='" + dersKodu + '\'' +
                ", dersOgretmen='" + dersOgretmen + '\'' +
                ", sozluNot=" + sozluNot +
                ", yaziliNot=" + yaziliNot +
                '}';
    }
}
