package _OkulYonetim;

public class OkulRunner {
    public static void main(String[] args) {
/*
        Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
        her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
        yüzdesi ile dahil edin.

        Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
        sınav notunun etkisi %80'dir.

        Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
        genel ortalamaya etkisi şu şekilde hesaplanır :

        Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
        */


        Ogretmen o1=new Ogretmen("Yıldız Bayal","Matematik","1020");
        Ogretmen o2=new Ogretmen("Yaşar Kale","Fizik","1025");
        Ogretmen o3=new Ogretmen("Halil İbrahim Terlemez","Türkçe","1030");

        System.out.println(o1);
        Ders ders1 = new Ders("Matematik","M1",o1,60,65);
        Ders ders2 = new Ders("Fizik","F1",o2,60,65);
        Ders ders3 = new Ders("Türkçe","T1",o3,60,65);

        Ogrenci og1= new Ogrenci("Ali Yıldız","256","7-A",ders1,ders2,ders3);
        Okul okul=new Okul(o1,og1,ders2);

        System.out.println(okul.toString());

    }
}
