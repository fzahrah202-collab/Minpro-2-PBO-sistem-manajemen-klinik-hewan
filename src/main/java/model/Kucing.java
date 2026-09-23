package model;

public class Kucing extends Hewan {
    
    private String statusVaksinF3;
    
    public Kucing(int idData, String namaHewan, int umur, String statusVaksinF3) {
        super(idData, namaHewan, "Kucing", umur);
        this.statusVaksinF3 = statusVaksinF3;
    }
    public String getStatusVaksinF3() {
        return statusVaksinF3;
    }
    
    public void setStatusVaksinF3(String statusVaksinF3) {
        this.statusVaksinF3 = statusVaksinF3;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status Vaksin F3: " + statusVaksinF3);
    }
}
