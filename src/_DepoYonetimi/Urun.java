package _DepoYonetimi;

import javax.crypto.spec.PSource;

public class Urun {
    //id urunIsmi uretici miktar birim ve raf
    static int sayac = 1000;

    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;

    public Urun() {
    }

    public Urun(String urunIsmi, String uretici, String birim) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.id=sayac++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return  "\tid\t\tismi\tureticisi\tmiktari\t\tbirimi\t\traf\n" +
                "---------------------------------------------------\n"+
                  id +"\t"+ urunIsmi +"\t"+ uretici +"\t"+ miktar +"\t"+ birim +"\t"+ raf ;
    }
}
