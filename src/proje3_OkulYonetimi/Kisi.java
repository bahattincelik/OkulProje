package proje3_OkulYonetimi;

public class Kisi {
    private String adSoyadi;
    private String kimlikNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String adSoyadi, String kimlikNo, int yas) {
        this.adSoyadi = adSoyadi;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }


    public String getAdSoyadi() {
        return adSoyadi;
    }

    public void setAdSoyadi(String adSoyadi) {
        this.adSoyadi = adSoyadi;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }



}
