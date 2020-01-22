public class Random {
    public static void main(String[] args){
        House h = new House();
        Apartment b = new Apartment();
        FamilyHouse t = new FamilyHouse();

        if(h instanceof  Apartment) {
            b = (Apartment) h;
        }
        h.length = 10;
        h.width = 10;
        h.floorCount = 3;

        t.length = 10;
        t.width = 10;
        t.floorCount = 3;

        System.out.println(h.area() + " " + t.area());
        boolean x = t.isBigger(h);

        Vehicle[] arr = new Vehicle[5];
        arr[0] = new MotorVehicle("JFK902");
        arr[1] = new PersonalVehicle("MRE503", 4);
        arr[2] = new Truck("FFH302", 300);

        for(int i = 0; i < 3; i++){
            arr[i].print();
        }
    }
}
