
import java.util.List;

public class StreamInList {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);  in java 8 :(
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer sum = numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number)
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
