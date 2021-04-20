package Java_3.Lesson_1.HomeWork_1.ArrayToListAndChange;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAndChange<T> {

    final T[] obj;

    public ArrayListAndChange(T[] obj) {
        this.obj = obj;
    }

    public ArrayList<T> createArrayList() {
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(obj));
        System.out.println(arrayList);
        return arrayList;
    }

    public void changePositionOfElementsInArray() {
        T x = obj[0];
        obj[0] = obj[1];
        obj[1] = x;
        System.out.println(Arrays.toString(obj));
    }
}
