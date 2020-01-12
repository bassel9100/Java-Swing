import java.io.*;

public class whatever{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Console cons = System.console();
        String namn = cons.readLine("Infilens namn?");
        BufferedReader inFil = new BufferedReader(new FileReader(namn));

        namn = cons.readLine("Utfilens namn?");
        PrintWriter utFil = new PrintWriter(new BufferedWriter(new FileWriter(namn)));

        int n = 0;
        while(true){
            String rad = inFil.readLine();
            if(rad == null)
                break;
            utFil.println(rad);
            n++;
        }
        utFil.close();
        cons.printf("%d Rader Kopierade", n);
    }
}