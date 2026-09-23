package model;

public class Hewan {

    private int idData;
    private String namaHewan;
    private String jenisHewan;
    private int umur;

    public Hewan(int idData, String namaHewan, String jenisHewan, int umur) {
        this.idData = idData;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    public int getIdData() {
        return idData;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public int getUmur() {
        return umur;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void tampilkanInfo() {
        System.out.println("Jenis Hewan: " + jenisHewan);
    }
}