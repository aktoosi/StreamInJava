import java.math.BigInteger;
import java.rmi.server.UnicastRemoteObject;
import java.util.stream.Stream;

public class StreamUtility {
    public static void main(String[] args) {
        /**
         * initerate hamn kare for ra anjam midahad
         * param 1: 0L==>meghdar avalie
         * param 2: aLong -> aLong<1000 ==> in mesle hasNext hast engar hamash check mikoneh mitoneh edameh bede ya na ? mesle shrte if hast
         * param 3: aLong -> aLong+10 ===> on karii ke mikhad ba data anjam bedeh (UnaryOperation : input==output )
         */

        System.out.println("******************sampleOne****************");

        Stream.iterate(0L, aLong -> aLong < 1000, aLong -> aLong + 10)
                .filter(aLong -> aLong % 2 == 0)
                .forEach(System.out::println);
        /**
         * ijad mahdodyat ha bar roye stream ha
         */
        System.out.println("******************sampleTwo****************");

        Stream.iterate(BigInteger.ONE, BigInteger.TWO::multiply).limit(10).skip(5).forEach(System.out::println);

        /**
         * generate yek stream
         * One Point ===> dif beyn generate va iterate chist ?
         *       public static<T> Stream<T> generate(Supplier<? extends T> s)
         *       public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
         *
         *         *vorodi ha ro deghat konid *
         */
        System.out.println("******************sampleThree****************");

        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        /**
         * tabdil yek arraye be stream (impl of ro negha khdet mifahmi)
         */
        System.out.println("******************sampleFour****************");
        Stream.of(1, 23, 432, 6543, 98).sorted().forEachOrdered(System.out::println);
    }
}
