package _OkulYonetimi;

import java.util.Locale;

public class Kisi {
    private String ad;
    private String soyad;
    private String kimlikNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, String kimlikNo, int yas) {
        this.ad = ad.toUpperCase(Locale.ROOT);
        this.soyad = soyad.toUpperCase();
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


}
