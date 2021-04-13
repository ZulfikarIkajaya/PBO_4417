public class MotorKu extends KMotor{
    int numGear = 0;

    MotorKu(){

    }
    public void AturGearFoot(int nmGear){
        this.numGear = nmGear;
    }
    public int DapatGearFoot(){
        return numGear;
    }
    public void Cek() {
        System.out.println("Gear Dari Sepeda Sekarang Yaitu : "+numGear);

    }
}