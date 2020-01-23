public class Person extends Owner{
    protected String name, address;
    protected int age;
    protected Person spouse;

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void married(Person p){
        spouse = p;
        p.spouse = this;
    }

    public void divorce(){
        if(spouse != null){
            spouse.spouse = null;
            spouse = null;
        }
    }
}
