public class Dogs extends Mammals {
    protected String kind;

    public Dogs(int length, double weight, String kind){
        super(length, weight);
        this.kind = kind;
    }

    public String getKind(){
        return kind;
    }

    @Override
    public String sound() {
        if(weight < 3)
            return "voff!";
        else if(weight > 10)
            return "Voff!";
        else 
            return "WOFFFF!";
    }
}
