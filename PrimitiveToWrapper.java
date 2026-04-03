import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        Integer obj = Integer.valueOf(number);

        System.out.println("Primitive value: " + number);
        System.out.println("Wrapper object: " + obj);
    }
}

