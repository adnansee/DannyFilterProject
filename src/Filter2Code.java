import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Filter2Code {

    private int idNumbers;
    public ArrayList<Integer> idNumberArray = new ArrayList<>();
    ArrayList<String> finalArr = new ArrayList<>();




    public void loadidNumnerArray(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
           idNumberArray.add(Integer.valueOf(scanner.nextLine()));
        }

        System.out.println(idNumberArray);
    }



    public void replacePlease(String path) throws IOException {

        File file1 = new File(path);

        System.out.println("---------");


        String st;
        boolean exists;
        for (Integer i : idNumberArray) {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                st = scanner.nextLine();
                exists = st.contains("<g id=\"" + i + "\"><path");
                if (exists) {
                    finalArr.add(st);
                }
            }
        }
        System.out.println((finalArr));
    }


    public void writeNewFile(String path1) throws IOException {
        FileWriter fw = new FileWriter(path1);
        fw.write(String.valueOf(finalArr));
        fw.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(path1));

        // Loop over the elements in the string array and write each line.
        for (String line : finalArr) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();

    }
}
