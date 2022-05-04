package _GeometrikHesaplama;

public class Dikdortgen extends Sekil {

    public Dikdortgen() {

    }

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        super.kisaKenar = kisaKenar;
        super.uzunKenar = uzunKenar;

    }

    public double alanDikdortgen(double kisaKenar, double uzunKenar) {
        super.kisaKenar = kisaKenar;
        super.uzunKenar = uzunKenar;
        return kisaKenar * uzunKenar;

    }

    public double cevreDikdortgen(double kisaKenar, double uzunKenar) {
        super.kisaKenar = kisaKenar;
        super.uzunKenar = uzunKenar;
        return kisaKenar + uzunKenar + kisaKenar + uzunKenar;

    }

    public double alanDikdortgen() {

        return kisaKenar * uzunKenar;

    }

    public double cevreDikdortgen() {

        return kisaKenar + uzunKenar + kisaKenar + uzunKenar;

    }


}
