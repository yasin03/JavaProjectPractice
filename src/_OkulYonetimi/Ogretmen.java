package _OkulYonetimi;

public class Ogretmen extends Kisi {

    private int sicilNo;
    private String bolum;

    public Ogretmen() {
    }

    public Ogretmen(String ad, String soyad, String kimlikNo, int yas, int sicilNo, String bolum) {
        super(ad, soyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum.toUpperCase();
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Öğretmen Adı : "+super.getAd()+" Öğretmen Soyadı : " + super.getSoyad()+" Kimlik No : " + super.getKimlikNo()+" Öğretmen Sicil No : "+this.sicilNo+" Branşı : "+this.bolum;
    }
}
