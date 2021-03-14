import java.util.Scanner;
class Mobil2 {
    String warna;
    int tahunProduksi;
    boolean hidupkanMobil = false;
    boolean matikanMobil = true;
    int ubahGigi;
}
public class MobilDemo2 {
    public static void main(String[] args){
        Mobil2 mobilku = new Mobil2();
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.print(" Masukkan Warna :");
        mobilku.warna = keyboard.nextLine();
        System.out.print(" Masukkan Tahun :");
        mobilku.tahunProduksi = keyboard.nextInt();
        System.out.println(" Mesin :"+ mobilku.hidupkanMobil);
        System.out.println(" Ubah Gigi:"+ mobilku.ubahGigi);
        mobilku.ubahGigi = 2;
        System.out.println(" Press any key to continue... ");
    }
}
