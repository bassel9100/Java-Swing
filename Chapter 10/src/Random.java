public class Random {
    public static void main(String[] args){
        House h = new House();
        Apartment b = new Apartment();
        FamilyHouse t = new FamilyHouse();

        if(h instanceof  Apartment) {
            b = (Apartment) h;
        }

        boolean x = t.isBigger(h);
    }
}
