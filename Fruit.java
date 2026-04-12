package Package1.Generics;

class Fruit {}

class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    private T fruit;

    public void add(T fruit) {
        this.fruit = fruit;
    }

    public void display() {
        System.out.println("Fruit stored: " + fruit.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();

    }
}
