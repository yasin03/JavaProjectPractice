package _GeometrikHesaplama;

public class Cember extends Sekil {

    private static final double pi = 3.14;

    public Cember() {
    }

    public Cember(double yariCap) {
        super.yariCap=yariCap;
    }

    public double cevreCember(double yariCap){
        super.yariCap=yariCap;
        return super.yariCap*2*pi;
    }

    public double alanCember(double yariCap) {
        super.yariCap=yariCap;
        return super.yariCap*yariCap*pi;
    }




}
