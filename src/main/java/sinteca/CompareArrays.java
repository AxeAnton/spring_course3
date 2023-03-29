package sinteca;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static sinteca.LevenshteinDistance.findSimilarity;

public class CompareArrays {

    public void compArrays(CreatArrays creatArrays, ArrayList<String> arrayListTxt) throws IOException {

        ArrayList<String> collectArrayList = new ArrayList<>();

        File file2 = new File("tempRes.txt");
        if (!file2.exists()) {
            file2.createNewFile();
        } else {
            file2.delete();
            file2.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file2, true);

        for (String value1 : creatArrays.getArrayList1()) {
            String[] words1 = value1.split(" ");
            for (String ward1 : words1) {
                for (String value2 : creatArrays.getArrayList2()) {
                    String[] words2 = value2.split(" ");
                    for (String ward2 : words2) {

                        double similarity = findSimilarity(ward1, ward2);

                        if (similarity > 0.5) {
                            fileWriter.write(value1 + " : " + value2 + System.lineSeparator());
                            System.out.println("Слово или фраза (" + value1 + ") или конкретно слово (" + ward1 + ") похоже на слово (" + ward2 + ") в слове или фразе (" + value2 + ")");

                            collectArrayList.add(value1);
                            collectArrayList.add(value2);
                        }
                    }
                }
            }
        }

        int count = 0;
        for (String valueFromArrayResult : arrayListTxt) {
            for (String valueFromCollectArrayList : collectArrayList) {

                if (valueFromArrayResult != valueFromCollectArrayList) {
                    count++;

                }
            }

            if (count == collectArrayList.size()) {
                fileWriter.write(valueFromArrayResult + " : ?" + System.lineSeparator());
                System.out.println(valueFromArrayResult + " :  НЕ совпадений по смыслу");
            }
            count = 0;
        }
            fileWriter.flush();
            fileWriter.close();

    }
}