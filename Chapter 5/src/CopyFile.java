import java.io.*;
import static java.lang.System.out;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Console cons = System.console();
        String name = cons.readLine("What is the name of the file that you want to copy?");
        BufferedReader inFile = new BufferedReader(new FileReader(name));
        String name2 = cons.readLine("What is the name of the output file that you wan to copy to?");
        PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter(name2)));

        int count = 0;
        while(true){
            String line = inFile.readLine();
            if(line == null)
                break;
            outFile.println(line);
            count++;
        }
        outFile.close();
        out.println(count + " Lines was copied from the file!");
    }
}
