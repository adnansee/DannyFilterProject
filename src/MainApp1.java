import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp1 {
    public static void main(String[] args) throws IOException {

        Filter2Code f1 = new Filter2Code();
        String idPath = "C:\\Users\\adnan\\Desktop\\JavaExcercises\\dannyA.xml";
        f1.loadidNumnerArray(idPath);

        String filePath ="C:\\Users\\adnan\\Desktop\\JavaExcercises\\Dannyfull2.xml";
        f1.replacePlease(filePath);
        String outputFile ="C:\\Users\\adnan\\Desktop\\JavaExcercises\\outputA.txt";
        f1.writeNewFile(outputFile);

    }
}
