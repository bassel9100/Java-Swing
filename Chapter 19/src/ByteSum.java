public class ByteSum {
    public static void writeSum(byte c){
        int i = c & 0x0f;
        int j = ((c & 0x0f >>> 4)) & 0x0f;
        System.out.println(i + j);
    }
}
