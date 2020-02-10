import java.util.*;
import java.io.*;

public class RandomWord {
    protected String fileName = "";
    protected int wordCount = 0;

    public RandomWord(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNext())
            wordCount++;
    }

    public String oneWord() throws FileNotFoundException {
        String word = "";
        Scanner sc = new Scanner(new File(fileName));
        Random rand = new Random();
        int random = rand.nextInt(wordCount);
        for(int i = 0; i < random; i++){
            word = sc.nextLine();
        }
        return word;
    }

    public static void main(String[] args) throws IOException{
        RandomWords r1 = new RandomWords("text.txt");
        System.out.println(r1.oneWord());
    }

}
