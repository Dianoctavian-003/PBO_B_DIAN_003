package Codelab.Modul2;

public class MainRekening {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("20241037010052", "Naila Al Inayah", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110003", "Dian Octavian", 1000000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
