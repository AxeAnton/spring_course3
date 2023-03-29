package sinteca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {

        File file = new File("temp.txt");

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("файл существует");
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("стол для шитья\n");
        fileWriter.write("клей\n");
        fileWriter.write("камень\n");
        fileWriter.write("нить\n");
        fileWriter.flush();
//        fileWriter.close();

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("шитье");
        bufferedWriter.newLine();
        bufferedWriter.write("клей для бумаги");
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
