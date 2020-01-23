public class LegalPerson extends Owner implements Legal {
    protected String name, orginisationNr;

    public LegalPerson(String name, String orginisationNr){
        this.name = name;
        this.orginisationNr = orginisationNr;
    }

    public String getName(){
        return name;
    }

    public String getOrginisationNr(){
        return orginisationNr;
    }

    @Override
    public void print() {
        System.out.println("Organisiation number: " + orginisationNr);
        System.out.println("Name: " + name);
        System.out.println("Number of companies owned:");
        printLegal();
    }
}
