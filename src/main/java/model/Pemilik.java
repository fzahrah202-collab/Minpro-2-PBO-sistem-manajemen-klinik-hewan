package model;

public class Pemilik {

    private int idData;
    private String namaPemilik;
    private String noTelepon;

    public Pemilik(int idData, String namaPemilik, String noTelepon) {
        this.idData = idData;
        this.namaPemilik = namaPemilik;
        this.noTelepon = noTelepon;
    }

    public int getIdData() {
        return idData;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
}