package Package1.Generics;

import java.util.*;

abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }
}

class WarehouseSystem {
    public static void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getClass().getSimpleName());
        }
    }
}
