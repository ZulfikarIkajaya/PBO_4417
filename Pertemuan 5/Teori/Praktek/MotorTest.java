public class MotorTest extends KendaraanTest {
    int Mesin = 1;
    String PlatNomor = "H 1 IDN";

    MotorTest() {

    }

    public MotorTest(int UkMesin, String LiPlate) {
        this.Mesin = UkMesin;
        this.PlatNomor = LiPlate;

    }

    public void Coba() {
        System.out.println(Mesin);
        System.out.println(PlatNomor);

    }

    public int DptMesin() {
        return Mesin;
    }

    public String DptPlatNmr() {
        return PlatNomor;
    }

}