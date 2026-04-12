package Package3.Map;

import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC1", 5000.0);
        accounts.put("ACC2", 12000.0);
        accounts.put("ACC3", 8000.0);
        accounts.put("ACC4", 15000.0);
        accounts.put("ACC5", 3000.0);

        String acc = "ACC1";
        accounts.put(acc, accounts.get(acc) + 2000);

        double withdraw = 9000;
        if (accounts.get(acc) >= withdraw) {
            accounts.put(acc, accounts.get(acc) - withdraw);
        } else {
            System.out.println("Insufficient balance!");
        }

        List<Map.Entry<String, Double>> list =
                new ArrayList<>(accounts.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\nAccounts (Sorted by Balance):");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
