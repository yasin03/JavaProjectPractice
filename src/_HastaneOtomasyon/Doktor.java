package _HastaneOtomasyon;

public class Doktor {
    private String doktorAdi;
    private String doktorSoyadi;
    private String doktorUnvan;

    public Doktor() {
    }

    public Doktor(String doktorAdi, String doktorSoyadi, String doktorUnvan) {
        this.doktorAdi = doktorAdi;
        this.doktorSoyadi = doktorSoyadi;
        this.doktorUnvan = doktorUnvan;
    }

    public String getDoktorAdi() {
        return doktorAdi;
    }

    public void setDoktorAdi(String doktorAdi) {
        this.doktorAdi = doktorAdi;
    }

    public String getDoktorSoyadi() {
        return doktorSoyadi;
    }

    public void setDoktorSoyadi(String doktorSoyadi) {
        this.doktorSoyadi = doktorSoyadi;
    }

    public String getDoktorUnvan() {
        return doktorUnvan;
    }

    public void setDoktorUnvan(String doktorUnvan) {
        this.doktorUnvan = doktorUnvan;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "doktorAdi='" + doktorAdi + '\'' +
                ", doktorSoyadi='" + doktorSoyadi + '\'' +
                ", doktorUnvan='" + doktorUnvan + '\'' +
                '}';
    }
}
