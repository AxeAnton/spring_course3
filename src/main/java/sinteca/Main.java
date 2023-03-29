package sinteca;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("temp.txt");

        ArrayList<String> arrayListTxt = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                arrayListTxt.add(br.readLine());
            }
        }
        System.out.println("arrayListTxt - " + arrayListTxt);

        CreatArrays creatArrays = new CreatArrays();
        creatArrays.creatArr(arrayListTxt, 4, 2);
        System.out.println(creatArrays);

        CompareArrays compareArrays = new CompareArrays();
        compareArrays.compArrays(creatArrays, arrayListTxt);

    }

}

