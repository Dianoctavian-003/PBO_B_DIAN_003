package Tugas.Modul2;

public class Mahasiswa {
    private final String nama = "Dian Octavian";
    private final String nim = "202410370110003";

    public boolean login(String inputNama, String inputNim) {
        return nama.equals(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
