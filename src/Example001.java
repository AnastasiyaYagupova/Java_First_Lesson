import java.util.Arrays;
import java.util.stream.Stream;

public class Example001 {
    public static void main(String[] args){
    String s = new String("the sky is blue");
    //reverseWord(s);
    //reverseWord2(s);
    reverseWord3(s);
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
    public static void reverseWord2(String s){
        String[] array = s.split(" ");
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i] + ' ');
        }
    }
    public static void reverseWord3(String s){
        String[] array = s.split(" ");
        Stream.Builder<String> str = Stream.builder();
        for (int i = array.length-1; i >=0; i--) {
        str.add(array[i]);
        }
        Stream<String> string = str.build();
        string.forEach(System.out::println);
    }
}
