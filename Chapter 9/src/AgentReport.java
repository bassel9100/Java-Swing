import java.text.Collator;
import java.util.*;
import static java.lang.System.out;

public class AgentReport {

    public static void main(String[] args){
        Collator c = Collator.getInstance();
        Agent[] arr = new Agent[100];
        int agentCount = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            out.print("Agent? ->"); out.flush();
            if(!sc.hasNext())
                break;
            String name = sc.nextLine();
            out.print("Sum? ->"); out.flush();
            Double sumM = sc.nextDouble();
            sc.nextLine();
            int i;
            for(i = 0; i < agentCount && !c.equals(name, arr[i].name); i++);
            if(i == agentCount){
                arr[i] = new Agent(name);
                agentCount++;
                arr[i].sum = sumM;
            }
        }

        out.format("\n\n%30s %10s\n%30s%10s\n", "Sum", "Commission", "=====", "=====");
        for(int i = 0; i < agentCount; i++){
            out.format("%-20s%,10.0f%,10.0f\n", arr[i].name, arr[i].sum, arr[i].commission());
        }
    }
}
