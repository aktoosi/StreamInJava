import java.util.List;

public class WithoutStream {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);  in java 8 :(
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 1) {
                int square = n * n;
                sum +=square;
            }
        }
        System.out.println(sum);
    }
}
