import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class RomanTranslator {
    public static void main(String[] args){
        while(true){
            String str = JOptionPane.showInputDialog(null, "Enter roman value");
            if(str==null)
                System.exit(0);
            str = str.toUpperCase();
            int[] arr = new int[str.length()+1];
            arr[str.length()] = 0;
            try{
                for(int i = 0; i < str.length(); i++){
                    String s = str.substring(i,i+1);
                    RomanNume r = Enum.valueOf(RomanNume.class, s);
                    arr[i] = r.value;
                }
                int sum = 0;
                for(int j = 0; j < str.length(); j++){
                    if(arr[j] >= arr[j+1])
                        sum += arr[j];
                    else
                        sum -= arr[j];
                }
                JOptionPane.showMessageDialog(null, "The total sum is: " + sum);
            } catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, "Incorrect value, try again");
            }
        }
    }

    public enum RomanNume{
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        public final int value;
        RomanNume(int v){value = v;}
    }
}
