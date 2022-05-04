package _OkulYonetim;

public class Ogrenci {
    // fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
    // Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

    private String ogrenciAdi;
    private String ogrenciNo;
    private String sinif;
    private Ders ders1;
    private Ders ders2;
    private Ders ders3;

    public Ogrenci() {
    }

    public Ogrenci(String ogrenciAdi, String ogrenciNo, String sinif, Ders ders1, Ders ders2, Ders ders3) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.ders1 = ders1;
        this.ders2 = ders2;
        this.ders3 = ders3;

    }

    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public Ders getDers1() {
        return ders1;
    }

    public void setDers1(Ders ders1) {
        this.ders1 = ders1;
    }

    public Ders getDers2() {
        return ders2;
    }

    public void setDers2(Ders ders2) {
        this.ders2 = ders2;
    }

    public Ders getDers3() {
        return ders3;
    }

    public void setDers3(Ders ders3) {
        this.ders3 = ders3;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciAdi='" + ogrenciAdi + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                ", ders1=" + ders1 +
                ", ders2=" + ders2 +
                ", ders3=" + ders3 +
                '}';
    }
}
