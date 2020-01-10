public class Person {
    private String name, address;
    private Person spouse;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void wedding(Person p){
        spouse = p;
        p.spouse = this;
    }

    public void divorce(){
        spouse.spouse = null;
        spouse = null;
    }

    public Person isMarried(){
        return spouse;
    }
}
