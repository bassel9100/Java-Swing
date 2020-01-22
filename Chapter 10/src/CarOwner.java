import java.util.LinkedList;
import java.util.List;

public class CarOwner extends Person {
    private List<MotorVehicle> ls = new LinkedList<>();

    public CarOwner(String name, String address, int age){
        super(name, address, age);
    }

    public void buyCar(MotorVehicle car){
        if(!ls.contains(car))
            ls.add(car);
    }

    public void sellCar(MotorVehicle car){
        if(ls.indexOf(car) >= 0)
            ls.remove(car);
    }

}
