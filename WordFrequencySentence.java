package Package3.Map;

import java.util.*;

public class WordFrequencySentence {

    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> map = new HashMap<>();

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
