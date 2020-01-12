import java.io.*;
import java.util.*;

public class Tall {
    public static void main(String[] args) throws IOException {
        String name, address;
        int age, length, weight;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inFile"); System.out.flush();
        String Filename = sc.next();

        System.out.print("Enter outFile"); System.out.flush();
        String Filename2 = sc.next();

        Scanner inFile = new Scanner(new File(Filename));
        PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter(Filename2)));

        while(sc.hasNext()){
            name = sc.next();
            address = sc.next();
            sc.nextLine();
            age = sc.nextInt();
            length = sc.nextInt();
            weight = sc.nextInt();
            sc.nextLine();
            if(length > 200){
                outFile.println(name + " " + address);
                outFile.println(age + " " + length + " " + length + " " + weight);
            }
        }
        outFile.close();
    }
}
