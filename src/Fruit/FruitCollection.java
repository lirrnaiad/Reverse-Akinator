package Fruit;

import java.util.ArrayList;
import java.util.Random;
public class FruitCollection {
    private ArrayList<Fruit> fruits;

    public FruitCollection() {
        this.fruits = new ArrayList<>();
    }

    public void populateFruitCollection() {
        fruits.add(new Apple());
        fruits.add(new Banana());
        fruits.add(new Cherry());
    }

    public Fruit getRandomFruit() {
        Random rand = new Random();
        int n = rand.nextInt(0, fruits.size());
        return fruits.get(n);
    }
}
