import java.io.*;
import java.util.*;

public class RandomWords {
    private int count = 0;
    private String fileName;

    public RandomWords(String name) throws IOException {
        fileName = name;
        Scanner sc = new Scanner(new File(fileName));
        BufferedReader f = new BufferedReader(new FileReader(fileName));
        while(f.readLine() != null)
            count++;
    }

    public String oneWord() throws IOException {
        String str = "";
        int random = (int) (Math.random()*count+1);
        BufferedReader f = new BufferedReader(new FileReader(fileName));
        for(int i = 0; i < random; i++)
            str = f.readLine();
        f.close();
        return str;
    }

    public static void main(String[] args) throws IOException{
        RandomWords r1 = new RandomWords("text.txt");
        System.out.println(r1.oneWord());
    }
}
