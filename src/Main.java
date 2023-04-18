//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
//Пример ввода:
//1 2 1 2 -1 1 3 1 3 -1 0
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int x = sum(array);
        System.out.println(x);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}