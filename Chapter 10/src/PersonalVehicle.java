public class PersonalVehicle extends MotorVehicle {
    int seats;
    public PersonalVehicle(String regNr, int seats){
        super(regNr);
        this.seats = seats;
    }

    @Override
    public void print(){
        System.out.println("This is a personal vehicle with " + seats + " amount of seats");
    }
}
