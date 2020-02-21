import java.text.Collator;

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

    @Override
    public boolean equals(Object obj){
        Collator c = Collator.getInstance();
        if(obj == null || obj.getClass() != getClass())
            return false;
        else{
            MotorFordon ny = (MotorFordon) obj;
            return c.equals(regNr, ny.regNr);
        }
    }
}
