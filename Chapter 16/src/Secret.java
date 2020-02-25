import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Secret {

    public static void main(String[] args) throws IOException {
        Secret n1 = new Secret();
        System.out.println("Skriv in kodningstabellen");
        System.out.println("abcdefghijklmnopqrstuvwxyzåäö");
        char[] tab = new char[29];
        for (char c = 'a'; c <= 'z'; c++)
            tab[n1.number((char) System.in.read())] = c;
        tab[n1.number((char) System.in.read())] = 'å';
        tab[n1.number((char) System.in.read())] = 'ä';
        tab[n1.number((char) System.in.read())] = 'ö';

        FileReader fil = new FileReader("secret.txt");
        int i;
        while ((i = fil.read()) != -1) {
            char c = (char) i;
            int n = n1.number(c);
            if (n >= 0)
                System.out.print(tab[n]);
            else
                System.out.print(c);
            System.out.flush();
        }
    }

    public int number(char c){
        c = Character.toLowerCase(c);
        if(c >= 'a' && c <= 'z'){
            return (int) c - (int) 'a'; //a = 97 .. z = 122
        } else if(c == 'a' || c == 'Ä'){
            return 26;
        } else if(c == 'å' || c == 'Å'){
            return 27;
        } else if(c == 'ö' || c == 'Ö'){
            return 28;
        }
        return -1;
    }
}
