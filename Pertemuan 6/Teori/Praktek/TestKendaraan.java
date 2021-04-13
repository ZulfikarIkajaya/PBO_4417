public class TestKendaraan {
    static void KendaraanMelaju(POKendaraan vehicle) {
        vehicle.JalanLurus();
    }

    public static void main(String[] args) {
        Sepeda Coba = new Sepeda();
        KMotor MV1 = new KMotor();
        MotorKu COL = new MotorKu();
        MobilKu Cek = new MobilKu();

        Coba.BunyiBell();
        KendaraanMelaju(Coba);

        MV1.Tes();
        KendaraanMelaju(MV1);

        COL.AturGearFoot(2);
        COL.Cek();
        KendaraanMelaju(COL);

        Cek.AturSeatBelt(1);
        System.out.println("Sabuk Sekarang Bernilai : "+ Cek.DapatSeatBelt());
        KendaraanMelaju(Cek);
        
        
    }
    
}