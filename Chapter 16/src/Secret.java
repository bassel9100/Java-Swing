import java.io.*;

public class Secret {

    public static int number(char c){
        c = Character.toLowerCase(c);
        if(c >= 'a' && c <= 'z')
            return (int) c - (int) 'a';
        else if(c == 'å' || c == 'Å')
            return 26;
        else if(c == 'ä' || c == 'Ä')
            return 27;
        else if(c == 'ö' || c == 'Ö')
            return 28;
        return -1;
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader  dosIn  = new InputStreamReader(System.in, "Cp850");
        PrintWriter        dosOut = new PrintWriter(new OutputStreamWriter(System.out, "Cp850"));
        System.out.println("Write in you secret code");
        dosOut.println("abcdefghijklmnopqrstuvwxyzåäö");
        dosOut.flush();
        char[] arr = new char[29];
        for (char c='a'; c<='z'; c++)
            arr[number((char) System.in.read())]= c;
        arr[number((char) System.in.read())]= 'å';
        arr[number((char) System.in.read())]= 'ä';
        arr[number((char) System.in.read())]= 'ö';

        FileReader file = new FileReader("secret.txt");
        int i;
        while((i = file.read()) != -1){
            char c = (char) i;
            int n = number(c);
            if(n >= 0)
                System.out.print(arr[n]);
            else
                System.out.print(c);
            System.out.flush();
        }
    }
}
