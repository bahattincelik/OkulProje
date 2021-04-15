package proje3_OkulYonetimi;

public class Ogrenci extends Kisi {

    private String numara;
    private String sinif;


    public Ogrenci(String adSoyadi, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyadi, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


}
