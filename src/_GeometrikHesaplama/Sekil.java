package _GeometrikHesaplama;

public class Sekil {

    double uzunKenar;
    double kisaKenar;
    double kareKenar;
    double yariCap;

    public Sekil() {
    }

    public Sekil(double uzunKenar, double kisaKenar, double kareKenar, double yariCap) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
        this.kareKenar = kareKenar;
        this.yariCap = yariCap;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getKareKenar() {
        return kareKenar;
    }

    public void setKareKenar(double kareKenar) {
        this.kareKenar = kareKenar;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    /*    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public double cevreHesaplama() {
       return (uzunKenar + kisaKenar) * 2;
   }

    public double alanHesaplama() {
        return uzunKenar * kisaKenar;
    }

    public double alanHesaplamaCember() {
        return yariCap * yariCap * 3.14;
    }*/
}
