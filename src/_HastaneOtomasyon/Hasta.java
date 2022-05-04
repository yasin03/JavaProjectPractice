package _HastaneOtomasyon;

public class Hasta {
    static int sayac =1000;

    private String hastaAdiSoyadi;
    private int hastaId;

    public Hasta() {
    }

    public Hasta(String hastaAdiSoyadi) {
        this.hastaAdiSoyadi = hastaAdiSoyadi.toUpperCase();
        this.hastaId = sayac++;
    }

    public String getHastaAdiSoyadi() {
        return hastaAdiSoyadi;
    }

    public void setHastaAdiSoyadi(String hastaAdiSoyadi) {
        this.hastaAdiSoyadi = hastaAdiSoyadi;
    }

    public int getHastaId() {
        return hastaId;
    }

    public void setHastaId(int hastaId) {
        this.hastaId = hastaId;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "hastaAdiSoyadi='" + hastaAdiSoyadi + '\'' +
                ", hastaId=" + hastaId +
                '}';
    }
}
