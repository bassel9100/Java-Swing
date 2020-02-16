import static java.lang.System.out;

public class LastBil extends MotorFordon{
    double maxLast;

    public LastBil(){}

    public LastBil(String str, double maxLast){
        super(str);
        this.maxLast = maxLast;
    }

    @Override
    public void skriv(){
        super.skriv();
        out.print("Maxlasten för bilen är: " + maxLast);
    }

    @Override
    public void init(){
        super.init();
        maxLast = Double.parseDouble(System.console().readLine("Maxlast? "));
    }
}
