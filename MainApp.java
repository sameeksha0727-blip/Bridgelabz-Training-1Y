package question8;

import com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String[] args) {

        InterestCalculator calc = new InterestCalculator();

        double SI = calc.calculateSimpleInterest(10000, 5, 2);
        double CI = calc.calculateCompoundInterest(10000, 5, 2);

        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + CI);
    }
}

