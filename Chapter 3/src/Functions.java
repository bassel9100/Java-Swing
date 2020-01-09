public class Functions {
    
    public static double median(int x, int y){
        return (x + y) / 2;
    }

    public static double quadSum(int x, int y){
        return (x * x) + (y * y);
    }

    public static boolean sharedFactor(int x, int y){
        int k = 2;
        while(k <= x && k <= y){
            if(x % k == 0 && y % k ==0)
                return true;
        }  return false;
    }
}