package model;

public class Anjing extends Hewan {
    
    private String statusVaksinRabies;
    
    public Anjing(int idData, String namaHewan, int umur, String statusVaksinRabies) {
        super(idData, namaHewan, "Anjing", umur);
        this.statusVaksinRabies = statusVaksinRabies;
    }
    
    public String getStatusVaksinRabies() {
        return statusVaksinRabies;
        
    }
    
    public void setStatusVaksinRabies(String statusVaksinRabies) {
        this.statusVaksinRabies = statusVaksinRabies;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status Vaksin Rabies: " + statusVaksinRabies);
    }
}
