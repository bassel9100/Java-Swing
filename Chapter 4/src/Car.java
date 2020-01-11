public class Car {
    private String regNr;
    private String brand, model;

    private carOwner owner;

    public Car(String regNr, String brand, String model){
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
    }

    public void buy(carOwner x){
        this.owner = x;
        x.car = this;
    }
}

