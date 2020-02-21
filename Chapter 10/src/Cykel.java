public class Cykel extends Fordon {
    int antalVäxlar;

    public Cykel(int x){
        antalVäxlar = x;
    }

    @Override
    public void skriv(){
        System.out.print("En cykel med " + antalVäxlar + " växlar");
    }

    @Override
    public void init(){
        antalVäxlar = Integer.parseInt(System.console().readLine("Antal växlar?: "));
    }
}
