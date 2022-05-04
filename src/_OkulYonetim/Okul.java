package _OkulYonetim;

public class Okul {
    private Ogretmen ogrt;
    private Ogrenci ogr;
    private Ders ders;

    public Okul() {
    }

    public Okul(Ogretmen ogrt, Ogrenci ogr, Ders ders) {
        this.ogrt = ogrt;
        this.ogr = ogr;
        this.ders = ders;
    }

    public Ogretmen getOgrt() {
        return ogrt;
    }

    public void setOgrt(Ogretmen ogrt) {
        this.ogrt = ogrt;
    }

    public Ogrenci getOgr() {
        return ogr;
    }

    public void setOgr(Ogrenci ogr) {
        this.ogr = ogr;
    }

    public Ders getDers() {
        return ders;
    }

    public void setDers(Ders ders) {
        this.ders = ders;
    }

    @Override
    public String toString() {
        return "ÖğrenciAdı : "+ogr.getOgrenciAdi()+"\nÖğrenci No : "+ogr.getOgrenciNo()+"\nSınıfı : "+ogr.getSinif()+
                "\nDers Adı : "+ogr.getDers1().getDersAdi()+"\nOrtalaması : "+ogr.getDers1().getOrtalama()+
                "\nDers Öğretmeni : "+ ogr.getDers1().getDersOgretmen().getOgretmenAdi();
    }
}
