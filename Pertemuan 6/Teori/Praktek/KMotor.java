public class KMotor extends POKendaraan {
    int Mesin = 1;
    String PlatNomor = "H 100 IDN";

    KMotor() {

    }

    public KMotor(int UkMesin, String LiPlate) {
        this.Mesin = UkMesin;
        this.PlatNomor = LiPlate;

    }

    public void Tes() {
        System.out.println(Mesin);
        System.out.println(PlatNomor);

    }

    public int getMesin() {
        return Mesin;
    }

    public String getPlatNomor() {
        return PlatNomor;
    }

}