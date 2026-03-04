package com.gla.level3;

import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCard = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length)
            return null;

        String[][] result = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[index++];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();

        String[][] result = distribute(deck, players, cards);

        if (result == null) {
            System.out.println("Not enough cards!");
        } else {
            for (int i = 0; i < players; i++) {
                System.out.println("Player " + (i+1) + ":");
                for (int j = 0; j < cards; j++)
                    System.out.println(result[i][j]);
                System.out.println();
            }
        }

        sc.close();
    }
}
