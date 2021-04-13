public class MobilKu extends KMotor{
    boolean seatbelt = false;


    MobilKu(){

    }
    public void AturSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }
        else{
            this.seatbelt = false;
        }
        
    }
    public boolean DapatSeatBelt(){
        return seatbelt;
    }

}