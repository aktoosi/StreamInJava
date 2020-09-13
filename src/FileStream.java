import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/***
 * in class jahate namayesh ghabelyat haye stream dar read file mibashad
 */
public class FileStream {

    public static void main(String[] args) {
        FileStream.listFileTree();
    }

    public static void readFile(String filePath) {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            System.out.println("file not exist");
            return;
        }
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * estefadeh az stream ha barayeh namayesh list derakhtvarey file ha
     */
    public static void listFileTree() {

        Path dir = Paths.get("");
        System.out.println(dir.toAbsolutePath());
        try (Stream<Path> pathStream = Files.walk(dir)) {
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
