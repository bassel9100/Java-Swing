import static java.lang.System.out;

public class MotorFordon extends Fordon {
    String regNr;

    public MotorFordon(){}

    public MotorFordon(String str){
        regNr = str;
    }

    @Override
    public void skriv(){
        out.print("Ett motorfordon med reg nr: " + regNr);
    }

    @Override
    public void init(){
        regNr = System.console().readLine("Vilken reg nr: ");
    }
}
