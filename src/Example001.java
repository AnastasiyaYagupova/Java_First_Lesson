import java.util.Arrays;

public class Example001 {
    public static void main(String[] args){
    String s = new String("the sky is blue");
    reverseWord(s);
    }
    public static void reverseWord(String s){
        String[] array1 = s.split(" ");
        String[] array2 = new String[array1.length];
        int j = 0;
        for (int i = array1.length-1; i >= 0 ; i--) {
            array2[j] = array1[i];
            j++;
        }
        System.out.println(Arrays.toString(array2));
    }
}
