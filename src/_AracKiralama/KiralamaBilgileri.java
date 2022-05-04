package _AracKiralama;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class KiralamaBilgileri {

    private String id;
    private LocalDate kiralamaTarih;
    private LocalTime kiralamaSaati;
    private String alinacagiSehir;
    private LocalDate teslimTarihi;
    private LocalTime teslimSaati;

    public KiralamaBilgileri(String id, LocalDate kiralamaTarih, LocalTime kiralamaSaati, String alinacagiSehir, LocalDate teslimTarihi, LocalTime teslimSaati) {
        this.id = id;
        this.kiralamaTarih = kiralamaTarih;
        this.kiralamaSaati = kiralamaSaati;
        this.alinacagiSehir = alinacagiSehir;
        this.teslimTarihi = teslimTarihi;
        this.teslimSaati = teslimSaati;
    }
    public KiralamaBilgileri(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getKiralamaTarih() {
        return kiralamaTarih;
    }

    public void setKiralamaTarih(LocalDate kiralamaTarih) {
        this.kiralamaTarih = kiralamaTarih;
    }

    public LocalTime getKiralamaSaati() {
        return kiralamaSaati;
    }

    public void setKiralamaSaati(LocalTime kiralamaSaati) {
        this.kiralamaSaati = kiralamaSaati;
    }

    public String getAlinacagiSehir() {
        return alinacagiSehir;
    }

    public void setAlinacagiSehir(String alinacagiSehir) {
        this.alinacagiSehir = alinacagiSehir;
    }

    public LocalDate getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(LocalDate teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }

    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalTime teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    @Override
    public String toString() {
        return "KiralamaBilgileri{" +
                "id='" + id + '\'' +
                ", kiralamaTarih=" + kiralamaTarih +
                ", kiralamaSaati=" + kiralamaSaati +
                ", alinacagiSehir='" + alinacagiSehir + '\'' +
                ", teslimTarihi=" + teslimTarihi +
                ", teslimSaati=" + teslimSaati +
                '}';
    }
}
