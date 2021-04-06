

public class CekKendaraan {
    public static void main(String[] args) {
        KendaraanTest kendaraan = new KendaraanTest();
        SepedaTest Sepeda = new SepedaTest();
        MotorTest motor = new MotorTest(3, "H 171 NO");
    

        Sepeda.MauLurus();
        Sepeda.BellBunyikan();
        motor.Coba();
        kendaraan.MauKekanan();
        motor.DptMesin();
    }
}
