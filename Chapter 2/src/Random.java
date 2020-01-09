import java.text.Collator;

public class Random {
    public static void main(String[] args){
    String str = "program";
    String str2 = "Program";

    Collator co = Collator.getInstance();

    if(co.compare(str, str2) > 0)
        System.out.println(str + " comes before " + str2);
    else if(co.compare(str, str2) < 0)
        System.out.println(str2 + " comes before " + str);
    else
        System.out.println("De är lika");
    }
}