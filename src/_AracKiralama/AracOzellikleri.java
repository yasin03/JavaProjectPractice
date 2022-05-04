package _AracKiralama;

public class AracOzellikleri {

   static int deger =1000;
   private int id ;
   private String model;
   private String marka;
   private String yakit;
   private String vites;
   private String koltukSayisi;
   private double ucret;


    public AracOzellikleri( String model, String marka, String yakit, String vites, String koltukSayisi, double ucret) {
        this.id = deger++;
        this.model = model;
        this.marka = marka;
        this.yakit = yakit;
        this.vites = vites;
        this.koltukSayisi = koltukSayisi;
        this.ucret = ucret;
    }



    public AracOzellikleri(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(String koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "aracOzellikleri{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yakit='" + yakit + '\'' +
                ", vites='" + vites + '\'' +
                ", koltukSayisi='" + koltukSayisi + '\'' +
                ", ucret=" + ucret +
                '}';
    }
}
