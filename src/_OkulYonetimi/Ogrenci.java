package _OkulYonetimi;

public class Ogrenci extends Kisi{
    static int sayac =1000;

    private int numara;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, String kimlikNo, int yas, String sinif) {
        super(ad, soyad, kimlikNo, yas);
        this.numara = sayac++;
        this.sinif = sinif.toUpperCase();
    }

    public int getNumara() {
        return numara;
    }


    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ögrenci Adı : "+super.getAd()+" Öğrenci Soyadı : " + super.getSoyad()+" Öğrenci No : "+this.numara+" Sınıfı : "+this.sinif;
    }
}
