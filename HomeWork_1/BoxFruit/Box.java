package Java_3.Lesson_1.HomeWork_1.BoxFruit;

import java.util.ArrayList;

public class Box<F extends Fruit> {

    // Для хранения фруктов внутри коробки можете использовать ArrayList;

    private ArrayList<F> fruits;
    private float totalWeight;

    public Box() {
        fruits = new ArrayList<>();
    }

    // Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);

    public float getTotalWeight() {
        if (fruits.size() != 0) {
            int i = 0;
            totalWeight = fruits.size() * fruits.get(i).getWeight();
        } else {
            System.out.println("We don't have fruits in a box (Коробка пуста) ");
        }
        return totalWeight;
    }

    // Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами)

    public boolean compare(Box<?> otherBox) {
        return getTotalWeight() == otherBox.getTotalWeight();
    }

    public void replaceAllFruitsToOtherBox(Box<F> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(F fruitToAdd) {
        fruits.add(fruitToAdd);
    }
}
