package proje3_OkulYonetimi;

public class Ogretmen extends Kisi {

    private String bolum;
    private String sicilNo;


    public Ogretmen(String adSoyadi, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyadi, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", Bolumu : '" + bolum + '\'' +
                ", Sicil Numarasi : '" + sicilNo+ '\'';
    }
}
