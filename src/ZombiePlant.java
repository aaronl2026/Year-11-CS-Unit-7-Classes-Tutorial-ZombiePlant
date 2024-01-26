public class ZombiePlant {
    private int potency;
    private int treatmentNum;
    public ZombiePlant(int a, int b){
        this.potency = a;
        this.treatmentNum = b;
    }

    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return treatmentNum;
    }

    public boolean isDangerous(){
        if(treatmentNum > 0 ){
            return true;
        }
        else return false;
    }

    public void treat(int a){
        if (a <= potency && a > 0){
            if (treatmentNum > 0) treatmentNum = treatmentNum - 1;
        }
        else if (a > 10) treatmentNum = treatmentNum + 1;
    }


}
