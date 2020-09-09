import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {
        public static void main(String[] args) {

        }

        public FileStream(String filePath){
            Path path = Paths.get(filePath);
            if(!Files.exists(path)){
                System.out.println("file not exist");
                return;
            }
            try(Stream<String> stream= Files.lines(path)){
                stream.forEach(System.out::println);
            }
                catch(IOException e){
                e.printStackTrace();
                }
        }

}
