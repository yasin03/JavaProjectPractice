package _GeometrikHesaplama;

public class Kare extends Sekil {
    public Kare() {
    }
    public Kare(double kenar) {
    super.kareKenar=kenar;
    }

    public double alanKare(double kenar){
        super.kareKenar=kenar;
        return kareKenar*kareKenar;
    }
    public double alanKare(){

        return kareKenar*kareKenar;
    }

    public double cevreKare(double kenar){
        super.kareKenar=kenar;
        return kareKenar*4;
    }
    public double cevreKare(){
        return kareKenar*4;
    }
}
