public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class MainClass {
    public static void main(String[] args){
        Box <Number> obj2 = new Box<>();
        obj2.setValue(333333333333L);

        System.out.println(obj2.getValue());


    }

}
