public class Truck extends MotorVehicle {
    int maxL;

    public Truck(String regNr, int maxL){
        super(regNr);
        this.maxL = maxL;
    }

    public void print(){
        System.out.println("This is a truck!");
    }
}
