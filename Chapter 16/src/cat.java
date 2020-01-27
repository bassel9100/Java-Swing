import java.io.*;

public class cat {
    public static void copy(InputStream in) throws IOException{
        int i;
        while((i=in.read()) != -1)
            System.out.write(i);
    }
    public static void main(String[] args) throws IOException{
        InputStream in;
        if(args.length == 0) {
            in = System.in;
            copy(in);
        } else{
            for(int i = 0; i < args.length ; i++){
                try{
                    in = new FileInputStream(args[i]);
                    copy(in);
                } catch(FileNotFoundException e){
                    System.out.println("Cannot open file " + args[i]);
                    System.exit(1);
                }
            }
        }
    }
}
