package test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("rep1");
        arr1.add("rep2");
        arr1.add("rep3");
        arr1.add("rep4");
        arr1.add("rep5");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("rep4");
        arr2.add("rep5");
        arr2.add("rep3");

        int count = 0;
        for (String vol1 : arr1) {
            for (String vol2 : arr2) {

                if (vol1 != vol2) {
                   count++;
                }
            }
            System.out.println(count);
            if (count == arr2.size() )
                System.out.println("Отсутствует рез. - " + vol1);
            count = 0;
        }
    }
}
