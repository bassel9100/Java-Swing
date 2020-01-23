import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class openFile {

    public static BufferedReader open(){
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                System.out.println("Whats the file's name?");
                String name = keyboard.readLine();
                return new BufferedReader(new FileReader(name));
            } catch(IOException e){
                System.out.println("Wrong file name try again");
            }
        }
    }
}
