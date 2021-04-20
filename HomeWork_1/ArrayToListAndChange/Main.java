package Java_3.Lesson_1.HomeWork_1.ArrayToListAndChange;

public class Main {

    public static void main(String[] args) {

        ArrayListAndChange<Double> arr1 = new ArrayListAndChange<>(new Double[]{1.2, 3.4});
        ArrayListAndChange<Integer> arr2 = new ArrayListAndChange<>(new Integer[]{5, 6});

        System.out.println("\nМассивы");
        arr1.createArrayList();
        arr2.createArrayList();

        System.out.println("\nПоменяли элементы местами");
        arr1.changePositionOfElementsInArray();
        arr2.changePositionOfElementsInArray();
    }
}
