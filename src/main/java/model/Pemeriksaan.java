package model;

public class Pemeriksaan {

    private int idData;
    private String keluhan;
    private String diagnosa;

    public Pemeriksaan(int idData, String keluhan, String diagnosa) {
        this.idData = idData;
        this.keluhan = keluhan;
        this.diagnosa = diagnosa;
    }

    public int getIdData() {
        return idData;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }
}