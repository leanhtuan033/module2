package QuanLyBenhAn.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFile(String path) {

        List<String> stringList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(path);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static void writeFile(String path,
                                 List<String> stringList,
                                 boolean append) {

        try {
            FileWriter fileWriter =
                    new FileWriter(path, append);

            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
