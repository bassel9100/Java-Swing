
public class carOwner extends Person {
    public Car car;

    public void buy(Car car){
        this.car = car;
    }

    public void sell(){
        car = null;
    }

    public boolean hasCar(){
        if(car != null)
            return true;
        return false;
    }
}
