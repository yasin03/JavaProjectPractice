package _OkulYonetim;

public class Ogretmen {

    // fields : name,mpno,branch
    // Methods : Teacher()

    private String ogretmenAdi;
    private String ogretmenBrans;
    private String ogretmenSicil;

    public Ogretmen() {
    }

    public Ogretmen(String ogretmenAdi, String ogretmenBrans, String ogretmenSicil) {
        this.ogretmenAdi = ogretmenAdi;
        this.ogretmenBrans = ogretmenBrans;
        this.ogretmenSicil = ogretmenSicil;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ogretmenAdi='" + ogretmenAdi + '\'' +
                ", ogretmenBrans='" + ogretmenBrans + '\'' +
                ", ogretmenSicil='" + ogretmenSicil + '\'' +
                '}';
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }

    public String getOgretmenSicil() {
        return ogretmenSicil;
    }

    public void setOgretmenSicil(String ogretmenSicil) {
        this.ogretmenSicil = ogretmenSicil;
    }
}
