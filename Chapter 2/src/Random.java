public class Random {
    public static void main(String[] args){
        time_point t1 = new time_point(11,59);
        time_point t2 = new time_point(14,30,03);

        t1.tick(120);
        t2.tick();

        System.out.println(t1);
        System.out.println(t2);
    }
}
