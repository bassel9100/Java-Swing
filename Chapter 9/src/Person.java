public class Person {

    protected String name, address;
    protected int age;
    private Person spouse;

    public Person(){};

    public Person(String name){this.name = name;}

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void married(Person p){
        spouse = p;
        p.spouse = this;
    }

    public void divorce(){
        spouse.spouse = null;
        spouse = null;
    }

    public Person getSpouse(){
        return spouse;
    }
}
