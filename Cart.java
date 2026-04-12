package Package1.Generics;

import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");

        Cart<String> clothesCart = new Cart<>();
        clothesCart.addItem("Shirt");

        electronicsCart.displayItems();
        clothesCart.displayItems();
    }
}
