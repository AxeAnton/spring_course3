package sinteca;

import java.util.ArrayList;

public class CreatArrays {

    ArrayList<String> arrayList1 = new ArrayList<>();
    ArrayList<String> arrayList2 = new ArrayList<>();

    public void creatArr (ArrayList<String> stringArrayList, int x, int y) {

        for (int i = 0; i < (x); i++) {
            arrayList1.add(stringArrayList.get(i));
        }
        for (int i = x; i < (x + y); i++) {
            arrayList2.add(stringArrayList.get(i));
        }
    }

    public ArrayList<String> getArrayList1() {
        return arrayList1;
    }

    public ArrayList<String> getArrayList2() {
        return arrayList2;
    }

    @Override
    public String toString() {
        return "arrayList1 = " + arrayList1 + "\narrayList2 = " + arrayList2;
    }
}
