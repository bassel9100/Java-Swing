import static java.lang.System.out;

public class PersonBil extends MotorFordon {
    int antalPlats;

    public PersonBil(String str, int plats){
        super(str);
        antalPlats = plats;
    }

    @Override
    public void skriv(){
        super.skriv();
        out.print("Personbil med antal platser: " + antalPlats + " med reg nr: " + regNr);
    }

    @Override
    public void init(){
        super.init();
        antalPlats = Integer.parseInt(System.console().readLine("Antal platser: "));
    }
}