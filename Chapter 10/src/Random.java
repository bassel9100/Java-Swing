public class Random {
    public static void main(String[] args){
        Fordon[] arr = new Fordon[100];

        arr[0] = new PersonBil("XUT203", 4);
        arr[1] = new LastBil("BBF323", 48294);
        arr[2] = new PersonBil("FFF32D", 8);
        arr[3] = null;
        arr[4] = new Cykel(3);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null)
                arr[i].skriv();
            System.out.println();
        }
    }
}
