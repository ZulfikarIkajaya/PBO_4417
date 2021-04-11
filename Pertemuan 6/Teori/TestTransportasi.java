import TestTransportasi.TestSepeda;
import TestTransportasi.MobilTest;

public class TestTransportasi{
    public static void main(String[] args){
        TestSepeda Jaw = new TestSepeda();
        System.out.println("====== Sepeda BM ====== ");
        Jaw.JalanKanan();
        Jaw.JalanLurus();
        MobilTest Lal = new MobilTest();
        System.out.println("====== Menu Mobil ====== ");
        Lal.Menu();
    }
}
