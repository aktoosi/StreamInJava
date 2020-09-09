import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class OperationStream {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Iterator<Integer> iterator = numbers.iterator();
        iterator.forEachRemaining(number-> System.out.println(number.longValue()));
        System.out.println("#######");
        IntStream.rangeClosed(0,10).iterator().forEachRemaining((IntConsumer) value -> System.out.println(value));
    }
}
