public class MotorVehicle extends Vehicle{
    String regNr;
    public MotorVehicle(String str){
        regNr = str;
    }

    @Override
    public void print(){
        System.out.println("A MotorVehicle!");
    }
}