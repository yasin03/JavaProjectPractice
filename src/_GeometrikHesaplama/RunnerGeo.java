package _GeometrikHesaplama;

public class RunnerGeo {
    public static void main(String[] args) {

        Cember c1 = new Cember();
        System.out.println("Çemberin Alanı : "+ c1.alanCember(2.56));
        System.out.println("Çemberin Çevresi : "+ c1.cevreCember(2.56));

        Kare k1 = new Kare();
        System.out.println("Karenin alanı : "+ k1.alanKare(5));
        k1.kareKenar=7;
        System.out.println("Karenin çevresi : "+ k1.cevreKare());

        Dikdortgen d1 = new Dikdortgen();
        System.out.println("Dikdörtgenin alanı : "+ d1.alanDikdortgen(3,2.5));
        d1.kisaKenar=2;
        d1.uzunKenar=6;
        System.out.println("Dikdörtgenin çevresi : "+ d1.cevreDikdortgen());


    }
}
