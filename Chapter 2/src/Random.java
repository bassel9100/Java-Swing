import java.text.Collator;
import static java.lang.System.out;

public class Random {
    public static void main(String[] args) {
        new Random().program();
    }

    public void program(){
        String s1 = "Program";
        String s2 = "pRogram";

        Collator c1 = Collator.getInstance();

        if(c1.compare(s1, s2) > 0)
            out.println(s1 + " comes before " + s2);
        else if(c1.compare(s1, s2) < 0)
            out.println(s2 + " comes before " + s1);
        else
            out.println(s1 + " is equal to " + s2);

        Card c0 = new Card(1, 1);
        Card c2 = new Card(4,13);

        out.println(c0.toString());
        out.println(c2.toString());
    }
}