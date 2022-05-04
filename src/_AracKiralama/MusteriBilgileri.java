package _AracKiralama;

public class MusteriBilgileri {

    private String ad;
    private String soyad;
    private String tel;
    private int yas;
    private String tc;

    public MusteriBilgileri(){

    }
    public MusteriBilgileri(String ad, String soyad, String tel, int yas, String tc) {
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.yas = yas;
        this.tc = tc;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "MusteriBilgileri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tel='" + tel + '\'' +
                ", yas=" + yas +
                ", tc='" + tc + '\'' +
                '}';
    }
}
